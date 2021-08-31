package challenges;

import java.util.Scanner;

public class ConcursoPublico {
	static final Double NOTA_DE_CORTE_TOTAL = 150.0;
	static final Double NOTA_DE_CORTE_PROVA = 60.0;

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite a nota da prova de Português, de 0 à 100: ");
		Double notaPortugues = scanner.nextDouble();
		
		System.out.print("Digite a nota da prova de Matemática, de 0 à 100: ");
		Double notaMatematica = scanner.nextDouble();
		
		Double nota = notaMatematica + notaPortugues;
				
		if ((nota>=NOTA_DE_CORTE_TOTAL) && (notaMatematica>= NOTA_DE_CORTE_PROVA) && (notaPortugues>= NOTA_DE_CORTE_PROVA)) {
			System.out.println("Aprovado no concurso!");
		}
		else {
			System.out.println("Não aprovado.");
		}
		
		System.out.println(nota);
		
		scanner.close();
		
	}

}
