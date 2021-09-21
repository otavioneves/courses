package com.otavio.cursojava.aula19.labs;

import java.util.Random;
//import java.util.Scanner;

public class Exer18 {

	public static void main(String[] args) {

		//Scanner scanner = new Scanner(System.in);
		
		Random random = new Random();
		
		int[] vetorA = new int[10];
		
		for (int i=0;i<vetorA.length;i++) {
			//System.out.print("Digite a idade da " + (i+1)+"a pessoa: ");
			vetorA[i] = random.nextInt(100);
		}
		
		for (int i=0;i<vetorA.length;i++) {
			System.out.println(i+": " + vetorA[i] + " ");
		}
		System.out.println();
		
		int maiorIdade = vetorA[0];
		int posicaoMaiorIdade = 0;
		int menorIdade = vetorA[0];
		int posicaoMenorIdade = 0;		
		for (int i=0;i<vetorA.length;i++) {
				for (int c = 0;c<vetorA.length;c++) {
					if (vetorA[i]>vetorA[c]&&vetorA[i]>maiorIdade) {
						maiorIdade = vetorA[i];
						posicaoMaiorIdade = i;
					}
				}
				
				for (int c = 0;c<vetorA.length;c++) {
					if (vetorA[i]<vetorA[c]&&vetorA[i]<menorIdade) {
						menorIdade = vetorA[i];
						posicaoMenorIdade = i;
					}
				}
		}
		
		System.out.println("\nA pessoa de maior idade tem " + maiorIdade + " anos e está na posição " + posicaoMaiorIdade);
		System.out.println("\nA pessoa de maior idade tem " + menorIdade + " anos e está na posição " + posicaoMenorIdade);

		//scanner.close();	
	}

}
