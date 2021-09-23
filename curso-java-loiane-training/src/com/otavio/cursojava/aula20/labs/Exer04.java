package com.otavio.cursojava.aula20.labs;

public class Exer04 {

	private String agenda[][] = new String[31][24];
	
	public void iniciarAgenda() {
		for (int i=0;i<31;i++) {
			for (int c=0;c<24;c++) {
				agenda[i][c]="_";
			}
		}
	}

	public void agendarCompromisso(int dia, int hora, String compromisso) {
		agenda[(dia-1)][(hora-1)]=compromisso;
		System.out.println("Compromisso agendado no dia "+ dia + "/09 às "+hora + "h00: " + compromisso);
	}
		
	public void exibirAgenda() {	
		
		System.out.println("---------------AGENDA---------------");
		for (int i=0;i<31;i++) {
			if (i<9) {
				System.out.print(" ");
			}
			System.out.print((i+1) + ": ");
			for (int c=0;c<24;c++) {
					System.out.print((c+1) + ": ");
					System.out.print(agenda[i][c] + " ");
			}

			System.out.println();
		}
		System.out.println("-----------------------------------");
	}
	
}
