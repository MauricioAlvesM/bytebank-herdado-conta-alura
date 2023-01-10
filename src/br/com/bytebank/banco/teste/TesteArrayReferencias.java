package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayReferencias {

	public static void main(String[] args) {

		Object[] referencias = new Object[5];

		ContaCorrente cc1 = new ContaCorrente(22, 11);
		referencias[0] = cc1;

		ContaPoupanca cc2 = new ContaPoupanca(22, 22);
		referencias[1] = cc2;
		
		Cliente cliente = new Cliente();
		referencias[2] = cliente;
		
		ContaPoupanca ref1 = (ContaPoupanca) referencias[1];
		System.out.println(ref1.getNumero());

		ContaPoupanca ref = (ContaPoupanca) referencias[1];//type cast
		System.out.println(cc1.toString());
		System.out.println(ref.toString());

	}

}
