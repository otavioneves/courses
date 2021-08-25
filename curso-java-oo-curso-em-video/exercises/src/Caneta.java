
public class Caneta {

	String	modelo;
	String cor;
	Double ponta;
	Integer carga;
	Boolean tampada;
	
	void tampar () {
		this.tampada = true;
	}
	void destampar () {
		this.tampada = false;
	}
	
	void rabiscar () {
		
		if (this.tampada == true) {
			System.out.println("Erro! A caneta est� tampada.");
		} else {
			System.out.println("Estou rabiscando");
		}
		
	}
	
	void status() {
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Cor: " + this.cor);
		System.out.println("Ponta: " + this.ponta);
		System.out.println("N�vel da Carga: " + this.carga);
		System.out.println("Est� tampada? " + this.tampada);
		
	}
	
}
