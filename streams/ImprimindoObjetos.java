package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {

	public static void main(String[] args) {
		
		List<String> aprovados = Arrays.asList("Lu", "Gui","Luca", "Ana");
		
		System.out.println("Usando foreach...");
		for(String nome: aprovados) {
			System.out.println(nome);
		}
		//Repeti��o
		System.out.println("\nUsando Interator...");
		Iterator<String> iterador = aprovados.iterator();
		while(iterador.hasNext()) {
			System.out.println(iterador.next());
		}
		
		System.out.println("\nUsando Stream...");
		Stream<String> stream = aprovados.stream();
		stream.forEach(System.out::println);
	}
}
