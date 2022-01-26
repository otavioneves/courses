package br.com.otavio.spring.data.orm;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "unidadesDeTrabalho") // colocamos essa anotação para mostrarmos para o JPA que no banco de dados a tabela se chamará unidadeDeTrabalho
public class UnidadeDeTrabalho {

	@Id // anotação que informa que o atributo abaixo será o ID
	@GeneratedValue(strategy = GenerationType.IDENTITY) // definimos que o id será criado automático e qual a estratégia de geração do ID
	private Integer id;
	private String descricao;
	private String endereco;
	@ManyToMany(mappedBy="unidadesDeTrabalho",fetch = FetchType.EAGER)
	private List<Funcionario> funcionario;


	public UnidadeDeTrabalho(String descricao, String endereco) {
		this.descricao = descricao;
		this.endereco = endereco;
	}

	public UnidadeDeTrabalho() {
	}

	@Override
	public String toString() {
		return "UnidadeDeTrabalho [id=" + id + ", descricao=" + descricao + ", endereco=" + endereco + "]";
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

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public List<Funcionario> getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(List<Funcionario> funcionario) {
		this.funcionario = funcionario;
	}

	

}
