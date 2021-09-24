package com.otavio.cursojava.aula43.Exer03;

public class Peixe extends Animal{

	private String caracteristicas;
	
	public Peixe(String nome, double comprimento, String cor, String ambiente, double velocidade,String caracteristicas) {
		super(nome, comprimento, cor, ambiente, velocidade);
		this.setPatas(0);
		this.setAmbiente("Mar");
		this.setCor("Cinzenta");
		this.setCaracteristicas(caracteristicas);
	}
	
	
	@Override
	public String toString() {
		return "-----\nAnimal: " + this.getNome() + "\nComprimento: " + this.getComprimento()+" cm\nPatas: "+this.getPatas() + "\nCor: " + this.getCor()+"\nAmbiente: " +
				this.getAmbiente()+"\nVelocidade: " + this.getVelocidade() +" m/s\nCaracteristicas: " +this.getCaracteristicas()+"\n-----";
	}


	public String getCaracteristicas() {
		return caracteristicas;
	}

	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}
	
	

	

	
}
