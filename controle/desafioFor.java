package controle;

public class desafioFor {

	public static void main(String[] args) {
		
		String valor = "#";
		for(int i = 1; i <=5 ; i++) {
			System.out.println(valor);
			valor += "#";
		}
		
		//Vers�o do desafio
		// N�o pode usar valor num�rico pra controlar o la�o!
		
		String a = "$";
		for(; !(a.equals("$$$$$$")); a += "$" ) { 
			System.out.println(a);  
		}
		
		
		
		
		
		
		
		
		
		
	}
}
