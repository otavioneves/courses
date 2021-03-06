package br.com.otavio.spring.data.orm;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "cargos") // colocamos essa anotação para mostrarmos para o JPA que no banco de dados a tabela se chamará cargos
public class Cargo {

	@Id // anotação que informa que o atributo abaixo será o ID
	@GeneratedValue(strategy = GenerationType.IDENTITY) // definimos que o id será criado automático e qual a estratégia de geração do ID
	private Integer id;
	private String descricao;
	@OneToMany(mappedBy="cargo")
	private List<Funcionario> funcionario;

	public Cargo() {
	}
	
	

	@Override
	public String toString() {
		return "Cargo [id=" + id + ", descricao=" + descricao + "]";
	}



	public Cargo(String descricao) {
		this.descricao = descricao;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}



	public List<Funcionario> getFuncionario() {
		return funcionario;
	}



	public void setFuncionario(List<Funcionario> funcionario) {
		this.funcionario = funcionario;
	}

	
	
}
