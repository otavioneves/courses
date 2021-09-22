package com.otavio.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer24 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		
		for (int i=0;i<vetorA.length;i++) {
			System.out.print("Digite o " + (i+1)+"º item do vetor: ");
			vetorA[i] = scanner.nextInt();
		}
		
		System.out.println();
	
		int r = 9;
		boolean palindromo = false;
		for (int i=0;i<((vetorA.length)/2);i++) {
			
			if (vetorA[i]==vetorA[r]) {
				palindromo = true;
			} else {
				palindromo = false;
			}
			r--;
		}
		
		if (palindromo) {
			System.out.println("O vetor é palíndromo.");
		} else {
			System.out.println("O vetor não é palíndromo.");
		}
		
		scanner.close();	
	}

}
