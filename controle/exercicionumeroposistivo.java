package controle;

import java.util.Scanner;

public class exercicionumeroposistivo {

	public static void main(String[] args) {
		
	  Scanner entrada = new Scanner(System.in);
	  
	  double numero = 0;
	  double soma = 0;
	  
	  while (numero >= 0 ) {
      	  System.out.println("\nDigite um número positivo ou negativo para parar :");
	  numero = entrada.nextDouble();
		
	  if (numero < 0)
		  break;
	  
	  else
	  
	  soma += numero;
	  System.out.println("\nA soma é " + soma);}
	  
	  System.out.println("\nO total é: " + soma);
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
			
			
			
			entrada.close();
		
		
		
		
		
		
	}
}
