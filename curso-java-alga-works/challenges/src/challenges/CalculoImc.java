package challenges;

import java.util.Scanner;

public class CalculoImc {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o seu peso em kg:");
		Double peso = scanner.nextDouble();

		System.out.print("Digite a sua altura em metros: ");
		Double altura = scanner.nextDouble();
		
		Double imc = peso / (altura * altura);
		
		System.out.println("IMC: " + imc);
		
		scanner.close();
	}

}
