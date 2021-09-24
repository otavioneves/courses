package com.otavio.cursojava.aula46.Exer02;

public class Piramide extends Figura3D {

	private double lado1,lado2,altura;
	
	public Piramide(double lado1, double lado2, double altura) {
		super();
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.altura = altura;
		this.setNome("Piramide");
	}
	
	@Override
	public double calcularVolume() {
		this.setVolume(((this.getLado1()*this.getLado2())*this.getAltura()/3));
		return this.getVolume();

	}
	
	@Override
	public String toString() {
		return "Piramide [lado1=" + lado1 + ", lado2=" + lado2 + ", altura=" + altura + ", area=" +this.getVolume();
	}


	public double getLado1() {
		return lado1;
	}

	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}


	public double getLado2() {
		return lado2;
	}

	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	
}
