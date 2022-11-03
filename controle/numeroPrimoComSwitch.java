package controle;

import java.util.Scanner;

public class numeroPrimoComSwitch {

	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um número :");
		int numero = entrada.nextInt();
		
		 
		
		int contadorDeDivisores = 0;
		
		for ( int i = 2; i < numero; i++) {
			if (numero % i == 0) {
				contadorDeDivisores++;
			}
		}
		switch (contadorDeDivisores) {
		case 0:
			System.out.println("\nO número "+ numero +" é primo");
			break;
		default:
			System.out.printf("\nO número %s não é primo ",numero);
		}
				
				
				
		
		
		
		
		
		
		
		
		
		entrada.close();
	}
}
