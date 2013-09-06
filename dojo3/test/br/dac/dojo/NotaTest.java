package br.dac.dojo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NotaTest {

	private Nota nota;
	private CalculaTroco calculaTroco;
	double resto;
	public NotaTest() {
		nota = new Nota(100);
	}
	
	@Before
	public void settings(){
		resto = nota.calculaQuantidade(320);
	}
	
	@Test
	public void trocoTest(){
		Assert.assertTrue(resto == 20);
	}
	
	@Test
	public void calculaQuantidadeTest(){	
		Assert.assertTrue(nota.getQuantidade() == 3);
	}
}
