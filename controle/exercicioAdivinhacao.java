package controle;

import java.util.Scanner;

public class exercicioAdivinhacao {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int i = 70;
		int chances = 10;
		System.out.println("Digite 0 para come�ar o jogo: ");
		 int numero = entrada.nextInt();
		 
		if (numero == 0) {
			
		
		
		while (!(numero == i)) {
			 System.out.println("\nDigite um n�mero de 1 a 100: ");
			numero = entrada.nextInt();
			 chances-- ;
			 
			 if (!(numero == i)) {
				 System.out.println("\nVoc� tem "+ chances + " chances restantes");}
			  
					 
				if(numero == i) {
				 System.out.println("\nParab�ns voc� acertou !!!"); 
		          break;}
			
				
			
				 
			if (numero > i) {
				 System.out.println("\nDica: \no n�mero digitado � maior do que o correto"); }
			  else
				 System.out.println("\nDica: \no n�mero digitado � menor do que o correto");
			
			  
			 if (chances == 0) {
				 System.out.println("Voc� perdeu");
				 break;}
			 }
		}
		 
		else
			System.out.println("\nInv�lido");
		 
		 
		 System.out.println("\nFim ");
		
		
		
		
		
		
		
				
				
				
				entrada.close();
		
		
		
		
		
	}
}
