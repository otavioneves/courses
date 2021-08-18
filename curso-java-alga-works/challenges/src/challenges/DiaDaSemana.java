package challenges;

import java.util.Scanner;

public class DiaDaSemana {

	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Digite o número do dia da semana, de 1 à 7: ");
		Integer diaDaSemana = scanner.nextInt();
		
		switch (diaDaSemana) {
		case 1: System.out.println("Domingo!");
			break;
		case 2: System.out.println("Segunda!");
			break;
		case 3: System.out.println("Terça!");
			break;
		case 4: System.out.println("Quarta!");
			break;
		case 5: System.out.println("Quinta!");
			break;
		case 6: System.out.println("Sexta!");
			break;
		case 7: System.out.println("Sábado!");
			break;
		default:
			System.err.println("Digite um número válido, de1 à 7.");
			System.exit(1);
		}
		
		scanner.close();		
	}
}
