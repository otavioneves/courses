package com.otavio.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer13 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		
		for (int i=0;i<vetorA.length;i++) {
			System.out.print("Digite o " + (i+1)+"º número: ");
			vetorA[i] = scanner.nextInt();
		}
		
		System.out.println();
		
		int soma = 0;
		for (int i=0;i<vetorA.length;i++) {
			
			if ((vetorA[i]%5==0)) {
			System.out.print(vetorA[i] + " ");
			 soma = soma + 1;
			}
		
		}
		
		System.out.println("\nO total de numeros divisíveis por 5 no vetor é " + soma);

		scanner.close();	
		
	}

}
