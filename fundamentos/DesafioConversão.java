package fundamentos;

import java.util.Scanner;

public class DesafioConversão {

	public static void main(String[] args) {
		
		Scanner valor = new Scanner(System.in);
		
		System.out.print("Digite seu primeiro salário:");
		String salario1 = valor.next().replace(",", "."); 
		
		System.out.print("\nDigite seu segundo salário: ");
		String salario2 = valor.next().replace(",", ".");
		
		System.out.print("\nDigite seu terceiro salário: ");
		String salario3= valor.next().replace(",", ".");
		
		
		double s1 = Double.parseDouble(salario1);
		double s2 = Double.parseDouble(salario2);
		double s3 = Double.parseDouble(salario3); 
		
		double media = (s1 + s2 + s3) / 3;
		
		System.out.println("\nA média do seu salário é: "+ media);   
		
		valor.close(); 
		
		
		
		
		
		
		
		
		
	}
}
