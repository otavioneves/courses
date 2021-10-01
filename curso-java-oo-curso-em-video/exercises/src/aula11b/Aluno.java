package aula11b;

public class Aluno extends Pessoa {
	
	private Integer matricula;
	private String curso;
	private int notaProva;
	private int notaTeste;
	private String professorAplicador;
	
	
	
	public Aluno() {
		super();

	}

	public Aluno(String nome, String curso) {
		this.setNome(nome);
		this.setCurso(curso);
	}

	public void pagarMensalidade() {
		System.out.println("Mensalidade paga do aluno " + this.getNome());
	}
	
	
	public void fazerAvaliacao(int notaDaProva) {
		this.setNotaProva(notaDaProva);
	}
	
	public void fazerAvaliacao(int notaDaProva,String professor) {
		this.setNotaProva(notaDaProva);
		this.setProfessorAplicador(professor);
	}
	
	
	@Override
	public String toString() {
		return "Aluno [matricula=" + matricula + ", curso=" + curso + "]";
	}
	
	
	





	public String getProfessorAplicador() {
		return professorAplicador;
	}


	public void setProfessorAplicador(String professorAplicador) {
		this.professorAplicador = professorAplicador;
	}


	public int getNotaProva() {
		return notaProva;
	}


	public void setNotaProva(int notaProva) {
		this.notaProva = notaProva;
	}

	

	public int getNotaTeste() {
		return notaTeste;
	}


	public void setNotaTeste(int notaTeste) {
		this.notaTeste = notaTeste;
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
