package Classe;

public class Usu�rio {

	String nome;
	String email;
	
	
	public boolean equals(Object objeto) {
		
		if(objeto instanceof Usu�rio) {
			
		
			Usu�rio outro = (Usu�rio) objeto;
			
			boolean nomeIgual = outro.nome.equals(this.nome);
			boolean emailIgual = outro.email.equals(this.email);
			
			
			return nomeIgual && emailIgual;
		}
		
		else {
			return false;
		} 
		
	}
}
