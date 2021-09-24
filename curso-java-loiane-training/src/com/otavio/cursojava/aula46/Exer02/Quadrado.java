package com.otavio.cursojava.aula46.Exer02;

public class Quadrado extends Figura2D {

	private double tamanhoLado;
	
	
	public Quadrado(double tamanhoLado) {
		super();
		this.tamanhoLado = tamanhoLado;
		this.setNome("Quadrado");
	}

	@Override
	public double calcularArea() {
		this.setArea(this.getTamanhoLado()*this.getTamanhoLado());
		return this.getArea();

	}


	
	@Override
	public String toString() {
		return "Quadrado [tamanhoLado=" + tamanhoLado +  ", area=" +this.getArea();
	}



	public double getTamanhoLado() {
		return tamanhoLado;
	}

	public void setTamanhoLado(double tamanhoLado) {
		this.tamanhoLado = tamanhoLado;
	}

}
