package com.otavio.curso.demo.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;


@SuppressWarnings("serial")
@Entity
@Table(name = "ENDERECOS")
public abstract class Endereco extends AbstractEntity<Long> {

	@Column(nullable = false)
	private String bairro;
	
	@Column(nullable = false, length = 9)
	private String cep;
	
	@Column(nullable = false)
	private String cidade;
	
	private String complemento;
	
	@Column(nullable = false)
	private String logradouro;
	
	@Column(nullable = false, length = 5)
	private Integer numero;
	
	@Column(nullable = false, length = 2)
	@Enumerated(EnumType.STRING)			// informa que queremos salvar no banco de dados o objeto tipo strind do objeto UF
	private UF uf;

	public Endereco(String bairro, String cep, String cidade, String complemento, String logradouro, Integer numero,
			UF uf) {
		super();
		this.bairro = bairro;
		this.cep = cep;
		this.cidade = cidade;
		this.complemento = complemento;
		this.logradouro = logradouro;
		this.numero = numero;
		this.uf = uf;
	}
	
	
	
	
}
