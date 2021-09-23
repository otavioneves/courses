package com.otavio.cursojava.aula20.labs;

import java.util.Random;

public class Exer02 {

	public static void main(String[] args) {

		Random random = new Random();
		
		int[][] matrizM = new int[10][10];

		for (int i=0;i<matrizM.length;i++) {
			
			for (int c=0;c<matrizM[i].length;c++) {
				matrizM[i][c] = random.nextInt(100);
			}
			
		}
		
		System.out.println();
		
		int maior5 = 0;
		int menor5 = matrizM.length;
		for (int i=0;i<matrizM.length;i++) {
				
				if (matrizM[4][i]>=maior5) {
					maior5=matrizM[4][i];
				}
				if (matrizM[4][i]<=menor5) {
					menor5=matrizM[4][i];
				}
		}
		
		int maior7=0;
		int menor7 = matrizM.length;
		for (int i=0;i<matrizM.length;i++) {
			
			if (matrizM[i][6]>=maior7) {
				maior7=matrizM[i][6];
			}
			if (matrizM[i][6]<=menor7) {
				menor7=matrizM[i][6];
			}
		
		}
		
		for (int i=0;i<matrizM.length;i++) {
			
			for (int c=0;c<matrizM[i].length;c++) {
					System.out.print(matrizM[i][c] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("O maior número da linha 5 é " + maior5 + " e o menor é " + menor5+ " .");
		System.out.println("O maior número da coluna 7 é " + maior7 + " e o menor é " + menor7+ " .");

		
	}

}
