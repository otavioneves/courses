package challenges;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class ListaTarefas {

	public static void main(String[] args) throws IOException {

		Scanner scanner = new Scanner(System.in);
		
		ArrayList<String> tarefas = new ArrayList<String>();
		
		System.out.print("Quantas tarefas você vai querer fazer hoje? ");
		Integer i = scanner.nextInt();
		
		
		for (int c=0;c<i;c++) {
			System.out.print("TAREFA: ");
			String tarefa = scanner.next();

			
			tarefas.add(tarefa);
		}
		
		Path arquivo = Paths.get("C:\\Users\\Carol e Otavio\\OneDrive\\Git\\courses\\curso-java-alga-works\\teste.txt");
		Files.write(arquivo,tarefas);
		
		
		scanner.close();
		
		System.out.println("Fim");
		
		
	}

}
