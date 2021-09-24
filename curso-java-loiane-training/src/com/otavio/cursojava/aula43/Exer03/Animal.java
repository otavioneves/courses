package com.otavio.cursojava.aula43.Exer03;

public class Animal {

		private String nome;
		private double comprimento;
		private int patas;
		private String cor;
		private String ambiente;
		private double velocidade;
		
		public Animal(String nome, double comprimento, String cor, String ambiente, double velocidade) {
			super();
			this.nome = nome;
			this.comprimento = comprimento;
			this.patas = 4;
			this.cor = cor;
			this.ambiente = ambiente;
			this.velocidade = velocidade;
		}
		
		
		
		
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public double getComprimento() {
			return comprimento;
		}
		public void setComprimento(double comprimento) {
			this.comprimento = comprimento;
		}
		public int getPatas() {
			return patas;
		}
		public void setPatas(int patas) {
			this.patas = patas;
		}
		public String getCor() {
			return cor;
		}
		public void setCor(String cor) {
			this.cor = cor;
		}
		public String getAmbiente() {
			return ambiente;
		}
		public void setAmbiente(String ambiente) {
			this.ambiente = ambiente;
		}
		public double getVelocidade() {
			return velocidade;
		}
		public void setVelocidade(double velocidade) {
			this.velocidade = velocidade;
		}
		

}
