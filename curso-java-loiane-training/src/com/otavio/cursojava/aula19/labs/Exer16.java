package com.otavio.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer16 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		
		for (int i=0;i<vetorA.length;i++) {
			System.out.print("Digite o " + (i+1)+"º número: ");
			vetorA[i] = scanner.nextInt();
		}
		
		System.out.println();
		
		int somaElementosMenorQueQuinze = 0;
		int quantidadeElementosIgualAQuinze = 0;
		int mediaElementosMaiorQueQuinze = 0;
		int somaElementosMaiorQueQuinze = 0;
		int quantidadeElementosMaiorAQuinze = 0;
		
		double quantidade = 0;
		for (int i=0;i<vetorA.length;i++) {
			if (vetorA[i]<15) {
				System.out.print(vetorA[i] + " ");
				somaElementosMenorQueQuinze = somaElementosMenorQueQuinze + vetorA[i];
				quantidade = quantidade +1;
			} else if (vetorA[i]==15) {
				quantidadeElementosIgualAQuinze = quantidadeElementosIgualAQuinze +1;
			} else {
				somaElementosMaiorQueQuinze = somaElementosMaiorQueQuinze + vetorA[i];
				quantidadeElementosMaiorAQuinze = quantidadeElementosMaiorAQuinze + 1;
			}
		}
		
		mediaElementosMaiorQueQuinze = somaElementosMaiorQueQuinze/quantidadeElementosMaiorAQuinze;
		
		System.out.println("\nA soma dos elementos menores que 15 é " + somaElementosMenorQueQuinze);
		System.out.println("\nA quantidade dos elementos iguais a 15 é " + quantidadeElementosIgualAQuinze);
		System.out.println("\nA media dos elementos maiores que 15 é " + mediaElementosMaiorQueQuinze);

		
		
		
		scanner.close();	
		
	}

}
