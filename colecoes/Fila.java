package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		
		Queue<String> fila = new LinkedList<>();
		
		//Offer e add-> adicionam elementos na fila
		//Diferen�a � o comportamento quando a fila est� cheia!
		fila.add("Ana");
		fila.offer("Bia");
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafael");
		fila.offer("Gui");
		
		// Peek e Element -> obter o pr�ximo elementos
		//da fila (sem remover)
		
		//Diferen�a � o comportamento ocoore
		//quando a fila est� vazia!
		System.out.println(fila.peek());
		System.out.println(fila.peek());
		System.out.println(fila.element());
		System.out.println(fila.element());
		
		//fila.size()
		//fila.clear()
		//fila.isEmpty()
		
		//Poll e Remove -> obter o pr�ximo elemento
		//da fila e remove!
		
		//Diferen�a � o comportamento ocorre
		//quando a fila est� vazia!
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
