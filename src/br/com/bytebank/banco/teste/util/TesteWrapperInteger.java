package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {

	public static void main(String[] args) {

		int idade = 29;// Integer
		Integer idadeRef = Integer.valueOf(29);// autoboxing
		System.out.println(idadeRef.doubleValue());// unboxing
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		System.out.println(Integer.SIZE);
		System.out.println(Integer.BYTES);
		
		int valor = idadeRef.intValue();

		String s = "1";

		int numero = Integer.parseInt(s);
		System.out.println(numero);

		List<Integer> numeros = new ArrayList<Integer>();
		numeros.add(idade);// Autoboxing, transformacao
							// de tipo primitivo para object
	}

}
