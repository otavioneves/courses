package challenges;

import java.util.Scanner;

public class CalculoPlr {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite a meta do ano de 2020: ");
		Double meta2020 = scanner.nextDouble();
		
		System.out.print("Digte o faturamento real do ano de 2020: ");
		Double faturamento2020 = scanner.nextDouble();
		
		System.out.print("Digite o salário média do funcionário em 2020: ");
		Double mediaSalario2020 = scanner.nextDouble();
		
		Double bonus = 0.0;
				
		if (faturamento2020>=meta2020) {
			bonus = mediaSalario2020;
		}
		else if (faturamento2020>=(meta2020*0.8)) {
			bonus = mediaSalario2020*0.8;
		}
		else {
			bonus = 0.0;
		}
		
		System.out.println("O bonus do funcionário é de R$" + bonus);
		scanner.close();	
	}

}
