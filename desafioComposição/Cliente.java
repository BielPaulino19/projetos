package desafioComposi��o;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

	String nome;
	
	List<Compra> compras = new ArrayList<Compra>();
	
   double obterValorTotal() {
	  double  total = 0;
	   for (Compra compra: compras) {
		   total += compra.obterValorTotal(); 
	   }
	   return total;
   }



}
