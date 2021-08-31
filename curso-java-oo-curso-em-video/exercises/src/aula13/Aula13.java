package aula13;

public class Aula13 {

	public static void main(String[] args) {

		Cachorro x = new Cachorro();
		x.emitirSom();
		
		Lobo z = new Lobo();
		z.emitirSom();
		
		Mamifero y = new Mamifero ();
		y.emitirSom();
		
		Cachorro c = new Cachorro ();
		
		c.reagir("Olá");
		c.reagir("Vai apanhar");
		c.reagir(11, 45);
		c.reagir(19, 00);
		c.reagir(true);
		c.reagir(false);
		c.reagir(2,12.5);
		c.reagir(17,4.5);
	}

}
