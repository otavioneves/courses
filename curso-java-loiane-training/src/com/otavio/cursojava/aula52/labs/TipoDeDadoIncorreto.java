package com.otavio.cursojava.aula52.labs;

public class TipoDeDadoIncorreto extends Exception {

	@Override
	public String getMessage() {
		return "Voc� n�o digitou uma op��o v�lida";
	}
	
}
