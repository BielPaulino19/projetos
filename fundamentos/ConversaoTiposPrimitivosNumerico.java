package fundamentos;

public class ConversaoTiposPrimitivosNumerico {

	public static void main(String[] args) {
		
		
		double a = 1.123456788888; // implícita
		System.out.println(a);
		
		float b = (float)1.123456788888; /* explícita (CAST) aqui é perdida 
		a informação, pois ultrapassou a capacidade do float
		*/  
		System.out.println(b);
		
		int c = 340;
		byte d = (byte) c;  //explícita (CAST)
		System.out.println(d);
		
		double e = 1.99999;
		int f = (int) e;      /*explícita (CAST) perca de informação, pois
		int só trabalha com números inteiros então o numero só considerado
		antes do ponto.
		*/
		System.out.println(f);
		
		
		/* double é usado por padrão para números com ponto.
		 * int é usado por padrão para numeros inteiros.
		 * esses usados por padrão tem maior capacidade.
		 */
	}
}
