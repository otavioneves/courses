package com.otavio.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer27 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		String[] vetorB = new String[vetorA.length];

		
		for (int i=0;i<vetorA.length;i++) {
			System.out.print("Digite o item " + (i+1)+" do vetor: ");
			vetorA[i] = scanner.nextInt();
		}
		
		System.out.println();
		
		for (int i=0;i<vetorA.length;i++) {
			if (vetorA[i]<7) {
				vetorB[i]="a";
			} else if (vetorA[i]==7){
				vetorB[i]="b";
			} else if (vetorA[i]>7&&vetorA[i]<10) {
				vetorB[i]="c";
			} else if (vetorA[i]==10){
				vetorB[i]="d";
			} else {
				vetorB[i]="e";
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
