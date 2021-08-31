package challenges;

import java.util.Scanner;

public class NotaAlunoComConstante {
	static final Integer MEDIA_PARA_SER_APROVADO = 70;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Qual a nota do aluno? ");
		Double nota = scanner.nextDouble();
		
		if (nota>=MEDIA_PARA_SER_APROVADO) {
			System.out.println("Aluno aprovado com nota " + nota);
		}
		else {
			System.out.println("Aluno reprovado com nota " + nota);
		}
		
		scanner.close();
	}

}
