package fundamentos;

import java.util.Scanner;

public class DesafioConvers�o {

	public static void main(String[] args) {
		
		Scanner valor = new Scanner(System.in);
		
		System.out.print("Digite seu primeiro sal�rio:");
		String salario1 = valor.next().replace(",", "."); 
		
		System.out.print("\nDigite seu segundo sal�rio: ");
		String salario2 = valor.next().replace(",", ".");
		
		System.out.print("\nDigite seu terceiro sal�rio: ");
		String salario3= valor.next().replace(",", ".");
		
		
		double s1 = Double.parseDouble(salario1);
		double s2 = Double.parseDouble(salario2);
		double s3 = Double.parseDouble(salario3); 
		
		double media = (s1 + s2 + s3) / 3;
		
		System.out.println("\nA m�dia do seu sal�rio �: "+ media);   
		
		valor.close(); 
		
		
		
		
		
		
		
		
		
	}
}
