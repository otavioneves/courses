package com.otavio.curso.demo.domain;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "FUNCIONARIOS")
public abstract class Funcionario extends AbstractEntity<Long> {

	@Column(nullable = false, unique = true)
	private String nome;
		
	@Column(nullable = false, columnDefinition = "DECIMAL (7,2) DEFAULT 0.00")		// AO INVÉS da aplicação retornar um erro, ele retorna uma snha EDP.
	private BigDecimal salario;
	
	@Column(name="data_entrada", nullable = false, columnDefinition = "DATE")
	private LocalDate dataEntrada;
	
	@Column(name="data_saida", columnDefinition = "DATE")
	private LocalDate dataSaída;

	@OneToOne(cascade= CascadeType.ALL)
	@JoinColumn(name="endereco_id_fk")
	private Endereco endereco;
	
	@ManyToOne
	@JoinColumn(name="cargo_id_fk")
	private Cargo cargo;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BigDecimal getSalario() {
		return salario;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}

	public LocalDate getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(LocalDate dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	public LocalDate getDataSaída() {
		return dataSaída;
	}

	public void setDataSaída(LocalDate dataSaída) {
		this.dataSaída = dataSaída;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}
	
}
