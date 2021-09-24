package com.otavio.cursojava.aula43.Exer03;

public class Teste {

	public static void main(String[] args) {

		Animal[] zoo = new Animal[3];
		
		zoo[0] = new Mamifero("Camelo", 150, "Amarelo", "Terra", 2.0,"Peixes");
		zoo[1] = new Peixe("Tubarão", 300, "Cinzento", "Mar", 1.5, "Barbatanas e Cauda");
		zoo[2] = new Mamifero("Urso-do-Canada",180,"Vermelho", "Terra", 0.5,"Mel");
		
		for (int i=0;i<zoo.length;i++) {
			System.out.println(zoo[i].toString());
		}
		
	}

}
