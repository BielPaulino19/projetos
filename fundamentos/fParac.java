package fundamentos;

import javax.swing.JOptionPane;

public class fParac {
	
	public static void main(String[] args) {
		// ( °F - 32 ) * 5/9.0 = °C;
		
		String valor1 = JOptionPane.showInputDialog
				("Digite a temperatura em °C").replace(",", ".");
		
		double numero1 = Double.parseDouble(valor1);
		
		double soma = 32;
		double divisao = 5/9.0;
		double resultado = ((numero1) /divisao) + soma;
		
		System.out.println(resultado + "°F");
		
		
		
		
	}

}
