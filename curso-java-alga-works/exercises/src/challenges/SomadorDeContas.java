package challenges;

import java.util.Scanner;

public class SomadorDeContas {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o valor da conta de luz: ");
		Double contaLuz = scanner.nextDouble();
		
		System.out.print("Digite o valor da conta de agua: ");
		Double contaAgua = scanner.nextDouble();
		
		System.out.print("Digite o valor da conta de telefone: ");
		Double contaTelefone = scanner.nextDouble();
		
		System.out.print("Digite o valor da escola do filho: ");
		Double escolaFilho = scanner.nextDouble();
		
		System.out.print("Digite o valor da conta de fatura do cartão: ");
		Double faturaCartao = scanner.nextDouble();
		
		System.out.print("Digite o valor dos gastos com supermercado: ");
		Double gastosSupermercado = scanner.nextDouble();

		Double gastosTotais = 0.0;
				
		gastosTotais += contaLuz;
		gastosTotais += contaAgua;
		gastosTotais += contaTelefone;
		gastosTotais += escolaFilho;
		gastosTotais += faturaCartao;
		gastosTotais += gastosSupermercado;
		
		System.out.println("Os gastos totais foram de R$" + gastosTotais);
		
		scanner.close();
		
	}

}
