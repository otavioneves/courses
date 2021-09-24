package com.otavio.cursojava.aula43.Exer02;

public class PessoaJuridica extends Contribuinte {

	private double rendaBrutaEmpresa;
	private double aliquota;
	private double parcelaImposto;
	
	public PessoaJuridica(String nome, double renda) {
		super(nome);
		this.aliquota = 0.1;
		this.setRendaBrutaEmpresa(renda);
	}

	
	public void cobrarImposto() {
		
		this.setParcelaImposto(this.getRendaBrutaEmpresa()*this.aliquota);
		
	}


	@Override
	public String toString() {
		return "------\n"+"Nome:"+ this.getNome() + "\nRenda Bruta da Empresa: " + this.getRendaBrutaEmpresa() + "\nAliquota: " + (this.getAliquota()*100) + "%\nParcela Imposto: "+ this.getParcelaImposto() + "\n------";
	}

	

	public double getRendaBrutaEmpresa() {
		return rendaBrutaEmpresa;
	}


	public void setRendaBrutaEmpresa(double rendaBrutaEmpresa) {
		this.rendaBrutaEmpresa = rendaBrutaEmpresa;
	}


	public double getAliquota() {
		return aliquota;
	}


	public void setAliquota(double aliquota) {
		this.aliquota = aliquota;
	}


	public double getParcelaImposto() {
		return parcelaImposto;
	}


	public void setParcelaImposto(double parcelaImposto) {
		this.parcelaImposto = parcelaImposto;
	}
	
	
	
	
	
	
}
