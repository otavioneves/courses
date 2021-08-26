
public class Caneta {

	public String modelo;
	public String cor;
	private Double ponta;
	protected Integer carga;
	protected Boolean tampada;
	
	protected void tampar () {
		this.tampada = true;
	}
	protected void destampar () {
		this.tampada = false;
	}
	
	public void rabiscar () {
		
		if (this.tampada == true) {
			System.out.println("Erro! A caneta está tampada.");
		} else {
			System.out.println("Estou rabiscando");
		}
		
	}
	
	public void status() {
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Cor: " + this.cor);
		System.out.println("Ponta: " + this.ponta);
		System.out.println("Nível da Carga: " + this.carga);
		System.out.println("Está tampada? " + this.tampada);
		
	}
	
}
