package padroes.observer.meuProjeto;

import java.util.Date;

public class Evento {

	private final Date momento;

	public Evento(Date momento) {
		this.momento = momento;
	}

	public Date getMomento() {
		return momento;
	}
}
