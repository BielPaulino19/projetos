package Classe;

import java.util.Date;

public class EqualsHashcode {

	public static void main(String[] args) {
		
		Usu�rio u1 = new Usu�rio();
		
		u1.nome = "Pedro Silva";
		u1.email = "pedro.silva@ezemail.com.br";
		
		Usu�rio u2 = new Usu�rio();
		u2.nome = "Pedro Silva";
		u2.email = "pedro.silva@ezemail.com.br";
		
		System.out.println(u1 == u2);
		System.out.println(u1.equals(u2));
		
		System.out.println(u2.equals(new Date())); 
	}
}
