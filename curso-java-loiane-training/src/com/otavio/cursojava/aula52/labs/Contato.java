package com.otavio.cursojava.aula52.labs;

public class Contato {

	private String nome;
	private String email;
	private String telefone;
	private int id;
	private int contador=1;
	
	public Contato(String nome, String telefone, String email) {
		super();
		this.setNome(nome);
		this.setEmail(email);
		this.setTelefone(telefone);
		this.setId(this.getContador());
		this.setContador(this.getContador()+1);
	}
	
	
	
	
	
	@Override
	public String toString() {
		return "Contato\nID: " + id + "\nNome: " + nome + "\nE-mail: " + email + "\nTelefone: " + telefone;
	}





	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	public int getContador() {
		return contador;
	}

	public void setContador(int contador) {
		this.contador = contador;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}
