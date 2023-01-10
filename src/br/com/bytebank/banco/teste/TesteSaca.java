package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.*;


public class TesteSaca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta conta = new ContaCorrente(122,222);
		conta.deposita(200);
		
		try {
			conta.saca(220);
		} catch (SaldoInsuficienteException ex) {
			System.out.println("Ex " + ex.getMessage());
		}
		System.out.println(conta.getSaldo());
	}

}
