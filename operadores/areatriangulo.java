package operadores;

import java.util.Scanner;

public class areatriangulo {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o valor da base: ");
		double base = entrada.nextDouble();
		
		System.out.println("Digite a altura: ");
		double altura = entrada.nextDouble();
		
		double area = (base * altura) / 2;
		
		System.out.printf("A área do triângulo é igual a %s m^2", area);
		
		entrada.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
}
