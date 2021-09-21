package com.otavio.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer12 {

	public static void main(String[] args) {
		
			Scanner scanner = new Scanner(System.in);
			
			int[] vetorA = new int[10];
			
			int soma = 0;
			for (int i=0;i<vetorA.length;i++) {
				System.out.print("Digite o " + (i+1)+"º número: ");
				vetorA[i] = scanner.nextInt();
				 soma = soma + 1;
			}
			
			System.out.println();
			
			System.out.println("\nO total de numeros desse vetor é " + soma);
			
			scanner.close();		
		
	}
}