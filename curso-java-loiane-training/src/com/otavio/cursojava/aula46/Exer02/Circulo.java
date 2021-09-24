package com.otavio.cursojava.aula46.Exer02;

public class Circulo extends Figura2D {

	private double raio;
	private static final double NUMERO_PI=3.14;
	
	public Circulo(double raio) {
		super();
		this.raio = raio;
		this.setNome("Circulo");
	}
	
	@Override
	public double calcularArea() {
		this.setArea(NUMERO_PI*(this.getRaio()*this.getRaio()));
		return this.getArea();

	}

	@Override
	public String toString() {
		return "Circulo [raio=" + raio +  ", area=" +this.getArea();
	}


	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	

}
