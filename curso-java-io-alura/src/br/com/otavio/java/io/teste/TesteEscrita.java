package br.com.otavio.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscrita {

	public static void main(String[] args) throws IOException {

		OutputStream fos = new FileOutputStream("lorem2.txt");
		
		Writer osw = new OutputStreamWriter(fos);
		
		BufferedWriter bw = new BufferedWriter(osw);
		
		bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam eget ligula eu lectus lobortis condimentum.");
		bw.newLine();
		bw.write("auhuahauh auhauhauh uahuahu hauhu");
		
		bw.close();
		
	}

}
