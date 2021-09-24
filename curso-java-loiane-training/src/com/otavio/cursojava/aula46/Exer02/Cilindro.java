package com.otavio.cursojava.aula46.Exer02;

public class Cilindro extends Figura3D {

	double altura,raioDaBase;
	private static final double NUMERO_PI=3.14;

	public Cilindro(double altura, double raioDaBase) {
		super();
		this.altura = altura;
		this.raioDaBase = raioDaBase;
		this.setNome("Cilindro");
	}

	@Override
	public double calcularVolume() {
		this.setVolume((NUMERO_PI*(this.getRaioDaBase()*this.getRaioDaBase())*this.getAltura()));
		return this.getVolume();
	}


	@Override
	public String toString() {
		return "Cilindro [altura=" + altura + ", raioDaBase=" + raioDaBase + ", area=" +this.getVolume();
	}


	public double getAltura() {
		return altura;
	}


	public void setAltura(double altura) {
		this.altura = altura;
	}


	public double getRaioDaBase() {
		return raioDaBase;
	}


	public void setRaioDaBase(double raioDaBase) {
		this.raioDaBase = raioDaBase;
	}

	
	
}
