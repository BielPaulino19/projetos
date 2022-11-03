package fundamentos;

public class TipoString {

	public static void main(String[] args) {
		System.out.println("Olá pessoal".charAt(2)); 
		
		String s = "Boa tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
        System.out.println(s.startsWith("Boa"));
        System.out.println(s.toLowerCase().startsWith("boa"));
        System.out.println(s.toUpperCase().endsWith("TARDE"));
        System.out.println(s.length());
        System.out.println(s.equalsIgnoreCase("boa tarde"));
        System.out.println(s.replace("a", "1")); 
	
	var nome = "Pedro";
	var sobrenome = "Santos";
	var idade = 33;
	var salario = 12345.987; 
	
	String maisUmaFrase = "Nome: " + nome + "\nSobrenome: " + sobrenome +
			"\nIdade : "+ idade + "\nSalario: " + salario + "\n\n";
	System.out.println(maisUmaFrase);
	
	System.out.printf("O senhor %s %s tem %d anos e ganha R$%.2f.",
			nome, sobrenome, idade, salario);
	
	String frase = String.format("\nO senhor %s %s tem %d anos e ganha R$%.2f.",
			nome, sobrenome, idade, salario);
	System.out.println(frase);  
	
	 
	nome = "Gabriel";
	sobrenome = "Teixeira";
	idade = 18;
	System.out.printf("\nO %s de idade de %d anos está sendo convocado", nome, idade,
			sobrenome);
	
	
	
	
	} 
}
