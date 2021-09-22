package com.otavio.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer31 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];

		for (int i=0;i<vetorA.length;i++) {
			System.out.print("Digite o item " + (i+1)+" do primeiro vetor: ");
			vetorA[i] = scanner.nextInt();
		}
		
		System.out.println();
		
		int contadorPar=0;
		int contadorImpar=0;
		for (int i=0;i<vetorA.length;i++) {
			if ((vetorA[i]%2)==0) {
				contadorPar++;
			} else {
				contadorImpar++;
			}
		}
		
		int r = contadorPar;
		int w = 1;
		for (int i=0;i<vetorA.length;i++) {
			if ((vetorA[i]%2)==0) {
				vetorB[contadorPar-r]=vetorA[i];
				r--;
			} else {
				vetorB[9-(contadorImpar-w)]=vetorA[i];
				w++;
			}
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
