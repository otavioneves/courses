package com.otavio.cursojava.aula19.labs;


public class Exer22 {

	public static void main(String[] args) {

		//Scanner scanner = new Scanner(System.in);
		
		double[] numeros = new double[10];

		for (int i=0;i<numeros.length;i++) {
			numeros[i] = (int) Math.round(Math.random()*1);
			
		}
		
		int somaZero = 0;
		int somaUm = 0;
		int quantidadeTotal = 0;
		
		for (int i=0;i<numeros.length;i++) {
			if (numeros[i]==0) {
				somaZero=somaZero+1;
			} else {
				somaUm = somaUm + 1;
			}
			quantidadeTotal = quantidadeTotal+1;
		}
			
		double porcentagemUm = (somaUm*100)/10;
		double porcentagemZero = (somaZero*100)/10;

		
		for (int i=0;i<numeros.length;i++) {
			System.out.println(numeros[i]);			
		}
		
		System.out.println("A porcentagem de 1 é " + porcentagemUm + "%.");
		System.out.println("A porcentagem de 0 é " + porcentagemZero + "%.");
		//scanner.close();
		
	}

}
