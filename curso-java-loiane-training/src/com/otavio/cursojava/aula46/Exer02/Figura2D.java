package com.otavio.cursojava.aula46.Exer02;

public abstract class Figura2D extends FiguraGeometrica implements DimensaoSuperficial {

	private int numeroDeLados;
	private double area;
	
	

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public int getNumeroDeLados() {
		return numeroDeLados;
	}

	public void setNumeroDeLados(int numeroDeLados) {
		this.numeroDeLados = numeroDeLados;
	}
	
}
