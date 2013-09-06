package br.dac.dojo;

public class Nota {

	private double valor;
	private int quantidade;
	
	public Nota(double valor) {
		// TODO Auto-generated constructor stub
		this.valor = valor;
	}
	
	public double getValor() {
		return valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public double calculaQuantidade(double valor){
		
		int quantidade=0;
		
		while(valor >= this.valor){
			
			valor = valor - this.valor;
			quantidade = quantidade +1;			
			
		}
		
		this.quantidade = quantidade;
		
		return valor;
		
	}
}
