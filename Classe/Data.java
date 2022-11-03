package Classe;

public class Data {

	int ano;
	int mes;
	int dia;
	
	Data(){
		
		/* dia = 1;
		 mes = 1;
		 ano = 1970;*/
	
		this(1, 1, 1970); 
		
		}
	
	Data(int dia, int mes, int ano ){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	
	
	
	String obterDataFormatada () {
		String formato = "%d/%d/%d";
		return String.format(formato, this.dia, mes ,ano);
	}
	void imprimirDataFormatada () {
		System.out.println(this.obterDataFormatada());
	}
}
