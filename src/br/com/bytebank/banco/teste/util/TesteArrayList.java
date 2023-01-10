package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayList {

	public static void main(String[] args) {

		// ArrayList lista = new ArrayList();

		// so pode ter referencias do tipo conta
		// Generics

		// List<Conta> lista = new Vector<Conta>();thread safe
		// List<Conta> lista = new List<Conta>();

		List<Conta> lista = new ArrayList<Conta>();// 

		Conta cc = new ContaCorrente(22, 11);
		lista.add(cc);

		Conta cc2 = new ContaPoupanca(22, 22);
		lista.add(cc2);

		System.out.println("Tamanho " + lista.size());

		Conta ref = /* (Conta) */ lista.get(0);
		System.out.println(ref);

		lista.remove(0);
		System.out.println("Tamanho " + lista.size());

		Conta cc3 = new ContaCorrente(22, 311);
		lista.add(cc3);

		Conta cc4 = new ContaPoupanca(22, 322);
		lista.add(cc4);

		for (int i = 0; i < lista.size(); i++) {
			Conta oRef = (Conta) lista.get(i);
			System.out.println(oRef);
		}

		System.out.println("------------------");

		for (Conta conta : lista) {
			System.out.println(conta);
		}

	}

}
