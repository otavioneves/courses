package com.otavio.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer26 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int[] vetorA = new int[3];
		int[] vetorB = new int[vetorA.length];
		int[] vetorC = new int[vetorA.length];

		for (int i=0;i<vetorA.length;i++) {
			System.out.print("Digite o item " + (i+1)+" do primeiro vetor: ");
			vetorA[i] = scanner.nextInt();
		}
		
		System.out.println();
		
		for (int i=0;i<vetorA.length;i++) {
			System.out.print("Digite o item " + (i+1)+" do primeiro vetor: ");
			vetorB[i] = scanner.nextInt();
		}
		
		
		System.out.println();
		
		for (int i=0;i<vetorA.length;i++) {
			if (vetorA[i]>vetorB[i]) {
				vetorC[i]=1;
			} else if (vetorA[i]==vetorB[i]){
				vetorC[i]=0;
			} else {
				vetorC[i]=-1;

			}
		}
		
		
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
