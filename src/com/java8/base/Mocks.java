package com.java8.base;

import java.util.ArrayList;
import java.util.List;

public class Mocks {
	public static List<Produto> produtos () {
		List<Produto> retorno = new ArrayList<>();
		Produto p1 = new Produto();
		p1.setMarca("Marca 1");
		p1.setNome("Produto 1");
		p1.setPreco(10.5D);
		p1.setQtdEstoque(5);
		
		Produto p2 = new Produto();
		p2.setMarca("Marca 1");
		p2.setNome("Produto 2");
		p2.setPreco(8.5D);
		p2.setQtdEstoque(2);
		
		Produto p3 = new Produto();
		p3.setMarca("Marca 2");
		p3.setNome("Produto 3");
		p3.setPreco(4.5D);
		p3.setQtdEstoque(null);
		
		Produto p4 = new Produto();
		p4.setMarca("Marca 2");
		p4.setNome("Produto 4");
		p4.setPreco(1.0D);
		p4.setQtdEstoque(50);
		
		retorno.add(p1);
		retorno.add(p2);
		retorno.add(p3);
		retorno.add(p4);

		
		
		return retorno;
	}
}
