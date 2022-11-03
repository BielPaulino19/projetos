package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {

	public static void main(String[] args) {
		
	Candidato c1 = new Candidato("Gui",true,18); 
	Candidato c2 = new Candidato("Ana",false,21); 
	Candidato c3 = new Candidato("André",true,51); 
	Candidato c4 = new Candidato("Rafa",true,15); 
		
		List<Candidato> candidatos = Arrays.asList(c1,c2,c3,c4);
		
		
		Predicate<Candidato> temOSecundarioEMaiordeidade =
				c -> c.secundario && c.idade >= 18;
		
		Function<Candidato, String> contratado = c -> 
		"Parabéns " + c.nome + " você foi contratado !!!";
		
		candidatos.stream().
		filter(temOSecundarioEMaiordeidade).
		map(contratado).
		forEach(System.out::println);
	
	}
}
