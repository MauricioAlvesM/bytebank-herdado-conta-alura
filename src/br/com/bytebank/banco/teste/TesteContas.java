package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.especial.ContaEspecial;
import br.com.bytebank.banco.modelo.*;

//br.com.bytebank.banco.teste.TesteContas 
public class TesteContas {

	public static void main(String[] args) throws SaldoInsuficienteException {
		// TODO Auto-generated method stub

		ContaCorrente contaCorrente = new ContaCorrente(1226, 333);
		contaCorrente.deposita(100);
		System.out.println("Saldo da conta corrente: " + contaCorrente.getSaldo());

		ContaPoupanca contaPoupanca = new ContaPoupanca(1336, 444);
		contaPoupanca.deposita(100);
		System.out.println("Saldo da conta poupanca: " + contaPoupanca.getSaldo());

		contaCorrente.transfere(10, contaPoupanca);
		System.out.println("Saldo da conta corrente: " + contaCorrente.getSaldo());
		System.out.println("Saldo da conta poupanca: " + contaPoupanca.getSaldo());

		contaCorrente.saca(10);
		System.out.println("Saldo da conta corrente: " + contaCorrente.getSaldo());

		ContaEspecial ce = new ContaEspecial(1, 20);
		ce.deposita(2);

	}

}
