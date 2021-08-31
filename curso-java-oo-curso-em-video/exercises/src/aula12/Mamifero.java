package aula12;

public class Mamifero extends Animal {


	@Override
	public void locomover() {
		System.out.println("Andando");
	}

	@Override
	public void alimentar() {
		System.out.println("Mamando");
	}

	@Override
	public void emitirSom() {
		System.out.println("Barulho de Mamifero");
	}
	
	
	
}
