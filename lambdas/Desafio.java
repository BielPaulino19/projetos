package lambdas;

import java.util.Locale;
import java.util.function.Function;
import java.util.function.UnaryOperator;


public class Desafio {

	public static void main(String[] args) {
		
		Produto p = new Produto("iPad", 3235.89, 0.13);
		
		Function<Produto, Double> precoFinal = prod ->
		 prod.preco * (1 - prod.desconto);
		 
		 
		 UnaryOperator<Double> imposto = prod2 ->
		 prod2 >= 2500 ? prod2 * 1.085 : prod2;
		
		 UnaryOperator<Double> frete = prod3 ->
		prod3 >= 3000 ?  (prod3 + 100) : (prod3 + 50); 
		
		UnaryOperator<Double> arrendondar = 
				prod4 -> Double.parseDouble(String.format(Locale.ENGLISH,"%.2f", prod4));
				
		Function<Double, String> formatar =
				prod5 -> ("R$" + prod5).replace(".", ",");
		
		
		String resultadoFinal = precoFinal
				.andThen(imposto)
				.andThen(frete)
				.andThen(arrendondar)
				.andThen(formatar)
				.apply(p);
		
		
		
		System.out.println(resultadoFinal);
		
		
		
		
	}
}
