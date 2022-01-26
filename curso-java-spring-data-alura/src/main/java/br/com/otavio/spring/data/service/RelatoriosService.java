package br.com.otavio.spring.data.service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import org.hibernate.internal.build.AllowSysOut;
import org.springframework.stereotype.Service;

import br.com.otavio.spring.data.orm.Funcionario;
import br.com.otavio.spring.data.repository.FuncionarioRepository;

@Service
public class RelatoriosService {

	private Boolean system = true;
	private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	private final FuncionarioRepository funcionaroRepository;

	public RelatoriosService(FuncionarioRepository funcionaroRepository) {

		this.funcionaroRepository = funcionaroRepository;
	}

	public void inicial(Scanner scanner) {
		while (system) {
			System.out.println("Qual ação de relatório você deseja executar?");
			System.out.println("0 - Sair");
			System.out.println("1 - Busca funcionario por nome");
			System.out.println("2 - Busca funcionario por nome, data e salario");
			System.out.println("3 - Busca funcionario por data maior que");

			int action = scanner.nextInt();

			switch (action) {
			case 1: {
				buscaFuncionarioNome(scanner);
				break;
			}
			case 2: {
				buscaFuncionarioNomeSalarioMaiorData(scanner);
				break;
			}
			case 3: {
				buscaFuncionarioDataContratacaoMaior(scanner);
				break;
			}
			default:
				system = false;
				break;
			}
		}
	}

	private void buscaFuncionarioNome(Scanner scanner) {
		System.out.println("Nome: ");
		String nome = scanner.next();

		List<Funcionario> list = funcionaroRepository.findByNome(nome);

		list.forEach(System.out::println);

	}

	private void buscaFuncionarioNomeSalarioMaiorData(Scanner scanner) {
		System.out.println("Nome: ");
		String nome = scanner.next();

		System.out.println("Data: ");
		String data = scanner.next();
		LocalDate localDate = LocalDate.parse(data, formatter);

		System.out.println("Salario: ");
		Double salario = scanner.nextDouble();
		
		List<Funcionario> list = funcionaroRepository.findNomeSalarioMaiorDataContratacao(nome, salario, localDate);
		
		list.forEach(System.out::println);

	}
	

	private void buscaFuncionarioDataContratacaoMaior(Scanner scanner) {
		System.out.println("Data: ");
		String data = scanner.next();
		LocalDate localDate = LocalDate.parse(data, formatter);
		
		List<Funcionario> list = funcionaroRepository.findDataContratacaoMaior(localDate);
		
		list.forEach(System.out::println);

	}

}
