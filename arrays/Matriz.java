package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
				
		System.out.println("Quantos alunos ? ");		
		int qtdeDeAlunos = entrada.nextInt();
		
		System.out.println("Quantidade de notas por aluno :");
		int qtdeDeNotas = entrada.nextInt();
		
		double[][] NotasDaTurma = new double[qtdeDeAlunos][qtdeDeNotas];
		
		double total = 0;
		
		//a=alunos  n=nota
		for(int a = 0; a < NotasDaTurma.length; a++) {
			for(int n = 0; n < NotasDaTurma.length; n++) {
				System.out.printf("Informe a nota %d do aluno %d: ", a + 1, n + 1);
				NotasDaTurma[a][n] = entrada.nextDouble();
				total += NotasDaTurma[a][n]; 
				
			   }
			}
		 double media = total / (qtdeDeAlunos * qtdeDeNotas);
		 System.out.println("Média da turma é: " + media);
		 
		 for(double[] notasDoAluno : NotasDaTurma ) {
			 System.out.println(Arrays.toString(notasDoAluno));
			 
		 }
				 
		
	entrada.close();
	}
}
