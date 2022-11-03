package fundamentos;

import javax.swing.JOptionPane;

public class cParaf {

	public static void main(String[] args) {
		
		String valor1 = JOptionPane.showInputDialog
				("Digite a temperarura em °F :").replace(",", ".");
		
		double numero1 = Double.parseDouble(valor1);
		
		double subtracao = 32;
	    double fator = 5/9.0;
	    
	    double resultadoemC = (numero1 - subtracao) * fator;
	    
	    System.out.printf("O resultado é igual a %.2f °C", resultadoemC);
		
		
		
		
		
		
		
		
	}
}
