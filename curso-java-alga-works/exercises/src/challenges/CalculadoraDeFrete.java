package challenges;

import java.util.Scanner;

public class CalculadoraDeFrete {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		System.out.print("Digite o valor do produto: ");
		Double valorProduto = scanner.nextDouble();
		
		if (valorProduto<100) {
			valorProduto=valorProduto + 15.0;
		}
		
		System.out.println("O valor final da compra é R$" + valorProduto);
		
		scanner.close();
	}

}
