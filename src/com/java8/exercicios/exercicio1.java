package com.java8.exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

import com.java8.base.Mocks;
import com.java8.base.Produto;

public class exercicio1 {
	public static void main (String[] args) {
		
		List<Produto> listaProduto = Mocks.produtos();	
		String primeiraMarca = "Marca 1";
		String segundaMarca = "Marca 2";
		Integer quantidadeEstoqueImprimir = 50;
		
		// A - Java 7
			List<String> novaLista = new ArrayList<>();
			for (Produto p : listaProduto) {
				novaLista.add(p.getNome());
			}
			for (String nome : novaLista) {
				System.out.println(nome);
			}
		// A - Java 8
			listaProduto.stream().map(Produto::getNome).forEach(System.out::println);
			
		//***********************************************************************************************	
		// B - Java 7
			Produto pp = listaProduto.get(10);
			if (pp != null) {
				System.out.println(pp.getNome());
			}
			
		// B - Java 8 
			Optional.ofNullable(listaProduto.get(10)).ifPresent(p -> System.out.println(p.getNome()));
			
			
		// C - Java 7
		Integer quantidade = 0;
		Double total = 0D;
		for (Produto p : listaProduto) {
			if (primeiraMarca.equals(p.getMarca())) {
				quantidade++;
				total += p.getPreco();
			}
		}
		if (quantidade > 0) {
			System.out.println(total/quantidade);
		} else {
			System.out.println(0);
		}
		
		// C - Java 8
		
		Double resposta = listaProduto.stream()
					.filter(p -> primeiraMarca.equals(p.getMarca()))
					.mapToDouble(Produto::getPreco)
					.average()
					.orElse(0);
		
		// C - Java 8 -> Respota detalhada
		
		Stream<Produto> streamProduto = listaProduto.stream();
		Stream<Produto> streamProdutoFiltrado = streamProduto.filter(p -> primeiraMarca.equals(p.getMarca()));
		DoubleStream doublePreco = streamProdutoFiltrado.mapToDouble(Produto::getPreco);
		OptionalDouble optionalDouble = doublePreco.average();
		Double media = optionalDouble.orElse(0D);
		
		// D - Java 7
		
		for (Produto p : listaProduto) {
			if (segundaMarca.equals(p.getMarca()) && quantidadeEstoqueImprimir.equals(p.getQtdEstoque())) {
				System.out.println(p.getNome());
			}
		}
		
		// D - Java 8
		
		listaProduto.stream()
		.filter(p -> p.getMarca().equals(segundaMarca) && quantidadeEstoqueImprimir.equals(p.getQtdEstoque()))
		.map(Produto::getNome)
		.forEach(System.out::println);
		
	}
}
