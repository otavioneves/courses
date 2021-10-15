package br.com.otavio;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Curso {

	private String nome;
	private String instrutor;
	private List<Aula> aulas = new LinkedList<Aula>();
	
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
	
	
	
}
