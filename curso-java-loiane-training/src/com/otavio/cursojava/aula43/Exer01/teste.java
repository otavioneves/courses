package com.otavio.cursojava.aula43.Exer01;

public class teste {

	public static void main(String[] args) {

		ContaPoupanca contaP1 = new ContaPoupanca("Otavio", "1001", 10);
		ContaEspecial contaE1 = new ContaEspecial("Carol", "2001", 2000);
		
		contaP1.exibirDadosConta();
		contaE1.exibirDadosConta();
		
		contaP1.depositar(200);
		contaP1.sacar(80);
		contaP1.sacar(200);
		contaP1.calcularNovoSaldo(1);
		
		contaE1.depositar(80);
		contaE1.sacar(80);
		contaE1.sacar(200);
		
		contaP1.exibirDadosConta();
		contaE1.exibirDadosConta();
		
		contaE1.sacar(200);
		contaE1.sacar(200);
		
		contaE1.exibirDadosConta();
		
		contaE1.depositar(200);
		contaE1.depositar(200);
		contaE1.depositar(200);
		contaE1.depositar(200);

		
	}

}
