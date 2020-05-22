package com.java8.aula;

import java.util.Arrays;
import java.util.List;

import com.java8.base.Predicado;

public class InterfaceFuncional {
	
	public static void main (String[] args) {
		List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		imprimirLista(lista, n -> n % 2 == 0);
		
	}
	
	private static void imprimirLista(List<Integer> lista, Predicado<Integer> p) {
		lista.forEach(i -> {
			if (p.test(i)) {
				System.out.println(i);
			}
		});
	}
	
}
