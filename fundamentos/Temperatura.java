package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		

		// ( °F - 32 ) * 5/9.0 = °C;
		
		double F = 86.0;
		
		final double SUBTRACAO=32.0; 
		
		final double fator = 5/9.0;
		
		double Celsius = (F - SUBTRACAO) * fator;
		
		System.out.println(Celsius +"°C");
		
		F = 150;
		Celsius = (F - SUBTRACAO) * fator;
		
		
	    System.out.println("o resultado é " + Celsius+ "°C"); 
		
		
			 
			
		
			
		
				
				
	}
	

}
