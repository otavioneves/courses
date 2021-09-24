package com.otavio.cursojava.aula43.Exer03;

public class Mamifero extends Animal {
	
	private String alimento;
	
	
	public Mamifero(String nome, double comprimento, String cor, String ambiente, double velocidade, String alimento) {
		super(nome, comprimento, cor, ambiente, velocidade);
		this.setAlimento(alimento);
	}

@Override
	public String toString() {
		return "-----\nAnimal: " + this.getNome() + "\nComprimento: " + this.getComprimento()+"cm \nPatas: "+this.getPatas() + "\nCor: " + this.getCor()+"\nAmbiente: " +
				this.getAmbiente()+"\nVelocidade: " + this.getVelocidade() +" m/s\nAlimento: " +this.getAlimento()+"\n-----";
	}

	
	
	public String getAlimento() {
		return alimento;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}

}
