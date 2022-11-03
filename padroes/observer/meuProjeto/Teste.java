package padroes.observer.meuProjeto;

public class Teste {

	public static void main(String[] args) {
		
		Interessado inter = new Interessado();
		oCaraQueAvisa ocqa = new oCaraQueAvisa();
		
		ocqa.registrar(inter);
		
		ocqa.registrar(e -> {
			System.out.println("Testando lambda !!!");
		});
		
		
		ocqa.monitorar();
	}
}
