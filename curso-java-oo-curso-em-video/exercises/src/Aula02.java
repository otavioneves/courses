
public class Aula02 {

	public static void main(String[] args) {

		Caneta c1 = new Caneta();
		c1.cor = "Azul";
		c1.modelo = "BIC";
		c1.carga = 90;
		c1.ponta = 0.5;
		c1.destampar();
		c1.rabiscar();
		c1.status();
			
		Caneta c2 = new Caneta();
		c2.cor = "Vermelha";
		c2.modelo = "Faber Castel";
		c2.carga = 100;
		c2.ponta = 0.7;
		c2.destampar();
		c2.rabiscar();
		c2.status();
	}

}
