package com.otavio.cursojava.aula43.Exer01;

public class ContaEspecial extends ContaBancaria {
	
	private double limite;
	private double auxiliarLimite;
	
	public ContaEspecial(String nomeCliente, String numConta, double limite) {
		super(nomeCliente, numConta);
		this.setLimite(limite);
		this.setAuxiliarLimite(limite);
	}
	
	
	
	@Override
	public void exibirDadosConta() {
		super.exibirDadosConta();
		System.out.println("Limite: " + this.getLimite());
	}
	
	@Override
	public void sacar(double saque) {
		
		
		if ((this.getSaldo()<0||this.getSaldo()<saque)) {
			System.out.println();
			System.out.println("Você está usando seu limite.");
			this.setSaldo(this.getSaldo()-saque);
			this.setLimite(this.getAuxiliarLimite()+this.getSaldo());
		} else {
			this.setSaldo(this.getSaldo()-saque);
		}
		System.out.println("Saque: " + saque);
		System.out.println("Saldo: " + this.getSaldo());
		
		if (this.getSaldo()<0) {
			
		}
		
	}
	
	
	@Override
	public void depositar(double deposito) {
		this.setSaldo(this.getSaldo() + deposito);
		System.out.println("---");
		System.out.println("Depositado:" + deposito);
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("---");
		
		if (this.getSaldo()<0) {
			this.setLimite(this.getAuxiliarLimite()+this.getSaldo());
		}
		
	}
	
	
	public double getAuxiliarLimite() {
		return auxiliarLimite;
	}



	public void setAuxiliarLimite(double auxiliarLimite) {
		this.auxiliarLimite = auxiliarLimite;
	}



	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
}
