package controle;

import java.util.Scanner;

public class desafioDiaDaSemana {

	public static void main(String[] args) {
		// domingo -> 1
		// quarta -> 4
		// ter�a -> 3
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite um dia da semana :");
		String dia = entrada.next();
		
		
		
		
		if (dia.equalsIgnoreCase("domingo"))
			System.out.println(1); 
		
		else if ("segunda".equalsIgnoreCase(dia))
			System.out.println("2");
		
		else if ("ter�a".equalsIgnoreCase(dia)
				|| "terca".equalsIgnoreCase(dia))
			System.out.println("3");
		
		else if ("quarta".equalsIgnoreCase(dia))
			System.out.println("4");
		
		else if (dia.equalsIgnoreCase("quinta"))
			System.out.println("5");
		
		else if (dia.equalsIgnoreCase("sexta"))
			System.out.println("6");
		
		else if  ("s�bado".equalsIgnoreCase(dia)
				|| "sabado".equalsIgnoreCase(dia))
			System.out.println("7");
		
		else
			System.out.println("Inv�lido"); 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		entrada.close();
		
		
		
		
		
		
		
		
		
		
		
	}
}
