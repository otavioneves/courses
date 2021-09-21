package com.otavio.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer14 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		
		for (int i=0;i<vetorA.length;i++) {
			System.out.print("Digite o " + (i+1)+"º número: ");
			vetorA[i] = scanner.nextInt();
		}
		
		System.out.println();
		
		int soma = 0;
		double media = 0;
		double quantidade = 0;
		for (int i=0;i<vetorA.length;i++) {
			if (!(vetorA[i]%2==0)) {
				System.out.print(vetorA[i] + " ");
				soma = soma + vetorA[i];
				quantidade = quantidade +1;
			}
		}
		
		media = soma/quantidade;
		System.out.println("\nA média aritmética simples dos elementos ímpares do vetor é " + media);

		scanner.close();	
		
	}
	
	
}
