package com.java8.exercicios;

public class exercicio2 {
	public static void main(String[] args) {
		
		Float salario = 10000F;
		Float aliquota = 0.09F;
		Float inss = 0.11F;
		Float outros = 500.30F;

		Float resultado = imprimeSalario(salario, s -> s * (1F - aliquota - inss) - outros);
		System.out.printf("%.2f", resultado);
	}
	
	public static Float imprimeSalario (Float salario, SalarioLiquido sl) {
		return sl.calculaSalario(salario);
	}
	
}
