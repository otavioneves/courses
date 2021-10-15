package br.com.otavio.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteEscritaFileWritter {

	public static void main(String[] args) throws IOException {

		FileWriter fw = new FileWriter("lorem2.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam eget ligula eu lectus lobortis condimentum.");
		bw.write(System.lineSeparator());		// o lineSeparator devolve uma string com as características de cada sistema operacional responsável por pular linha
		bw.write("auhuahauh auhauhauh uahuahu hauhu");
		
		bw.close();
		
	}

}
