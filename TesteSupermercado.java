package br.fiap.app;

import br.fiap.model.CaixaSupermercado;

public class TesteSupermercado {

	public static void main(String[] args) {
		CaixaSupermercado pdv = new CaixaSupermercado("97456973569");

		pdv.adiciona(3, 9.75, "Óleo", "alimento");
		pdv.adiciona(4, 8.50, "Feijão", "alimento");
		pdv.adiciona(2, 24.99, "Arroz", "alimento");
		pdv.adiciona(4, 4.68, "Sabonete", "higiene");
		pdv.adiciona(12, 5.50, "Heineken", "bebida");
		
		System.out.println(pdv.getCupomFiscal());
		System.out.println("Impostos "+pdv.getImposto());
		System.out.println("Total "+pdv.getTotal());
	}

}
