package generics;

public class CaixaNumeroTeste {

	public static void main(String[] args) {
		
		CaixaNumero<Double> caixaA = new CaixaNumero<>();
		caixaA.guardar(1.243);
		System.out.println(caixaA.abrir());
		
		CaixaNumero<Integer> caixaB = new CaixaNumero<>();
		System.out.println(caixaB);
	}
}
