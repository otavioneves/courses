package com.otavio.cursojava.aula19.labs;

import java.text.DecimalFormat;
import java.util.Random;
//import java.util.Scanner;

public class Exer19 {

	public static void main(String[] args) {

		//Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		double[] notasP1 = new double[10];
		double[] notasP2 = new double[notasP1.length];
		double[] result = new double[notasP1.length];

		DecimalFormat df = new DecimalFormat ("###,###.#");
		
		for (int i=0;i<notasP1.length;i++) {
			System.out.println("Digite a a nota da P1 do " + (i+1)+"º aluno: ");
			notasP1[i] = random.nextInt(10);
			System.out.println("Digite a a nota da P2 do " + (i+1)+"º aluno: ");
			notasP2[i] = random.nextInt(10);
		}
		
		for (int i=0;i<notasP1.length;i++) {
			result[i] = ((notasP1[i] + notasP2[i])/2);
			System.out.println("----------------------");
			System.out.println("O aluno " + i + " tem nota na P1 de " + df.format(notasP1[i]) + " e na P2 de " + df.format(notasP2[i]));
			if (result [i]>=7) {
				System.out.println("A sua média é de " + df.format((result[i])) + " e ele está aprovado.");
			} else {
				System.out.println("A sua média é de " + df.format(result[i]) + " e ele está reprovado.");
				System.out.println("----------------------");
			}
				
		//scanner.close();
		}
	}	
}
