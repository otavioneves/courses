package com.otavio.cursojava.aula52.labs;

public class ContatoNaoExiste extends Exception{

	private String nomeContato;

	public ContatoNaoExiste(String nomeContato) {
		super();
		this.nomeContato = nomeContato;
	}
	
	@Override
	public String getMessage() {
		return "Contato" + nomeContato + "nao existe na agenda!";
	}
	
}
