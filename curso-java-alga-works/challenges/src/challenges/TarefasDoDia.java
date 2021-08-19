package challenges;

import java.util.Scanner;

public class TarefasDoDia {

	public static void main(String[] args) {

		String[] tarefas = new String[6];
		
		Scanner scanner = new Scanner(System.in);
		
		for (int i=1; i<tarefas.length ;i++){
			System.out.print("Digite a sua "+i+"a tarefa do dia: ");
			tarefas[i] = scanner.next();
		}
		
		System.out.println("Suas tarefas do dia são: ");
		
		for (int c=1; c<tarefas.length; c++) {
			System.out.println(tarefas[c]);			
		}
		
		scanner.close();
		
		
	}

}
