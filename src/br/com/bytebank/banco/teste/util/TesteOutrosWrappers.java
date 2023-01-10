package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteOutrosWrappers {

	public static void main(String[] args) {

		Integer idadeRef = Integer.valueOf(29);// autoboxing
		System.out.println(idadeRef.doubleValue());// unboxing

		Double dRef = Double.valueOf(28.0);
		System.out.println(dRef.intValue());

		Boolean bRef = Boolean.FALSE;
		System.out.println(bRef.booleanValue());

		Number refNumero = Double.valueOf(22.3);
		System.out.println(refNumero.intValue());
		
		List<Number> lista = new ArrayList<>();
		lista.add(10);
		lista.add(refNumero);
		
		
	}

}
