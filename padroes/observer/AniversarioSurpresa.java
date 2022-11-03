package padroes.observer;

public class AniversarioSurpresa {

	public static void main(String[] args) {
		
		Namorada namorada = new Namorada();
		Porteiro porteiro = new Porteiro();
		
		porteiro.registrarobservardor(namorada);
		
		porteiro.registrarobservardor(e -> {
			System.out.println("Surpresa via lambda!!");
			System.out.println("Aconteceu em " + e.getMomento());
		});
		
		porteiro.monitorar();
	}
}
