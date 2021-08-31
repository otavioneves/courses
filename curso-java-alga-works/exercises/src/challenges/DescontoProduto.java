package challenges;

import java.util.Scanner;

public class DescontoProduto {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o valor do Produto: ");
		Double valorProduto = scanner.nextDouble();
		System.out.print("Digite a quantidade do Produto: ");
		Double quantidadeProduto = scanner.nextDouble();
				
		Double valor=valorProduto * quantidadeProduto;
			
		if(quantidadeProduto>=10) {
		valor = valor * 0.9;
		}
		
		System.out.println("O valor final da compra de " + quantidadeProduto +" produtos é " + valor);
		scanner.close();
		
	}

}
