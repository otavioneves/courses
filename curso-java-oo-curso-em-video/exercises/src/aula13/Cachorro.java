package aula13;

public class Cachorro extends Mamifero {

	@Override
	public void emitirSom() {
		System.out.println("Au,au,au!");
	}
	
	public void reagir (String frase) {
		if (frase=="Toma Comida" || frase =="Ol�") {
			System.out.println("Abanar e Latir");
		} else {
			System.out.println("Rosnar");
		}
	}
	
	
	public void reagir (int hora, int min) {
		if (hora<12) {
			System.out.println("Abanar");
		} else if (hora>18) {
			System.out.println("Ignorar");
		} else {
			System.out.println("Abanar e Latir");
		}
	}
	
	public void reagir(Boolean dono) {
		 if (dono) {
			 System.out.println("Abanar");
		 } else {
			 System.out.println("Latir");
		 }
		
	}
	
	public void reagir (int idade, double peso) {
		if (idade <5) {
			if (peso < 10) {
				System.out.println("Abanar");
			} else {
				System.out.println("Latir");
			}
		}  else {
			if (peso < 10) {
				System.out.println("Rosnar");
			} else {
				System.out.println("Ignorar");
			}
		}
	}
	
	
}
