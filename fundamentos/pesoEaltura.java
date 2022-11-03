package fundamentos;

import java.util.Scanner;

public class pesoEaltura {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite sua altura: ");
		double altura = entrada.nextDouble();
		
		System.out.println("\n\nDigite seu peso: ");
		double peso = entrada.nextDouble();
		
		double imc = peso / (altura * altura);
		
		System.out.printf("O imc é igual a : %.3f%n", imc);
		
		entrada.close();
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

}
