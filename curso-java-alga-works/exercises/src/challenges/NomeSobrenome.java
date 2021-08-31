package challenges;

import java.util.Scanner;

public class NomeSobrenome {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Qual é o seu nome? ");
		String nome = scanner.nextLine();
		
		System.out.println("Qual é o seu sobrenome? ");
		String sobrenome = scanner.nextLine();
		
		System.out.println("Prazer, " + nome +" "+sobrenome);
		scanner.close();
	}

}
