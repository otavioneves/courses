package challenges;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite a operação:");
		System.out.println("[1] Adição");
		System.out.println("[2] Subtração");
		System.out.println("[3] Multiplicação");
		System.out.println("[4] Divisão");
		Integer operacao = scanner.nextInt();
		System.out.print("Digite o primeiro número: ");
		Double primeiroNumero = scanner.nextDouble();
		System.out.print("Digite o segundo número: ");
		Double segundoNumero = scanner.nextDouble();
		
		Double resultado = null;
		if (operacao.equals(1)) {
			resultado=primeiroNumero+segundoNumero;
		}	
		if (operacao.equals(2)) {
				resultado=primeiroNumero-segundoNumero;
		}
		if (operacao.equals(3)) {
					resultado=primeiroNumero*segundoNumero;
		}
		if (operacao.equals(4)) {
						resultado=primeiroNumero/segundoNumero;
		}
		System.out.println("O resultado é " + resultado);
		scanner.close();
	}
}
