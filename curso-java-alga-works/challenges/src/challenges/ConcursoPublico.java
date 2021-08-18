package challenges;

import java.util.Scanner;

public class ConcursoPublico {
	static final Double NOTA_DE_CORTE_TOTAL = 150.0;
	static final Double NOTA_DE_CORTE_PROVA = 60.0;

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite a nota da prova de Portugu�s, de 0 � 100: ");
		Double notaPortugues = scanner.nextDouble();
		
		System.out.print("Digite a nota da prova de Matem�tica, de 0 � 100: ");
		Double notaMatematica = scanner.nextDouble();
		
		Double nota = notaMatematica + notaPortugues;
				
		if ((nota>=NOTA_DE_CORTE_TOTAL) && (notaMatematica>= NOTA_DE_CORTE_PROVA) && (notaPortugues>= NOTA_DE_CORTE_PROVA)) {
			System.out.println("Aprovado no concurso!");
		}
		else {
			System.out.println("N�o aprovado.");
		}
		
		System.out.println(nota);
		
		scanner.close();
		
	}

}
