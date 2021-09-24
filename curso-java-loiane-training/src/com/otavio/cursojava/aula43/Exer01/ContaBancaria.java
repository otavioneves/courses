package com.otavio.cursojava.aula43.Exer01;

public class ContaBancaria {

	private String nomeCliente;
	private String numConta;
	private double saldo;
		
	public ContaBancaria(String nomeCliente, String numConta) {
		super();
		this.nomeCliente = nomeCliente;
		this.numConta = numConta;
		this.saldo = 0.0;
	}
	
	public ContaBancaria() {
	}
	
	
	public void sacar(double saque) {
		if (this.getSaldo()<0||this.getSaldo()<saque) {
			System.out.println("---");
			System.out.println("Saque:" + saque);
			System.out.println("Saldo insuficiente. Saque não efetuado");
			System.out.println("Saldo: " + this.getSaldo());
			System.out.println("---");
		} else {
			this.setSaldo(saldo - saque);
			System.out.println("---");
			System.out.println("Saque:" + saque);
			System.out.println("Saldo: " + this.getSaldo());
			System.out.println("---");
		}
	}
	
	
	public void depositar(double deposito) {
		this.setSaldo(saldo + deposito);
		System.out.println("---");
		System.out.println("Depositado:" + deposito);
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("---");
	}
	
	public void exibirDadosConta () {
		System.out.println("Nome: " + this.getNomeCliente());
		System.out.println("Número da Conta: " + this.getNumConta());
		System.out.println("Saldo: " + this.getSaldo());
	}
	
	
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getNumConta() {
		return numConta;
	}
	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	
	
}
