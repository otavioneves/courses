package com.otavio.cursojava.aula43.Exer01;

public class ContaPoupanca extends ContaBancaria {

	private int diaRendimento;
	
	public void calcularNovoSaldo(double taxaRendimento) {
		this.setSaldo(this.getSaldo() + (this.getSaldo()*taxaRendimento));
		System.out.println("Saldo: " + this.getSaldo());
	}
	
	public ContaPoupanca(String nomeCliente, String numConta, int diaRendimento) {
		super(nomeCliente, numConta);
		this.setDiaRendimento(diaRendimento);
	}

	public void exibirDadosConta () {
		System.out.println("Nome: " + this.getNomeCliente());
		System.out.println("Número da Conta: " + this.getNumConta());
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Dia Rendimento Poupança: " + this.getDiaRendimento());
	}

	public int getDiaRendimento() {
		return diaRendimento;
	}



	public void setDiaRendimento(int diaRendimento) {
		this.diaRendimento = diaRendimento;
	}

}
