package com.otavio.cursojava.aula46.Exer02;

public class Triangulo extends Figura2D {

	private double lado1, lado2, lado3;
	
	
	public Triangulo(double lado1, double lado2, double lado3) {
		super();
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
		this.setNome("Triangulo");
	}

	@Override
	public double calcularArea() {
		this.setArea(this.getLado1()*this.getLado2()*this.getLado3());
		return this.getArea();

	}

	@Override
	public String toString() {
		return "Triangulo [lado1=" + lado1 + ", lado2=" + lado2 + ", lado3=" + lado3 + ", area=" +this.getArea();
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

	public double getLado3() {
		return lado3;
	}

	public void setLado3(double lado3) {
		this.lado3 = lado3;
	}

	
	
}
