package br.com.otavio.java.io.teste;

import java.io.File;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeitura2 {

	public static void main(String[] args) throws IOException {

		Scanner scanner = new Scanner(new File("contas.csv"),"windows-1252");

		while (scanner.hasNextLine()) {
			String linha = scanner.nextLine();
			
			Scanner linhaScanner = new Scanner(linha);
			linhaScanner.useLocale(Locale.US);
			linhaScanner.useDelimiter(",");
			
			String valor1 = linhaScanner.next();
			int valor2 = linhaScanner.nextInt();
			int valor3 = linhaScanner.nextInt();
			String valor4 = linhaScanner.next();
			double valor5 = linhaScanner.nextDouble();

			System.out.format("%s %s %s %s %s %n", valor1,valor2,valor3,valor4,valor5);
			
			linhaScanner.close();
		}
		
		scanner.close();

	}

}
