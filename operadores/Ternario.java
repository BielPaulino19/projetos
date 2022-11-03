package operadores;

public class Ternario {

public static void main(String[] args) {
	
	double media = 5.6;
	String resultadoParcial = media >= 5.0 ? "em recuperação" : "reprovado";
	String resultadoFinal = media >= 7.0 ? "Aprovado" : resultadoParcial;
	 
	System.out.printf("O aluno está : %s ", resultadoFinal);
	
	double nota = 7.3;
	boolean bomComportamento = false;
	String temDesconto = nota >= 7.0 && bomComportamento ? "Sim" : "Não";
	 
	System.out.println("\nO aluno tem desconto ? " + temDesconto);
	
	
	
	
}	
	
	
	
	
}
