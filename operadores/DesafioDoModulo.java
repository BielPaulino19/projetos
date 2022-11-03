package operadores;

import javax.swing.JOptionPane;

public class DesafioDoModulo {

	
	public static void main(String[] args) {
		
		String valor1 = JOptionPane.showInputDialog
				("Digite um número: ");
		String valor2 = JOptionPane.showInputDialog
				("Digite outro valor: ");
		String operacao = JOptionPane.showInputDialog
				("Digite a operação:");
				
		double numero1 = Double.parseDouble(valor1);
		double numero2 = Double.parseDouble(valor2);
		
		double soma = numero1 + numero2 ;
		double multiplicacao = numero1 * numero2;
		double divisão = numero1 / numero2;
		double subtracao = numero1 - numero2;
		
		double resultado = "+".equals(operacao) ? soma : 0 ;
		resultado = "-".equals(operacao) ? subtracao : resultado;
		resultado = "*".equals(operacao) ? multiplicacao : resultado;
		resultado = "/".equals(operacao) ? divisão : resultado;
		
		System.out.printf("%d %s %d  %d ", numero1, operacao, numero2, resultado); 
		
		
		
			
		
		
		
		
		
		
		
	}
}
