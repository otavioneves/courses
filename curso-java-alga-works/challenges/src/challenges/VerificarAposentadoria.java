package challenges;

import java.util.Scanner;

public class VerificarAposentadoria {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Quantos anos voc� tem? ");
		Integer idade = scanner.nextInt();
		
		System.out.print("Quantos anos de contribui��o voc� tem? ");
		Integer contribuicao = scanner.nextInt();
		
		Boolean verificarIdade = idade >= 55;
		Boolean verificarContribuicao = contribuicao >= 25;
		
		Boolean verificador = verificarIdade && verificarContribuicao;
		
		if (verificador) {
			System.out.println("Voc� pode se aposentar.");
		}
		else {
			System.out.println("Voc� n�o pode se aposentar.");
		}
		
		
		scanner.close();
		
		
	}

}
