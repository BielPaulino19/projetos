package controle;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Qual o ano ?");
		int ano = entrada.nextInt();
		
		if((ano % 4) == 0)
			System.out.println("� um ano bissexto !");
		
		else
			System.out.println("N�o � um ano bissexto !");
		
		
				
				
				
				entrada.close();
	}
}
