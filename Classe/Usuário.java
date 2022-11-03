package Classe;

public class Usuário {

	String nome;
	String email;
	
	
	public boolean equals(Object objeto) {
		
		if(objeto instanceof Usuário) {
			
		
			Usuário outro = (Usuário) objeto;
			
			boolean nomeIgual = outro.nome.equals(this.nome);
			boolean emailIgual = outro.email.equals(this.email);
			
			
			return nomeIgual && emailIgual;
		}
		
		else {
			return false;
		} 
		
	}
}
