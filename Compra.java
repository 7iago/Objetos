package oo.composicao;

import java.util.ArrayList;


public class Compra {
	String Cliente;
	ArrayList<Item> itens =  new ArrayList<Item>();
	
	void adicionarItem(Item item) {
		itens.add(item);
		item.compra = this;
	}
	
	double obterValorTotal(){
		double total = 0;
		for(Item item:itens) {
			total += item.quantidade * item.preco;
		}
		return total;
	}
	
	public void listarItens(){
		for(Item it:itens) {
			System.out.println(it);
			}
	}
	
}
