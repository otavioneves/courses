package aula11b;

public abstract class  Pessoa {

	private String nome,sexo;
	private Integer idade;
	
	public void fazerAniver() {
		this.setIdade(this.getIdade() + 1);
	}
	
	@Override
	public String toString() {
		return "\nPessoa\nNome=" + nome + "\nSexo=" + sexo + "\nIdade=" + idade+"\n";
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
	
}
