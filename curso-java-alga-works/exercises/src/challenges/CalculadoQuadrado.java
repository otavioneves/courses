package challenges;

import java.util.Scanner;

public class CalculadoQuadrado {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		System.out.print("Digite o n�mero que ser� elevado ao quadrado: ");
		Integer num = scanner.nextInt();
		
		Integer quadrado = num * num;
		
		System.out.println("O n�mero " + num + " ao quadro � " + quadrado);
		
		scanner.close();
		
	}

}
