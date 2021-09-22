package com.otavio.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer30 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		int[] vetorC = new int[vetorA.length];

		for (int i=0;i<vetorA.length;i++) {
			System.out.print("Digite o item " + (i+1)+" do primeiro vetor: ");
			vetorA[i] = scanner.nextInt();
		}
		
		System.out.println();
		
		int contadorB=0;
		int contadorC=0;
		for (int i=0;i<vetorA.length;i++) {
			
			if ((vetorA[i]%2)==0) {
				vetorB[contadorB]=vetorA[i];
				contadorB++;
			} else {
				vetorC[contadorC]=vetorA[i];
				contadorC++;
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
