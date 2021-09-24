package com.otavio.cursojava.aula43.Exer02;

import java.util.Scanner;

public class teste {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		PessoaFisica[] pf = new PessoaFisica[3];
		PessoaJuridica[] pj = new PessoaJuridica[3];
		
		for (int i=0;i<pf.length;i++) {
			
			System.out.print("Digite o nome do " + (i+1) + "° cliente: ");
			String nome = scanner.next();
			System.out.print("Digite a renda mensal do " + (i+1) + "° cliente: ");
			double renda = scanner.nextDouble();
			
			pf[i] = new PessoaFisica(nome, renda);
			pf[i].cobrarImposto();
		}
		
		for (int i=0;i<pj.length;i++) {
			
			System.out.print("Digite o nome do " + (i+1) + "° cliente PJ: ");
			String nome = scanner.next();
			System.out.print("Digite a renda mensal do " + (i+1) + "° cliente PJ: ");
			double renda = scanner.nextDouble();
			
			pj[i] = new PessoaJuridica(nome, renda);
			pj[i].cobrarImposto();
		}
		
		for (int i=0;i<pf.length;i++) {
			System.out.println(pf[i].toString());
		}
		
		for (int i=0;i<pj.length;i++) {
			System.out.println(pj[i].toString());
		}
		
		scanner.close();
	}
}
