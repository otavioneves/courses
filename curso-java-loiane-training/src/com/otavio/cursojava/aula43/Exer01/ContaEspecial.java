package com.otavio.cursojava.aula43.Exer01;

public class ContaEspecial extends ContaBancaria {
	
	private double limite;

	public ContaEspecial(String nomeCliente, String numConta, double limite) {
		super(nomeCliente, numConta);
		this.setLimite(limite);
	}
	
	public void exibirDadosConta () {
		System.out.println("Nome: " + this.getNomeCliente());
		System.out.println("Número da Conta: " + this.getNumConta());
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Limite: " + this.getLimite());
	}

	@Override
	public void sacar(double saque) {
		
		if ((this.getSaldo()<0||this.getSaldo()<saque)&&this.getLimite()<saque) {
			System.out.println("Você está usando seu limite.");
		} else {
			this.setSaldo(this.getSaldo()-saque);
			this.setLimite(this.getLimite()+(this.getSaldo()-saque));
		}
		System.out.println("Saque: " + saque);
		System.out.println("Saldo: " + this.getSaldo());
	}
	
	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
}
