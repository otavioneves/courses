package com.otavio.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer17 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		
		for (int i=0;i<vetorA.length;i++) {
			System.out.print("Digite a idade da " + (i+1)+"a pessoa: ");
			vetorA[i] = scanner.nextInt();
		}
		
		System.out.println();
		
		int soma = 0;
		for (int i=0;i<vetorA.length;i++) {
			if (vetorA[i]>35) {
				System.out.print(vetorA[i] + " ");
				soma = soma + 1;
			}
		}
		
		System.out.println("\nA quantidade de pessoas que tem mais de 35 anos é " + soma);

		scanner.close();	
	}

}
