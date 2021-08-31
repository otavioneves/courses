package challenges;

import java.util.Scanner;

public class CalculadoQuadrado {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		System.out.print("Digite o número que será elevado ao quadrado: ");
		Integer num = scanner.nextInt();
		
		Integer quadrado = num * num;
		
		System.out.println("O número " + num + " ao quadro é " + quadrado);
		
		scanner.close();
		
	}

}
