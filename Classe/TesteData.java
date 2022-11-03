package Classe;

public class TesteData {

	public static void main(String[] args) {
		
		Data n1 = new Data();
		
		
		Data n2 = new Data(2009, 12, 24);
		
		
		String data1 = n1.obterDataFormatada();
		
		System.out.println(data1); 
		System.out.println(n2.obterDataFormatada());
		
		n1.imprimirDataFormatada();
		n2.imprimirDataFormatada();
	}
}
