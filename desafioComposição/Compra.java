package desafioComposição;

import java.util.ArrayList;
import java.util.List;

public class Compra {

	List<Item> intens = new ArrayList<Item>();
	
	double obterValorTotal() {
		double total = 0;
		
		for(Item item: intens ) {
			total += item.quantidade * item.produto.preco; 
		}
		return total;
	}
	
	void adicionarItem (String nome, double preco, int qtde) {
		//var produto = new Produto(nome, preco);
		this.intens.add(new Item(qtde, new Produto(nome,preco)));
	}
	
	
}
