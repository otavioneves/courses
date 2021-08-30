package aula11b;

public class Aluno extends Pessoa {
	
	private Integer matricula;
	private String curso;
	
	public void pagarMensalidade() {
		System.out.println("Mensalidade paga do aluno " + this.getNome());
	}
	
	
	public Integer getMatricula() {
		return matricula;
	}
	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String string) {
		this.curso = string;
	}
	
}
