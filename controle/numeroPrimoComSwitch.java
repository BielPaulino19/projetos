package controle;

import java.util.Scanner;

public class numeroPrimoComSwitch {

	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um n�mero :");
		int numero = entrada.nextInt();
		
		 
		
		int contadorDeDivisores = 0;
		
		for ( int i = 2; i < numero; i++) {
			if (numero % i == 0) {
				contadorDeDivisores++;
			}
		}
		switch (contadorDeDivisores) {
		case 0:
			System.out.println("\nO n�mero "+ numero +" � primo");
			break;
		default:
			System.out.printf("\nO n�mero %s n�o � primo ",numero);
		}
				
				
				
		
		
		
		
		
		
		
		
		
		entrada.close();
	}
}
