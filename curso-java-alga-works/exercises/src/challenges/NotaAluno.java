package challenges;

import java.util.Scanner;

public class NotaAluno {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Qual a nota do aluno? ");
		Integer nota = scanner.nextInt();		
		Boolean verif = nota >= 70;
		
		if (verif) {
			System.out.println("Aluno Aprovado");
		}
		else {
			System.out.println("Aluno Reprovado");
		}
		
		
		scanner.close();
	}

}
