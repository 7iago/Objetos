package oo.composicao;

import java.text.DecimalFormat;

public class CompraTeste {

	public static void main(String[] args) {
		Compra compra1 = new Compra();
		compra1.Cliente = "Joao Pedro";
		compra1.adicionarItem(new Item("Caneta", 20, 7.45));
		compra1.adicionarItem(new Item("Borracha", 12, 3.89));
		compra1.adicionarItem(new Item("Caderno", 3, 18.79));
		
		System.out.println("Quantidade total de itens: " + compra1.itens.size());
		
		
		compra1.listarItens();
		System.out.println("Total: R$ " + new DecimalFormat("#,##0.00").format(compra1.obterValorTotal()));
		
	}

}
