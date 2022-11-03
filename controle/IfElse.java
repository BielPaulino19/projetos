package controle;

import javax.swing.JOptionPane;

public class IfElse {

	public static void main(String[] args) {
	
	  String valor = JOptionPane.showInputDialog
			  ("Digite um valor: ");
	  
	  double numero1 = Double.parseDouble(valor);
	  
	  if(numero1 % 2 == 0)
		  System.out.println("O número é par !!");
	  
	  else 
	  System.out.println("O número é ímpar !!");  
	
	
	
	
	
	
	
	
}
}
