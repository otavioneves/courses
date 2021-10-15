package br.com.otavio.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.Socket;

public class TesteCopiaArquivo {

	public static void main(String[] args) throws IOException {

		Socket s = new Socket();
		
		
		InputStream fis = s.getInputStream();	//(rede)		// ou System.out (teclado)	// ou new FileInputStream("lorem.txt"); (arquivo)
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		
		OutputStream fos = s.getOutputStream();		//(rede)		// ou System.in (console)		// ou new FileOutputStream("lorem2.txt"); (arquivo)
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		
		String linha = br.readLine();
		
		while(linha != null) {
			
			bw.write(linha);
			bw.newLine();
			linha = br.readLine();
			
		}
		
		bw.close();
		br.close();
		
	}

}
