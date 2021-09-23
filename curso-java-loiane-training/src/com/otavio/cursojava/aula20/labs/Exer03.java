package com.otavio.cursojava.aula20.labs;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int[][] matrizM = new int[3][3];

		for (int i=0;i<matrizM.length;i++) {
			
			for (int c=0;c<matrizM[i].length;c++) {
				matrizM[i][c] = scanner.nextInt();
			}
			
		}
		
		System.out.println();
		
		int quantidadePares = 0;
		int quantidadeImpares = 0;

		for (int i=0;i<matrizM.length;i++) {
			
			for (int c=0;c<matrizM[i].length;c++) {
					
				if ((matrizM[i][c]%2)==0) {
					quantidadePares++;
				} else {
					quantidadeImpares++;
				}
				
			}
			
		}
		
		for (int i=0;i<matrizM.length;i++) {
			
			for (int c=0;c<matrizM[i].length;c++) {
					System.out.print(matrizM[i][c] + " ");
			}
			System.out.println();
		}
		
		System.out.println("A quantidade de números pares é " + quantidadePares + " e a quantidade de impares é " + quantidadeImpares);
		
		scanner.close();		
	}

}
