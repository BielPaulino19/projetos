package controle;

public class desafioFor {

	public static void main(String[] args) {
		
		String valor = "#";
		for(int i = 1; i <=5 ; i++) {
			System.out.println(valor);
			valor += "#";
		}
		
		//Versão do desafio
		// Não pode usar valor numérico pra controlar o laço!
		
		String a = "$";
		for(; !(a.equals("$$$$$$")); a += "$" ) { 
			System.out.println(a);  
		}
		
		
		
		
		
		
		
		
		
		
	}
}
