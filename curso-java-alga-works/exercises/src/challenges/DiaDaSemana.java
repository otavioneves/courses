package challenges;

import java.util.Scanner;

public class DiaDaSemana {

	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Digite o n�mero do dia da semana, de 1 � 7: ");
		Integer diaDaSemana = scanner.nextInt();
		
		switch (diaDaSemana) {
		case 1: System.out.println("Domingo!");
			break;
		case 2: System.out.println("Segunda!");
			break;
		case 3: System.out.println("Ter�a!");
			break;
		case 4: System.out.println("Quarta!");
			break;
		case 5: System.out.println("Quinta!");
			break;
		case 6: System.out.println("Sexta!");
			break;
		case 7: System.out.println("S�bado!");
			break;
		default:
			System.err.println("Digite um n�mero v�lido, de1 � 7.");
			System.exit(1);
		}
		
		scanner.close();		
	}
}
