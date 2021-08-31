package challenges;

import java.util.Scanner;

public class CalculadoraComParametros {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Você quer fazer uma adição [1] ou subtração [2]");
		Integer opcao = scanner.nextInt();
		
		Boolean verificador = (opcao<=0 || opcao>2);
		
		if (verificador) {
			System.err.println("Opção inválida!");
			System.exit(1);
		}
		
		System.out.print("Qual o primeiro número? ");
		Double primeiroNumero = scanner.nextDouble();
		
		System.out.print("Qual o primeiro número? ");
		Double segundoNumero = scanner.nextDouble();
		

		Double resultado = 0.0;
		
		switch (opcao) {
		case 1: resultado = adicao (primeiroNumero,segundoNumero);
			System.out.println(primeiroNumero+"+"+segundoNumero+"="+resultado);
			break;
		case 2: resultado = subtracao(primeiroNumero, segundoNumero);
			System.out.println(primeiroNumero+"-"+segundoNumero+"="+resultado);
			break;
		default:
			break;
		}
		
		
		scanner.close();		
	}

	
	static Double adicao (Double numero1,Double numero2) {
		Double adicaoMetodo = numero1 + numero2;
		return adicaoMetodo;
	}
	
	static Double subtracao (Double numero1,Double numero2) {
		Double subtracaoMetodo = numero1 - numero2;
		return subtracaoMetodo;
		
	}
}
