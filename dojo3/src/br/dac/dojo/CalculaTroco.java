package br.dac.dojo;

import java.util.List;

public class CalculaTroco {

	private double troco;

	private List<Nota> notas;
	
	public CalculaTroco(double valorAPagar, double valorPago) {
		this.troco = valorPago - valorAPagar;
		notas.add(new Nota(100));
		notas.add(new Nota(50));
		notas.add(new Nota(20));
		notas.add(new Nota(10));
		notas.add(new Nota(5));
		notas.add(new Nota(1));
	}
	
	public void contaNotas(){}
	
	public void setArrayNotas(List<Nota> notas) {
		
		this.notas = notas;
		
		
	}
	
	
	
	
}
