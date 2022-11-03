package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		
		Queue<String> fila = new LinkedList<>();
		
		//Offer e add-> adicionam elementos na fila
		//Diferença é o comportamento quando a fila está cheia!
		fila.add("Ana");
		fila.offer("Bia");
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafael");
		fila.offer("Gui");
		
		// Peek e Element -> obter o próximo elementos
		//da fila (sem remover)
		
		//Diferença é o comportamento ocoore
		//quando a fila está vazia!
		System.out.println(fila.peek());
		System.out.println(fila.peek());
		System.out.println(fila.element());
		System.out.println(fila.element());
		
		//fila.size()
		//fila.clear()
		//fila.isEmpty()
		
		//Poll e Remove -> obter o próximo elemento
		//da fila e remove!
		
		//Diferença é o comportamento ocorre
		//quando a fila está vazia!
		System.out.println(fila.poll());//retorna false
		System.out.println(fila.remove());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.remove());
		
		//fila.contains(...)
	}
}
