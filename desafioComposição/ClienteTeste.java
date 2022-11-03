package desafioComposição;

public class ClienteTeste {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente();
		
		Compra c1 = new Compra();
		
		cliente1.compras.add(c1);
		
		c1.adicionarItem("Borracha", 8.90, 7);
		c1.adicionarItem("Lápis", 1.20, 3);
		c1.adicionarItem("Apotador", 1.50, 10);
		
		Compra c2 = new Compra();
		
		c2.adicionarItem("grafite", 2.20, 2);
		c2.adicionarItem("lapiseira", 5.0, 1);
		
		cliente1.compras.add(c2);
		
		System.out.println("O cliente gastou " + cliente1.obterValorTotal());
		
		
		
	}
}
