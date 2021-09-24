package com.otavio.cursojava.aula52.labs;

public class TipoDeDadoIncorreto extends Exception {

	@Override
	public String getMessage() {
		return "Você não digitou uma opção válida";
	}
	
}
