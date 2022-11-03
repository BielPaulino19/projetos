package controle;



import javax.swing.JOptionPane;

public class exercicio1 {

	public static void main(String[] args) {
		
		
		String valor = JOptionPane.showInputDialog
				("Digite um valor :");
		
		double numero = Double.parseDouble(valor);
		
		if(numero % 2 == 0) 
			System.out.println("O número é par !!");
		
		else 
			System.out.println("É ímpar");
		
		if(numero >= 0 && numero <= 10)
			System.out.println("Está entre 10 e 0");
		
		
		
		
		
				
				
				
				
	}
}
