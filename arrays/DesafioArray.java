package arrays;

import java.util.Scanner;

public class DesafioArray {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
				
		System.out.println("Digite a quantidade de notas que irá colocar: ");	
		int quantidadeDeNotas = entrada.nextInt();
		
		double[] notas = new double[quantidadeDeNotas];
		
		for(int i = 0; i < notas.length; i++) {
			System.out.print("Digite a nota " + (i + 1) + ":");
			
			notas[i] = entrada.nextDouble(); 
		}
		
		double total = 0;
		for(double nota : notas) {
			System.out.print( "["+ nota + "] ");
			
			
			
			
			
			
			
			
			
			
			
			
			total += nota;
		}
		
		
		double media = total / notas.length;
		
		System.out.println();
		
		System.out.println("A média do aluno é de : " + media);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		entrada.close();
	}
}
