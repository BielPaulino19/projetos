package fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		
	 //Informações do funcionario
		
		// Tipos numéricos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_134_845_223L; /* o tipo padrão do java 
		é o int quando colocamos algo que fere o seu valor máximo
		mesmo que no long, temos que deixar explícito colocando o L no
		final ou usar CAST.
		
		*/
		
		// Tipos numéricos reais
		float salario = 11_445.44F; /* aqui também há  tem que deixar 
		explícito, pois o tipo padrão do java para números com pontos
		flutuantes é double, e mesmo que coloquemos um valor que caiba 
		dentro de float, é inferido pelo java que estamos colocando um
		valor double( que nao cabe) dentro do float.
		*/
		
		double vendasAcumuladas = 2_991_797_103.01; 
		
		// Tipo booleano
		boolean estaDeFerias = false; // true
				
				// Tipo caractere
				char status = 'A'; // ativo
		
		// Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		// Número de viagens
		System.out.println(numeroDeVoos / 2);
		
		// Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas); 
		
		System.out.println(id + ": ganha - " + salario);
		
	System.out.println("Férias? " + estaDeFerias); 
	System.out.println("Status: " + status);  
		 
	
		
		
		
		
		
	}
}
