package com.java8.aula;

import java.util.List;

import com.java8.base.Mocks;
import com.java8.base.Produto;

public class ForEachMethodReference {
	public static void main (String[] args) {
		
		List<Produto> listaProduto = Mocks.produtos();
		
		
		for (Produto prod : listaProduto) {
			prod.imprimeNome();
		}

		listaProduto.forEach(Produto::imprimeNome);

	}
}