package br.com.cod3r.modelo;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.cod3r.cm.excecao.ExplosaoException;
import br.com.cod3r.cm.modelo.Campo;

public class CampoTeste {
	private Campo campo;
	
	@BeforeEach
	void iniciarCampo() {
		campo = new Campo(3,3);
	}
	
	@Test
	void testeVizinhoRelaDistancia1Esquerda() {
		Campo vizinhoEsquerda = new Campo(3,2);
		boolean resultadoEsquerda = campo.adicionarVizinho(vizinhoEsquerda);
				assertTrue(resultadoEsquerda);
	}
	@Test
	void testeVizinhoReal1Direita() {
		Campo vizinhiDireita = new Campo(3,4);
		boolean resultado = campo.adicionarVizinho(vizinhiDireita);
		assertTrue(resultado);
	}
	@Test
	void testeVizinhoReal1EmCima() {
		Campo vizinhoEmCima = new Campo(2,3);
		boolean resultado = campo.adicionarVizinho(vizinhoEmCima);
		assertTrue(resultado);
	}
	
	@Test
	void testeVizinhoEmBaixo() {
		Campo vizinhoEmBaixo = new Campo(4,3);
		boolean resultado = campo.adicionarVizinho(vizinhoEmBaixo);
		assertTrue(resultado);
	}
	@Test
	void testeVizinhoDistancia2() {
		Campo vizinhoDiagonal = new Campo(4,4);
		boolean resultado = campo.adicionarVizinho(vizinhoDiagonal);
		assertTrue(resultado);
	}
	@Test
	void testeNaoVizinho() {
		Campo naoVizinho = new Campo(1,1);
		boolean resultado = campo.adicionarVizinho(naoVizinho);
		assertFalse(resultado);
	}
	
	@Test
	void testeValorPadraoAtributoMarcacao() {
		assertFalse(campo.isMarcado());
	}

	@Test
	void testeAlternarMarcacao() {
		campo.alternarMarcacao();
		assertTrue(campo.isMarcado());
	}
	@Test
	void testeAlternarMarcacaoDuasChamadas() {
		campo.alternarMarcacao();
		campo.alternarMarcacao();
		assertFalse(campo.isMarcado());
	}
	
	@Test
	void testeAbrirNaoMinadoNaoMarcado() {
		assertTrue(campo.abrir());
	}
	
	@Test
	void testeAbrirNaoMinadoMarcado() {
		campo.alternarMarcacao();
		assertFalse(campo.abrir());
	}
	
	@Test
	void testeAbrirMinadoMarcado() {
		campo.alternarMarcacao();
		campo.minar();
		assertFalse(campo.abrir());
	}
	
	@Test
	void testeAbrirMinadoNaoMarcado() {
		campo.minar();
		
		assertThrows(ExplosaoException.class, () -> {
			campo.abrir();
		});
   }
	
	@Test
	void testeAbrirComvizinhos() {
		
		Campo campo11 = new Campo(1,1);
		
		Campo campo22 = new Campo(2,2);
		campo22.adicionarVizinho(campo11);
		
		
		campo.adicionarVizinho(campo22);
		campo.abrir();
		
		assertTrue(campo22.isAberto() && campo11.isAberto());
	}
	
	@Test
	void testeAbrirComvizinhos2() {
		
		Campo campo11 = new Campo(1,1);
		Campo campo12 = new Campo(1,2);
		campo12.minar();
		
		
		Campo campo22 = new Campo(2,2);
		campo22.adicionarVizinho(campo11);
		campo22.adicionarVizinho(campo12);
		
		
		campo.adicionarVizinho(campo22);
		campo.abrir();
		
		assertTrue(campo22.isAberto() && campo11.isFechado());
	}
	
	
}
