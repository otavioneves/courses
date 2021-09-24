package com.otavio.cursojava.aula43.Exer02;

public class PessoaFisica extends Contribuinte {

	private double renda;
	private double aliquota;
	private double parcelaImposto;
	
	public PessoaFisica(String nome,Double renda) {
		super(nome);
		this.setRenda(renda);
	}
	
	
	public PessoaFisica(String nome) {
		super(nome);
	}



@Override
	public void cobrarImposto() {
	
		if (this.getRenda()<=1400) {
			this.setAliquota(0);
			this.setParcelaImposto(0);
		} else if (this.getRenda()>1400&&this.getRenda()<=2100) {
			this.setAliquota(0.1);
			this.setParcelaImposto(100);
		} else if (this.getRenda()>2100&&this.getRenda()<=2800) {
			this.setAliquota(0.15);
			this.setParcelaImposto(270);
		} else if (this.getRenda()>2800&&this.getRenda()<=3600) {
			this.setAliquota(0.25);
			this.setParcelaImposto(500);
		} else if (this.getRenda()>3600) {
			this.setAliquota(0.3);
			this.setParcelaImposto(700);
		}
		
	}	
	
	@Override
	public String toString() {
		return "------\n"+"Nome:"+ this.getNome() + "\nRenda Bruta da Empresa: " + this.getRenda() + "\nAliquota: " + (this.getAliquota()*100) + "%\nParcela Imposto: "+ this.getParcelaImposto() + "\n------";
	}

	
	
	public double getParcelaImposto() {
	return parcelaImposto;
}

public void setParcelaImposto(double parcelaImposto) {
	this.parcelaImposto = parcelaImposto;
}

	public double getAliquota() {
	return aliquota;
}

	public void setAliquota(double aliquota) {
	this.aliquota = aliquota;
}

	public double getRenda() {
		return renda;
	}

	public void setRenda(double renda) {
		this.renda = renda;
	}

	
	
}
