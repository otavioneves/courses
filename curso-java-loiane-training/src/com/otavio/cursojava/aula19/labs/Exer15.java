package com.otavio.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer15 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		
		for (int i=0;i<vetorA.length;i++) {
			System.out.print("Digite o " + (i+1)+"º número: ");
			vetorA[i] = scanner.nextInt();
		}
		
		System.out.println();
		
		int somaElementosPares = 0;
		int somaElementosImpares = 0;
		double quantidadeTotal = 0;
		double porcentagemPares = 0;
		double porcentagemImpares = 0;
		
		for (int i=0;i<vetorA.length;i++) {
			if ((vetorA[i]%2==0)) {
				somaElementosPares = somaElementosPares + 1;
			} else {
				somaElementosImpares = somaElementosImpares + 1;
			}
			
			quantidadeTotal = quantidadeTotal +1;
		}
		
		porcentagemPares = somaElementosPares/quantidadeTotal;
		porcentagemImpares = somaElementosImpares/quantidadeTotal; 
		System.out.println("\nA porcentagem dos elementos pares do vetor é " + (porcentagemPares*100)+"%");
		System.out.println("\nA porcentagem dos elementos ímpares do vetor é " + (porcentagemImpares*100)+"%");

		scanner.close();	
		
	}
}
