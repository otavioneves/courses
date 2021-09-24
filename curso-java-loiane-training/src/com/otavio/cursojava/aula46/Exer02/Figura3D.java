package com.otavio.cursojava.aula46.Exer02;

public abstract class Figura3D extends FiguraGeometrica implements DimensaoVolumetrica{

	private int numeroDeLados;
	private double volume;
	
	



	public double getVolume() {
		return volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}

	public int getNumeroDeLados() {
		return numeroDeLados;
	}

	public void setNumeroDeLados(int numeroDeLados) {
		this.numeroDeLados = numeroDeLados;
	}
	
	
}

