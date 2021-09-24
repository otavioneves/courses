package com.otavio.cursojava.aula52.labs;

import java.util.Scanner;

public class teste {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Agenda agenda = new Agenda();
		
		int opcao = obterOpcaoMenu(scanner);
		
		if (opcao == 1) {

			consultarContato(scanner, agenda);
			
		} else if (opcao ==2) {
			
			adicionarContato(scanner, agenda);
			
		} else if (opcao==3) {
			System.exit(0);
		}
		
		
		
		scanner.close();
	}
	
	public static void adicionarContato(Scanner scanner, Agenda agenda) {
		try {
		System.out.println("Criando um contato, entre com as informações");
		
		String nome = leInformacaoString(scanner, "Nome: ");
		String email = leInformacaoString(scanner, "E-mail: ");
		String telefone = leInformacaoString(scanner, "Telefone: ");
		
		Contato contato = new Contato(nome, telefone, email);
		
			agenda.adicionarContato(contato);
		} catch (AgendaCheiaException e) {
			System.out.println(e.getMessage());
			System.out.println(agenda.toString());
		}
		
	}
	
	public static void consultarContato(Scanner scanner, Agenda agenda) {
		String nomeContato = leInformacaoString(scanner, "Entre com o nome do contato à pesquisar: ");
		
		try {
			if (agenda.consultarContatoPorNome(nomeContato)>=0) {
				System.out.println("Contato existe.");
			}
		} catch (ContatoNaoExiste e) {
			System.out.println(e.getMessage());
		}
	}
	
	
	public static String leInformacaoString(Scanner scanner, String msg) {
		System.out.println(msg);
		String entrada = scanner.nextLine();
		return entrada;
	}
	
	
	
	
	public static int obterOpcaoMenu(Scanner scanner) {
		
		boolean entradaValida = false;
		int escolha = 3;
		
		while (!entradaValida) {
		System.out.print("Digite 1 para consultar um contato e 2 para adicionar um contato e 3 para sair: ");
		
		try {
			escolha = scanner.nextInt();
			
			if (escolha==1||escolha==2||escolha==3) {
				entradaValida = true;
			} else {
				throw new Exception("Entrada Inválida");

			}
		}
		catch (Exception e) {
			System.out.println("Entrada inválida, digite novamente.");
		}
	
		}
		return escolha;
	}

}
