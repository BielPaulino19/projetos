package Desafio;

public class Jantar {

	public static void main(String[] args) {
		
		Pessoa P = new Pessoa("Gabriel" , 99.8);
		
		Comida b1 = new Comida("Arroz", 0.180);
		Comida b2 = new Comida("Feijão", 0.300);
		
		
		System.out.println(P.apresentar());
		P.comer(b1);
		
		System.out.println(P.apresentar());
		P.comer(b2);
		
		System.out.println(P.apresentar());
		
		
		
	}
}
