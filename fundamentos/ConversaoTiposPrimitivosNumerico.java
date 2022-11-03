package fundamentos;

public class ConversaoTiposPrimitivosNumerico {

	public static void main(String[] args) {
		
		
		double a = 1.123456788888; // impl�cita
		System.out.println(a);
		
		float b = (float)1.123456788888; /* expl�cita (CAST) aqui � perdida 
		a informa��o, pois ultrapassou a capacidade do float
		*/  
		System.out.println(b);
		
		int c = 340;
		byte d = (byte) c;  //expl�cita (CAST)
		System.out.println(d);
		
		double e = 1.99999;
		int f = (int) e;      /*expl�cita (CAST) perca de informa��o, pois
		int s� trabalha com n�meros inteiros ent�o o numero s� considerado
		antes do ponto.
		*/
		System.out.println(f);
		
		
		/* double � usado por padr�o para n�meros com ponto.
		 * int � usado por padr�o para numeros inteiros.
		 * esses usados por padr�o tem maior capacidade.
		 */
	}
}
