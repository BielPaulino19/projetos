package controle;

import javax.swing.JOptionPane;

public class MediaFinal {

	public static void main(String[] args) {
		
		String valor = JOptionPane.showInputDialog
				("Digite a nota :");
		
		String valor2 = JOptionPane.showInputDialog
				("Digite a outra nota :");
		
		
		double nota = Double.parseDouble(valor);
		double nota2 = Double.parseDouble(valor2);
		
		double media = (nota + nota2) / 2;
		System.out.println("A média é" + media);
		
		if(media >= 7)
			System.out.println("Aprovado !!!");
		
		else if(media <= 7 && media >= 4)
			System.out.println("Recuperação !!");
		
		else
			System.out.println("Reprovado !!");
				
				
		
		
	}
}
