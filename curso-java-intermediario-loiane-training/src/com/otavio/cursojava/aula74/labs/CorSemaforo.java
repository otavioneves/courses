package com.otavio.cursojava.aula74.labs;

public enum CorSemaforo {
	
	VERDE(3000), AMARELO(1000), VERMELHO(3000);
	
	private int tempoEspera;
	
	CorSemaforo(int tempoEspera){
		this.tempoEspera = tempoEspera;
	}

	public int getTempoEspera() {
		return tempoEspera;
	}

	
}
