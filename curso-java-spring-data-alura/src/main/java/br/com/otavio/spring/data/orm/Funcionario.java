package br.com.otavio.spring.data.orm;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name = "funcionarios") // colocamos essa anotação para mostrarmos para o JPA que no banco de dados a tabela se chamará funcionarios
public class Funcionario {

	@Id // anotação que informa que o atributo abaixo será o ID
	@GeneratedValue(strategy = GenerationType.IDENTITY) // definimos que o id será criado automático e qual a estratégia de geração do ID
	private Integer id;
	private String nome;
	private String cpf;
	private Double salario;
	private LocalDate data= LocalDate.now();
	@ManyToOne
	@JoinColumn(name="cargo_id", nullable=false)
	private Cargo cargo;
	@Fetch(FetchMode.SELECT)
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name="funcionarios_unidades", joinColumns= {
			@JoinColumn(name="fk_funcionario") },
	inverseJoinColumns = { @JoinColumn(name="fk_unidade") })
	private List<UnidadeDeTrabalho> unidadesDeTrabalho;
	
	public Funcionario(String nome, String cpf, Double salario) {
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Funcionario() {
		super();
	}



	@Override
	public String toString() {
		return "Funcionario [id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", salario=" + salario + ", data=" + data
				+ ", cargo=" + cargo + ", unidadesDeTrabalho=" + unidadesDeTrabalho + "]";
	}

	public Integer getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	public List<UnidadeDeTrabalho> getUnidadesDeTrabalho() {
		return unidadesDeTrabalho;
	}

	public void setUnidadesDeTrabalho(List<UnidadeDeTrabalho> unidadesDeTrabalho) {
		this.unidadesDeTrabalho = unidadesDeTrabalho;
	}




	

}
