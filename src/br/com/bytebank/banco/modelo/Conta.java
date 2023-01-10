package br.com.bytebank.banco.modelo;

import java.io.Serializable;

/**
 * 
 * @author MauricioAlvesM
 *
 */

public abstract class Conta extends Object implements Comparable<Conta>, Serializable {

	protected double saldo;
	private int numero;
	private int agencia;
	private transient Cliente titular;
	private static int total;

	public Conta(int agencia, int numero) {
		// System.out.println("Estou criando uma conta");

		Conta.total++;
		// System.out.println("O total de contas eh: " + Conta.total);
		// System.out.println("Numero da conta: " + numero);
		this.numero = numero;
		// System.out.println("Numero da agencia: " + agencia);
		this.agencia = agencia;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public abstract void deposita(double valor);

	/**
	 * Valor precisa ser maior do que o saldo
	 * 
	 * @param valor
	 * @throws SaldoInsuficienteException
	 */

	public void saca(double valor) throws SaldoInsuficienteException {

		if (this.saldo < valor) {
			throw new SaldoInsuficienteException("Seu saldo eh: " + this.saldo + ", Valor a sacar: " + valor);
		}
		this.saldo -= valor;
	}

	public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
		this.saca(valor);
		destino.deposita(valor);

	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("Nao pode valor menor que 0");
		} else {
			this.numero = numero;
		}
	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("nao pode valor menor que 0");
		} else {
			this.agencia = agencia;
		}
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public Cliente getTitular() {
		return this.titular;
	}

	public static int getTotal() {
		return Conta.total;
	}

	@Override
	public boolean equals(Object ref) {

		Conta referenciaComCast = (Conta) ref;

		if (this.agencia != referenciaComCast.agencia) {
			return false;
		}

		if (this.numero != referenciaComCast.numero) {
			return false;
		}

		return true;
	}

	@Override
	public int compareTo(Conta outra) {
		return Double.compare(this.saldo, outra.saldo);
	}

	@Override
	public String toString() {
		return "Numero: " + this.numero + ", Agencia: " + this.agencia + ", Saldo: " + this.saldo;
	}

}
