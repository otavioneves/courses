package br.com.otavio;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Curso {

	private String nome;
	private String instrutor;
	private List<Aula> aulas = new LinkedList<Aula>();
	private Set<Aluno> alunos = new HashSet<>();
	
	
	
	
	
	
	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(alunos);
	}
	

	public Curso(String nome, String instrutor, List<Aula> aulas) {
		this.nome = nome;
		this.instrutor = instrutor;
		this.aulas = aulas;
	}
	
	public Curso(String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
	}
	
	public Curso() {

	}
	
	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}
	


	public List<Aula> getAulas(){
		return Collections.unmodifiableList(aulas);
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getInstrutor() {
		return instrutor;
	}


	public void setInstrutor(String instrutor) {
		this.instrutor = instrutor;
	}


	public void setAulas(List<Aula> aulas) {
		this.aulas = aulas;
	}

	public void matricula(Aluno aluno) {

		this.alunos.add(aluno);
		
	}
	
	
	
}
