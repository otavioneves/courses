package aula09;

public class Pessoa {
	
	private String nome;
	private Integer idade;
	private String sexo;
	
	
	
	public Pessoa(String nome, Integer idade, String sexo) {
		super();
		this.setNome(nome);
		this.setIdade(idade);
		this.setSexo(sexo);
	}


	public void fazerAniver() {
		this.setIdade(this.getIdade()+1);
	}

	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	
	
}
