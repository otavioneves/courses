package exercises;

import java.util.Scanner;

public class TipoLogico {

	public static void main(String[] args) {
		Boolean variavelVerdadeira = true;
		System.out.println("Variavel verdadeira: " + variavelVerdadeira);
		Boolean variavelFalsa = false;
		System.out.println("Variavel falsa: " + variavelFalsa);
		
		System.out.println("-----------------------------------");
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Qual � a sua idade? ");
		
		Integer idade = scanner.nextInt();
		
		Boolean podeTirarCarteira = idade>=18;
		
		if (podeTirarCarteira) {
			System.out.println("Sim, voc� pode tirar a carteira!");
				
		} else {
			System.out.println("N�o, voc� n�o pode tirar a carteira");
			
		}
		
		System.out.println("Voc� pode tirar carteira? " + podeTirarCarteira);
		
		scanner.close();
	}
	

}
