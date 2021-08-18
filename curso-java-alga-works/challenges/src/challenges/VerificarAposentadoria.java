package challenges;

import java.util.Scanner;

public class VerificarAposentadoria {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Quantos anos você tem? ");
		Integer idade = scanner.nextInt();
		
		System.out.print("Quantos anos de contribuição você tem? ");
		Integer contribuicao = scanner.nextInt();
		
		Boolean verificarIdade = idade >= 55;
		Boolean verificarContribuicao = contribuicao >= 25;
		
		Boolean verificador = verificarIdade && verificarContribuicao;
		
		if (verificador) {
			System.out.println("Você pode se aposentar.");
		}
		else {
			System.out.println("Você não pode se aposentar.");
		}
		
		
		scanner.close();
		
		
	}

}
