package com.otavio.cursojava.aula20.labs;

public class Exer04Menu extends Exer04{

	public static void main(String[] args) {

		Exer04 agenda = new Exer04();
		
		agenda.iniciarAgenda();

		agenda.exibirAgenda();
		
		agenda.agendarCompromisso(2, 10, "Correr");
		
		agenda.agendarCompromisso(4, 23, "Andar");
		
		agenda.agendarCompromisso(10, 2, "Dormir");
		
		agenda.exibirAgenda();
		
	}

}
