package operadores;

import java.util.Scanner;

public class equacao2grau {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o valor de a : ");
		double a = entrada.nextDouble();
		
		
		System.out.println("Digite o valor de b : ");
		double b = entrada.nextDouble();
		
		
		System.out.println("Digite o valor de c : ");
		double c = entrada.nextDouble();
		
		System.out.printf("Sua equação é : %sx² + %sx + %s = 0",a ,b ,c);
		
		double delta = (double)Math.pow(b, 2) - (4 * a * c);
		double raiz1 = (-b - (double)Math.sqrt(delta)) / 2 * a;
		double raiz2 = (-b + (double)Math.sqrt(delta)) / 2 * a;
		
		System.out.printf("\nO delta é igual a %s : "
				+ "\nX1 é : %s"
				+ "\nX2 é : %s",delta, raiz1, raiz2 );
		
		entrada.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
