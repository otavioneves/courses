package com.otavio.cursojava.aula43.Exer01;

public class ContaPoupanca extends ContaBancaria {

	private int diaRendimento;
	
	public ContaPoupanca(String nomeCliente, String numConta, int diaRendimento) {
		super(nomeCliente, numConta);
		this.setDiaRendimento(diaRendimento);
	}
	
	public void calcularNovoSaldo(double taxaRendimento) {
		this.setSaldo(this.getSaldo() + (this.getSaldo()*(taxaRendimento/100)));
		System.out.println("Novo Saldo após o rendimento: " + this.getSaldo());
	}

	@Override
	public void exibirDadosConta() {
		super.exibirDadosConta();
		System.out.println("Dia Rendimento Poupança: " + this.getDiaRendimento());
	}
	

	
	public int getDiaRendimento() {
		return diaRendimento;
	}

	public void setDiaRendimento(int diaRendimento) {
		this.diaRendimento = diaRendimento;
	}

}
