package com.otavio.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer07 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		int[] vetorC = new int[vetorA.length];
		
		for (int i=0;i<vetorA.length;i++) {
			System.out.print("Digite o " + (i+1)+"º número: ");
			vetorA[i] = scanner.nextInt();
			
			vetorB[i] = vetorA[i];
			
			vetorC[i] = vetorA[i] - vetorB[i];
		}
		
		System.out.println();
		
		for (int i=0;i<vetorA.length;i++) {
			System.out.print(vetorA[i] + " ");
		}
		
		System.out.println();

		for (int i=0;i<vetorA.length;i++) {
			System.out.print(vetorB[i] + " ");
			
		}
		
		System.out.println();
		
		for (int i=0;i<vetorA.length;i++) {
			System.out.print(vetorC[i] + " ");
			
		}
		
		scanner.close();
	}

}
