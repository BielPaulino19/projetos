package fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		
	 //Informa��es do funcionario
		
		// Tipos num�ricos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_134_845_223L; /* o tipo padr�o do java 
		� o int quando colocamos algo que fere o seu valor m�ximo
		mesmo que no long, temos que deixar expl�cito colocando o L no
		final ou usar CAST.
		
		*/
		
		// Tipos num�ricos reais
		float salario = 11_445.44F; /* aqui tamb�m h�  tem que deixar 
		expl�cito, pois o tipo padr�o do java para n�meros com pontos
		flutuantes � double, e mesmo que coloquemos um valor que caiba 
		dentro de float, � inferido pelo java que estamos colocando um
		valor double( que nao cabe) dentro do float.
		*/
		
		double vendasAcumuladas = 2_991_797_103.01; 
		
		// Tipo booleano
		boolean estaDeFerias = false; // true
				
				// Tipo caractere
				char status = 'A'; // ativo
		
		// Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		// N�mero de viagens
		System.out.println(numeroDeVoos / 2);
		
		// Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas); 
		
		System.out.println(id + ": ganha - " + salario);
		
	System.out.println("F�rias? " + estaDeFerias); 
	System.out.println("Status: " + status);  
		 
	
		
		
		
		
		
	}
}
