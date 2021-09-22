package com.otavio.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer25 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];

		
		for (int i=0;i<vetorA.length;i++) {
			System.out.print("Digite a idade da " + (i+1)+"a pessoa: ");
			vetorA[i] = scanner.nextInt();
		}
		
		System.out.println();
		
		for (int i=0;i<vetorA.length;i++) {
			if ((vetorA[i]%2)==0) {
				vetorB[i]=1;
			} else {
				vetorB[i]=0;
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
