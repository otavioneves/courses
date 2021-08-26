package aula04;

public class Caneta {

	public String modelo;
	private Double ponta;
	private Boolean tampada;
	private String cor;
		
	
	public Caneta(String modelo, Double ponta, String cor) {
		super();
		this.modelo = modelo;
		this.ponta = ponta;
		this.cor = cor;
	}
	
	
	
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}



	public Double getPonta() {
		return this.ponta;
	}
	public void setPonta(Double p) {
		this.ponta = p;
	}
	
	
	public Boolean getTampada() {
		return this.tampada;
	}
	public void setTampada (Boolean t) {
		this.tampada = t;
	}
	
	
	public String getCor() {
		return this.cor;
	}
	public void setCor(String c) {
		this.cor = c;
	}
	
	
	public void tampar() {
		this.tampada = true;
	}
	public void destampar() {
		this.tampada = false;
	}
	
	public void status() {
		System.out.println("SOBRE A CANETA:");
		System.out.println("Modelo: " + this.getModelo());
		System.out.println("Ponta: " + this.getPonta());
		System.out.println("Cor: " + this.getCor());
		System.out.println("Tampada: " + this.getTampada());
	}
	
}
