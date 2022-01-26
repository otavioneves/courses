package br.com.otavio.spring.data;

import java.util.Scanner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.otavio.spring.data.service.CrudCargoService;
import br.com.otavio.spring.data.service.CrudFuncionarioService;
import br.com.otavio.spring.data.service.CrudUnidadeDeTrabalhoService;
import br.com.otavio.spring.data.service.RelatoriosService;

@SpringBootApplication
public class SpringDataApplication implements CommandLineRunner {

	private final CrudCargoService cargoService;
	private final CrudFuncionarioService funcionarioService;
	private final CrudUnidadeDeTrabalhoService unidadeDeTrabalhoService;
	private final RelatoriosService relatoriosService;

	private Boolean system = true;

	public SpringDataApplication(CrudCargoService cargoService, CrudFuncionarioService funcionarioService, CrudUnidadeDeTrabalhoService unidadeDeTrabalhoService, RelatoriosService relatoriosService) { // cria uma SpringDataApplication com uma instância do
		// CargoRepository
		this.cargoService = cargoService;
		this.funcionarioService = funcionarioService;
		this.unidadeDeTrabalhoService = unidadeDeTrabalhoService;
		this.relatoriosService = relatoriosService;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringDataApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Scanner scanner = new Scanner(System.in);

		while (system) {
			System.out.println("Qual acao voce quer executar?");
			System.out.println("0 - Sair");
			System.out.println("1 - Cargo");
			System.out.println("2 - Funcionario");
			System.out.println("3 - Unidade De Trabalho");
			System.out.println("4 - Relatorios da aplicação");
			
			int action = scanner.nextInt();

			switch (action) {
			case 1: {
				cargoService.inicial(scanner);
				break;			
			}
			case 2: {
				funcionarioService.inicial(scanner);
				break;			
			}
			case 3: {
				unidadeDeTrabalhoService.inicial(scanner);
				break;			
			}
			case 4: {
				relatoriosService.inicial(scanner);
				break;			
			}
			default:
				system=false;
				break;
			}
		

		}

	}

}
