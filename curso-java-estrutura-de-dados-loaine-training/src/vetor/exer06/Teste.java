package vetor.exer06;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Lista<Contato> lista = new Lista<Contato>(20);

		int opcao = 1;

		while (opcao != 0){

			opcao = obterOpcaoMenu(scan);

			switch (opcao) {
			case 1:
				adicionarContatoFinal(scan, lista);
				break;
			case 2:
				adicionarContatoPosicao(scan, lista);
				break;
			case 3: 
				obtemContatoPosicao(scan, lista);
				break;
			case 4: 
				obtemContato(scan, lista);
				break;
			case 5: 
				pesquisarUltimoIndice(scan, lista);
				break;
			case 6: 
				pesquisarContatoExiste(scan, lista);
				break;	
			case 7: 
				excluirPorPosicao(scan, lista);
				break;	
			case 8: 
				excluirContato(scan, lista);
				break;	
			case 9:
				imprimeTamanhoVetor(lista);
				break;
			case 10:
				limparVetor(lista);
				break;
			case 11:
				imprimirVetor(lista);
				break;	
			default:
				break;
			}
		}

		scan.close();
	}

	public static String leInformacao(String mensagem, Scanner scan) {

		System.out.print(mensagem);

		String entrada = scan.nextLine();

		return entrada;

	}

	protected static int leInformacaoInt(String msg, Scanner scan){

		boolean entradaValida = false;
		int num = 0;

		while (!entradaValida){

			try {

				System.out.println(msg);
				String entrada = scan.nextLine();

				num = Integer.parseInt(entrada);

				entradaValida = true;

			} catch (Exception e){
				System.out.println("Entrada inv�lida, digite novamente");
			}
		}

		return num;
	}


	public static void adicionarContatoFinal(Scanner scan, Lista<Contato> lista){

		String nome = leInformacao("Digite o nome do Contato: ", scan);

		String telefone = leInformacao("Digite o telefone do Contato: ", scan);

		String email = leInformacao("Digite o email do Contato: ", scan);

		Contato contato = new Contato(nome,telefone,email);

		lista.adiciona(contato);

	}

	public static void adicionarContatoPosicao(Scanner scan, Lista<Contato> lista){

		String nome = leInformacao("Digite o nome do Contato: ", scan);

		String telefone = leInformacao("Digite o telefone do Contato: ", scan);

		String email = leInformacao("Digite o email do Contato: ", scan);

		int posicao = leInformacaoInt("Digite a posi��o: ", scan);

		Contato contato = new Contato(nome,telefone,email);

		try {
			lista.adiciona(posicao, contato);
		} catch (Exception e) {
			System.out.println("Posi��o inv�lida. Contato n�o adicionado.");
		}

		System.out.println("Contato adicionado com sucesso!");
	}

	public static void obtemContatoPosicao(Scanner scan, Lista<Contato> lista){

		int posicao = leInformacaoInt("Digite a posi��o: ", scan);

		try {
			Contato contato = lista.busca(posicao);
			System.out.println(contato);
		} catch (Exception e) {
			System.out.println("Posi��o inv�lida. Contato n�o encontrado.");
		}

	}

	public static void obtemContato(Scanner scan, Lista<Contato> lista){

		int pos = leInformacaoInt("Entre com a posi��o a ser pesquisada", scan);

		try {

			Contato contato = lista.busca(pos);

			System.out.println("Contato existe, seguem dados:");
			System.out.println(contato);

			System.out.println("Fazendo pesquisa do contato encontrado:");
			pos = lista.busca(contato);

			System.out.println("Contato encontrado na posi��o " + pos);

		} catch (Exception e) {
			System.out.println("Posi��o inv�lida!");
		}
	}


	public static void pesquisarUltimoIndice(Scanner scan, Lista<Contato> lista){

		int pos = leInformacaoInt("Entre com a posi��o a ser pesquisada", scan);

		try {

			Contato contato = lista.busca(pos);

			System.out.println("Contato existe, seguem dados:");
			System.out.println(contato);

			System.out.println("Fazendo pesquisa do �ltimo �ndice do contato encontrado:");
			pos = lista.ultimoIndice(contato);

			System.out.println("Contato encontrado na posi��o " + pos);

		} catch (Exception e) {
			System.out.println("Posi��o inv�lida!");
		}

	}

	public static void pesquisarContatoExiste(Scanner scan, Lista<Contato> lista){

		int pos = leInformacaoInt("Entre com a posi��o a ser pesquisada", scan);

		try {

			Contato contato = lista.busca(pos);

			boolean existe = lista.contem(contato);

			if (existe){
				System.out.println("Contato existe, seguem dados:");
				System.out.println(contato);
			} else {
				System.out.println("Contato n�o existe");
			}

		} catch (Exception e) {
			System.out.println("Posi��o inv�lida!");
		}

	}

	public static void excluirPorPosicao(Scanner scan, Lista<Contato> lista){

		int posicao = leInformacaoInt("Digite a posi��o � ser exclu�da: ", scan);
		
		try {
			
			System.out.println("O contato exclu�do � o: " + lista.busca(posicao));

			lista.remove(posicao);
			
			System.out.println("Contato exclu�do");
		} catch (Exception e) {
			System.out.println("Posi��o Inv�lida.");					
		}

	}

	public static void excluirContato(Scanner scan, Lista<Contato> lista){

		int posicao = leInformacaoInt("Digite a posi��o � ser exclu�da: ", scan);

		try {
			Contato contato = lista.busca(posicao);
						
			System.out.println("O contato exclu�do � o: " + lista.busca(posicao));

			lista.remove(contato);
			
			System.out.println("Contato exclu�do");
		} catch (Exception e) {
			System.out.println("Posicao inv�lida");
		}
		


	}

	public static void imprimeTamanhoVetor(Lista<Contato> lista){

		System.out.println("O tamanho do vetor � de " + lista.tamanho() + " elementos.");
		
	}

	public static void limparVetor(Lista<Contato> lista){

		lista.clear();
		
		System.out.println("Vetor limpo");
		
		imprimirVetor(lista);
	
	}

	public static void imprimirVetor(Lista<Contato> lista){

		System.out.println(lista);
		
	}



	private static int obterOpcaoMenu(Scanner scan) {

		boolean entradaValida = false;
		int opcao = 0;
		String entrada;

		while (!entradaValida){

			System.out.println("Digite a op��o desejada:");
			System.out.println("1: Adiciona contato no final do vetor");
			System.out.println("2: Adiciona contato em uma posi��o espec�fica");
			System.out.println("3: Obt�m contato de uma posi��o espec�fica");
			System.out.println("4: Consulta contato");
			System.out.println("5: Consulta �ltimo �ndide do contato");
			System.out.println("6: Verifica se contato existe");
			System.out.println("7: Excluir por posi��o");
			System.out.println("8: Excluir contato");
			System.out.println("9: Verifica tamanho do vetor");
			System.out.println("10: Excluir todos os contatos do vetor");
			System.out.println("11: Imprime vetor");
			System.out.println("0: Sair");

			try {

				entrada = scan.nextLine();
				opcao = Integer.parseInt(entrada);

				if (opcao >= 0 && opcao <= 11){
					entradaValida = true;
				} else {
					throw new Exception();
				}

			} catch (Exception e){

				System.out.println("Entrada inv�lida, digite novamente\n\n");
			}
		}

		return opcao;
	}




	public static void criarContatosDinamicamente(Lista<Contato> agenda, int quantidade) {

		Contato contato;

		for (int i = 0; i<quantidade;i++) {

			contato = new Contato("Contato " + i,"1111111"+i,i+"contato@email.com");

			agenda.adiciona(contato);
		}

	}

}
