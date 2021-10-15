package br.com.otavio.java.io.teste;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TesteSerializacao {

	public static void main(String[] args) throws IOException, ClassNotFoundException {


		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objeto.bin"));
		
		String nome = (String) ois.readObject();		// o método readObject lê e devolve um Object, por isso precisamos fazer um parse para String
		
		System.out.println(nome);
		
		ois.close();
		
//		String nome = "Otavio Neves";
//
//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("objeto.bin"));		//criamos um ObjectOutputStream através de um FileOutputStream criado, que recebe o arquivo aonde esses bytes serão armazenados.
//
//		oos.writeObject(nome);		// o método writObject recebe um objeto e transforma em um fluxo de bytes
//	
//		oos.close();

	}

}
