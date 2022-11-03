package controle;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Qual o ano ?");
		int ano = entrada.nextInt();
		
		if((ano % 4) == 0)
			System.out.println("É um ano bissexto !");
		
		else
			System.out.println("Não é um ano bissexto !");
		
		
				
				
				
				entrada.close();
	}
}
