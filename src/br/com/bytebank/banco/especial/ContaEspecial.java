package br.com.bytebank.banco.especial;

import br.com.bytebank.banco.modelo.Conta;

public class ContaEspecial extends Conta{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ContaEspecial(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public void deposita(double valor) {
		// TODO Auto-generated method stub
		super.saldo += valor;
	}
	
	
}
