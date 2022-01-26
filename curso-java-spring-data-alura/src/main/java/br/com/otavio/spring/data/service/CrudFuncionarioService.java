package br.com.otavio.spring.data.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import org.springframework.stereotype.Service;

import br.com.otavio.spring.data.orm.Cargo;
import br.com.otavio.spring.data.orm.Funcionario;
import br.com.otavio.spring.data.orm.UnidadeDeTrabalho;
import br.com.otavio.spring.data.repository.CargoRepository;
import br.com.otavio.spring.data.repository.FuncionarioRepository;
import br.com.otavio.spring.data.repository.UnidadeDeTrabalhoRepository;

@Service
public class CrudFuncionarioService {

	private Boolean system = true;
	private final FuncionarioRepository funcionarioRepository;
	private final CargoRepository cargoRepository;
	private final UnidadeDeTrabalhoRepository unidadeDeTrabalhoRepository;

	public CrudFuncionarioService(FuncionarioRepository funcionarioRepository, CargoRepository cargoRepository, UnidadeDeTrabalhoRepository unidadeDeTrabalhoRepository) {
		this.cargoRepository = cargoRepository;
		this.funcionarioRepository = funcionarioRepository;
		this.unidadeDeTrabalhoRepository = unidadeDeTrabalhoRepository;
	}

	public void inicial(Scanner scanner) {
		while(system) {
			System.out.println("Qual ação de cargo deseja executar?");
			System.out.println("0 - Sair");
			System.out.println("1 - Salvar");
			System.out.println("2 - Atualizar");
			System.out.println("3 - Visualizar");
			System.out.println("4 - Deletar");
			
			int action = scanner.nextInt();
			
			switch (action) {
			case 1: {
				salvar(scanner);
				break;			
			}
			case 2: {
				atualizar(scanner);
				break;			
			}
			case 3: {
				visualizar();
				break;			
			}
			case 4: {
				deletar(scanner);
				break;			
			}
			default:
				system=false;
				break;
			}
		}
	}

	private void salvar(Scanner scanner) {

		System.out.print("Nome do funcionario: ");
		String nome = scanner.next();
		System.out.print("CPF: ");
		String cpf= scanner.next();
		System.out.print("Salario: ");
		Double salario= scanner.nextDouble();
		
        System.out.println("Digite o cargoId");
        Integer cargoId = scanner.nextInt();
		
        
        List<UnidadeDeTrabalho> unidades = unidade(scanner);


		Funcionario funcionario = new Funcionario(nome,cpf,salario);
        Optional<Cargo> cargo = cargoRepository.findById(cargoId);
        funcionario.setCargo(cargo.get());
        funcionario.setUnidadesDeTrabalho(unidades);
		funcionarioRepository.save(funcionario);
		System.out.println("Salvo");

	}

	private List<UnidadeDeTrabalho> unidade(Scanner scanner) {
        Boolean isTrue = true;
        List<UnidadeDeTrabalho> unidades = new ArrayList<>();

        while (isTrue) {
            System.out.println("Digite o unidadeId (Para sair digite 0)");
            Integer unidadeId = scanner.nextInt();

            if(unidadeId != 0) {
                Optional<UnidadeDeTrabalho> unidade = unidadeDeTrabalhoRepository.findById(unidadeId);
                unidades.add(unidade.get());
            } else {
                isTrue = false;
            }
        }

        return unidades;
    }
	
	private void atualizar(Scanner scanner) {
		
		System.out.println("Digite o id");
        Integer id = scanner.nextInt();

        System.out.println("Digite o nome");
        String nome = scanner.next();

        System.out.println("Digite o cpf");
        String cpf = scanner.next();

        System.out.println("Digite o salario");
        Double salario = scanner.nextDouble();

        System.out.println("Digite o cargoId");
        Integer cargoId = scanner.nextInt();

        Funcionario funcionario = new Funcionario();
        funcionario.setId(id);
        funcionario.setNome(nome);
        funcionario.setCpf(cpf);
        funcionario.setSalario(salario);
        Optional<Cargo> cargo = cargoRepository.findById(cargoId);
        funcionario.setCargo(cargo.get());

        funcionarioRepository.save(funcionario);
        System.out.println("Alterado");
		System.out.println("Atualizado");

	}
	
	private void visualizar() {
		Iterable<Funcionario> funcionarios = funcionarioRepository.findAll();
		
		funcionarios.forEach(funcionario -> System.out.println(funcionario.toString()));
		
	}
	
	private void deletar(Scanner scanner) {
		
		System.out.print("Id: ");
		int id = scanner.nextInt();
		funcionarioRepository.deleteById(id);
		System.out.println("Deletado");
		
	}

}
