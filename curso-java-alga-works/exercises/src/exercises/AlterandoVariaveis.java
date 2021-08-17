package exercises;

import java.util.Scanner;

public class AlterandoVariaveis {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("VENDEDOR - Digite o valor do juros: ");
		Double juros = scanner.nextDouble();
		
		System.out.print("Digite o valor do produto: ");
		Double valor = scanner.nextDouble();		
		
		System.out.println("Para pagamento à vista digite [1].");
		System.out.println("Para pagamento à prazo digite [2].");
		Integer pagamento = scanner.nextInt();
		
		Boolean pagamentoAVista = pagamento.equals(1);
		Double valorFinal;
		
		if (pagamentoAVista) {
			valorFinal = valor;
		}
		else {
			valorFinal = valor*(1+juros/100);
		}

		System.out.println("O valor final do produto é R$" + valorFinal);
		
		
		scanner.close();
	}

}
