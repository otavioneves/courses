package projetoFinal;

public abstract class Pessoa {
	protected String nome, sexo;
	protected Integer idade, experiencia;
	
	protected void ganharExp() {
		this.setExperiencia(this.getExperiencia()+1);
	}
	
	public Pessoa(String nome, String sexo, Integer idade) {
		super();
		this.nome = nome;
		this.sexo = sexo;
		this.idade = idade;
		this.setExperiencia(0);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public Integer getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(Integer experiencia) {
		this.experiencia = experiencia;
	}
	
	
	
}
