package challenges;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite a opera��o:");
		System.out.println("[1] Adi��o");
		System.out.println("[2] Subtra��o");
		System.out.println("[3] Multiplica��o");
		System.out.println("[4] Divis�o");
		Integer operacao = scanner.nextInt();
		System.out.print("Digite o primeiro n�mero: ");
		Double primeiroNumero = scanner.nextDouble();
		System.out.print("Digite o segundo n�mero: ");
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
		System.out.println("O resultado � " + resultado);
		scanner.close();
	}
}
