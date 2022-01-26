package br.com.otavio.spring.data.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import br.com.otavio.spring.data.orm.Funcionario;
import br.com.otavio.spring.data.repository.FuncionarioRepository;
import br.com.otavio.spring.data.specification.SpecificationFuncionario;

@Service
public class RelatorioFuncionarioDinamico {

	private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	private final FuncionarioRepository funcionarioRepository;

	public RelatorioFuncionarioDinamico(FuncionarioRepository funcionarioRepository) {
		this.funcionarioRepository = funcionarioRepository;
	}
	
	public void inicial(Scanner scanner) {
		
		System.out.print("Digite o nome: ");
		String nome = scanner.next();
		
		if (nome.equalsIgnoreCase("NULL")) {
			nome = null;			
		}
		
		System.out.print("Digite o CPF: ");
		String cpf = scanner.next();
		
		if (cpf.equalsIgnoreCase("NULL")) {
			cpf = null;			
		}
		
		System.out.print("Digite o Salario: ");
		Double salario = scanner.nextDouble();
		
		if (salario == 0 ) {
			salario = null;			
		}
		
		System.out.print("Digite a data de contratacao: ");
		String data = scanner.next();
		
		LocalDate dataContratacao = null;
		
		if (data.equalsIgnoreCase("NULL")) {
			data = null;			
		} else {
			dataContratacao = LocalDate.parse(data,formatter);
		}
		
		
		
		List<Funcionario> funcionarios = funcionarioRepository.findAll(Specification.where(SpecificationFuncionario.nome(nome))
				.or(SpecificationFuncionario.salario(salario))
				.or(SpecificationFuncionario.cpf(cpf))
				.or(SpecificationFuncionario.dataContratacao(dataContratacao))
				);
		
		funcionarios.forEach(System.out::println);
		
	}
	
	
}
