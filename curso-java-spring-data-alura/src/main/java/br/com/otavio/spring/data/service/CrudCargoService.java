package br.com.otavio.spring.data.service;

import java.util.Scanner;

import org.springframework.stereotype.Service;

import br.com.otavio.spring.data.orm.Cargo;
import br.com.otavio.spring.data.repository.CargoRepository;

@Service
public class CrudCargoService {

	private final CargoRepository cargoRepository;

	public CrudCargoService(CargoRepository cargoRepository) {
		this.cargoRepository = cargoRepository;
	}
	
	public void inicial(Scanner scanner) {
		salvar(scanner);
	}
	
	private void salvar(Scanner scanner) {
		
		System.out.print("Descricao do cargo: ");
		String descricao = scanner.next();
		
		Cargo cargo = new Cargo();
		cargo.setDescricao(descricao);
		cargoRepository.save(cargo);
		System.out.println("Salvo");
		
	}
	
	private void atualizar (Scanner scanner) {
		
		System.out.print("Id: ");
		int id = scanner.nextInt();
		System.out.print("Nova Descricao do cargo: ");
		String descricao = scanner.next();
		
		Cargo cargo = new Cargo();
		cargo.setDescricao(descricao);
		cargoRepository.save(cargo);
		System.out.println("Salvo");
		
	}
	
	
}
