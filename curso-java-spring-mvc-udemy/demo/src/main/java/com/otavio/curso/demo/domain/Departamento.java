package com.otavio.curso.demo.domain;

import javax.persistence.*;

@Entity			// anotação para transformar essa classe em uma entidade gerenciada pela jpa.
@Table(name="DEPARTAMENTOS")			// anotação para informar o nome da tabela no banco de dados
public class Departamento extends AbstractEntity<Long>{

	@Column(name = "nome", nullable = false, unique = true, length = 60)		// anotação para informar o nome da coluna do atributo abaixo. O atributo nullable settado como false informa que essa coluna será obrigatório. A anotação unique define que a coluna é única.A anotação length informa o tamanho.
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
		
}
