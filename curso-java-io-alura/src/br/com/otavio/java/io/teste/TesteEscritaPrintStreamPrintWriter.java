package br.com.otavio.java.io.teste;

import java.io.IOException;
import java.io.PrintWriter;

public class TesteEscritaPrintStreamPrintWriter {

	public static void main(String[] args) throws IOException {
		
		PrintWriter pw = new PrintWriter("lorem2.txt");
		
		pw.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam eget ligula eu lectus lobortis condimentum.");
		pw.println("auhuahauh auhauhauh uahuahu hauhu");
		
		pw.close();
		
	}

}
