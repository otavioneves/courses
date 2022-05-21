package com.otavio.curso.demo.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="CARGOS")
public abstract class Cargo extends AbstractEntity<Long> {

	
	@Column(name = "nome", nullable = false, unique = true, length = 60)
	private String nome;
	
	
	@ManyToOne			// anotação para criar a chave estrangeira.
	@JoinColumn(name="id_departamento_fk")			// anotação para criar a coluna dessa chave estrangeira.
	private Departamento departamento;

	
	@OneToMany(mappedBy="cargo")
	private List<Funcionario> funcionarios;
	

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Departamento getDepartamento() {
		return departamento;
	}


	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	
	
	
}
