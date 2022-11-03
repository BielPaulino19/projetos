package operadores;

public class DesafiosLogicos {

	public static void main(String[] args) {
		//Trabalho na terça (V ou F)
		//Trabalho na quinta (V ou F)
		
		boolean trabalho1 = true;
		boolean trabalho2 = true;
		
		boolean comprouaTV50 = trabalho1 && trabalho2; 
		boolean comprouaTV32 = trabalho1 ^ trabalho2;
		boolean sorvete = trabalho1 || trabalho2;
		boolean maisSaudavel = !sorvete;
		
		System.out.println("Comprou a TV 50\"" + comprouaTV50);
		System.out.println("Comprou a TV 30\"?" + comprouaTV32);
		System.out.println("Comprou sorvete ?" + sorvete);
		System.out.println("Ficou mais saudavel ?" + maisSaudavel);
          
         
		
		
	}
}
