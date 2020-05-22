package com.java8.aula;

import java.util.Arrays;
import java.util.List;

public class Stream {
	public static void main (String [] args ) {
		
		List<String> palavras = Arrays.asList("asdasd", "qweqwrqwe", "asdasdasdas", "", "asdasdaasdasdas", "asdasda", "");
		
		Long quantidade = 0L;
		for (String palavra : palavras) {
			if (palavra.isBlank()) {
				quantidade++;
			}
		}
		imprimir(quantidade);
		
		imprimir(palavras.stream().filter(String::isBlank).count());
		
	}
	
	public static void imprimir (Long str) {
		System.out.println(str);
	}
}
