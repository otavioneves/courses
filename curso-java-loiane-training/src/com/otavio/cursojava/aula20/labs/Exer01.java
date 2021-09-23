package com.otavio.cursojava.aula20.labs;

import java.util.Random;

public class Exer01 {

	public static void main(String[] args) {

		Random random = new Random();
		
		int[][] matrizM = new int[4][4];

		for (int i=0;i<matrizM.length;i++) {
			
			for (int c=0;c<matrizM[i].length;c++) {
				matrizM[i][c] = random.nextInt(100);
			}
			
		}
		
		System.out.println();
		
		int maiorNumero = 0;
		int linhaMaiorNumero = 0;
		int colunaMaiorNumero = 0;

		for (int i=0;i<matrizM.length;i++) {
			
			for (int c=0;c<matrizM[i].length;c++) {
					
				if (matrizM[i][c]>maiorNumero) {
					maiorNumero=matrizM[i][c];
					linhaMaiorNumero = i;
					colunaMaiorNumero = c;
				}
				
			}
			
		}
		
		for (int i=0;i<matrizM.length;i++) {
			
			for (int c=0;c<matrizM[i].length;c++) {
					System.out.print(matrizM[i][c] + " ");
			}
			System.out.println();
		}
		
		System.out.println("O maior número é " + maiorNumero + " e a sua posição é " + linhaMaiorNumero + " "+ colunaMaiorNumero);
		
	}

}
