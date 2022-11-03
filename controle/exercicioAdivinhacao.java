package controle;

import java.util.Scanner;

public class exercicioAdivinhacao {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int i = 70;
		int chances = 10;
		System.out.println("Digite 0 para começar o jogo: ");
		 int numero = entrada.nextInt();
		 
		if (numero == 0) {
			
		
		
		while (!(numero == i)) {
			 System.out.println("\nDigite um número de 1 a 100: ");
			numero = entrada.nextInt();
			 chances-- ;
			 
			 if (!(numero == i)) {
				 System.out.println("\nVocê tem "+ chances + " chances restantes");}
			  
					 
				if(numero == i) {
				 System.out.println("\nParabéns você acertou !!!"); 
		          break;}
			
				
			
				 
			if (numero > i) {
				 System.out.println("\nDica: \no número digitado é maior do que o correto"); }
			  else
				 System.out.println("\nDica: \no número digitado é menor do que o correto");
			
			  
			 if (chances == 0) {
				 System.out.println("Você perdeu");
				 break;}
			 }
		}
		 
		else
			System.out.println("\nInválido");
		 
		 
		 System.out.println("\nFim ");
		
		
		
		
		
		
		
				
				
				
				entrada.close();
		
		
		
		
		
	}
}
