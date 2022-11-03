package padroes.observer.meuProjeto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class oCaraQueAvisa {

	List<Observador> observadores = new ArrayList<Observador>();
	
	public void registrar(Observador observador) {
		observadores.add(observador);
	}
	
	public void monitorar() {
		
		Scanner entrada = new Scanner(System.in);
		String valor = "";
		
		while(!"sair".equalsIgnoreCase(valor)) {
			
			System.out.println("O evento aconteceu ?");
			valor = entrada.next();
			
			if("sim".equalsIgnoreCase(valor)) {
				Evento evento = new Evento(new Date());
				
				valor = "sair";
				
				observadores.stream().forEach(o -> o.aconteceu(evento));
			}else {
				System.out.println("Não ocorreu :(");
			}
			
		}
				
				
				entrada.close();
		
		
		
	}
	
	
	
	
	
}
