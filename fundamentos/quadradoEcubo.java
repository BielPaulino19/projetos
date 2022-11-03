package fundamentos;

import java.util.Scanner;

public class quadradoEcubo {

	public static void main(String[] args) {
	
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("Digite um valor : ");
	double valor1 = entrada.nextDouble();
	
		int valor2 = (int) Math.pow(valor1, 2);
		int valor3 = (int) Math.pow(valor1, 3);
		
		System.out.printf("O quadrado de %s é : %s "
				+ "\n\n e o seu cubo é: %s ", valor1, valor2, valor3);
		
		entrada.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
}
