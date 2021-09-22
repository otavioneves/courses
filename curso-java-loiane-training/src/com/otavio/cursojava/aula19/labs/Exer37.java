package com.otavio.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer37 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int[] vetorA = new int[3];
		int[] vetorB = new int[vetorA.length];

		for (int i=0;i<vetorA.length;i++) {
			System.out.print("Digite o item " + (i+1)+" do primeiro vetor: ");
			vetorA[i] = scanner.nextInt();
		}
		
		System.out.println();
		
		int fatorial=0;
		int j = 0;
		for (int i=0;i<vetorA.length;i++) {
			
			j = vetorA[i];
			fatorial=vetorA[i];
			for (int c=0;c<(vetorA[i]-1);c++) {
				fatorial = fatorial*(j-1);
				j--;
			}
			vetorB[i]=fatorial;
		}
		
		
		for (int i=0;i<vetorA.length;i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		for (int i=0;i<vetorA.length;i++) {
			System.out.print(vetorB[i] + " ");
		}

		scanner.close();	
		
	}

}
