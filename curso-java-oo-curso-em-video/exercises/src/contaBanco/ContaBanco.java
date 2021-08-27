package contaBanco;

public class ContaBanco {

	public Integer numConta;
	protected String tipo;
	private String dono;
	private Double saldo;
	private Boolean status;
	
	public ContaBanco(Integer numConta, String tipo, String dono) {
		super();
		System.out.println("Conta Criada");
		this.setNumConta(numConta);
		this.setTipo(tipo);
		this.setDono(dono);
		this.setSaldo(0.0);
		this.setStatus(false);
		status();
	}
		
	public void abrirConta() {
		System.out.println("Conta aberta");
		this.status = true;
		if(this.tipo == "cc") {
			this.setSaldo(50.0);
		} else {
			this.setSaldo(150.0);
		}	
		System.out.println("Saldo recebido: R$" + this.getSaldo());
	}
	
	public void depositar(Double deposito) {
		if (this.status == true) {
			this.setSaldo(getSaldo() + deposito);
			System.out.println("Você depositou R$" + deposito + " e seu saldo atual é de R$" + this.getSaldo());
		} else {
			System.out.println("A conta está fechada");
		}
	}
	
	public void pagarMensalidade() {
		if (this.status == false) {
			System.out.println("A conta está fechada");	
		} else if (this.tipo == "cc") {
			this.setSaldo(getSaldo()-12);
			System.out.println("Você pagou a mensalidade de R$12 e seu saldo atual é de R$" + this.getSaldo());
		} else {
			this.setSaldo(getSaldo()-20);
			System.out.println("Você pagou a mensalidade de R$20 e seu saldo atual é de R$" + this.getSaldo());

		}
	}
	
	public void sacar (Double saque) {
		if (this.status == false) {
			System.out.println("A conta está fechada");	
		} else if (this.saldo>=0 && this.saldo>=saque) {
			this.setSaldo(getSaldo()-saque);
			System.out.println("Você sacou R$" + saque + " e o seu saldo atual é de R$" + this.getSaldo());
		} else {
			System.out.println("Você não tem saldo para saque.");
		}
	}
	
	public void fecharConta () {
		if (saldo>=0) {
			System.out.println("Você sacou o restante da conta: R$" + this.getSaldo());
			this.setSaldo(0.0);
			this.setStatus(false);
			System.out.println("Você fechou a conta!");
		} else {
			System.out.println("Você não pode fechar uma conta com saldo negativo. Seu saldo atual é: R$" + this.getSaldo());
		}		
	}
	
	public Integer getNumConta() {
		return numConta;
	}
	public void setNumConta(Integer numConta) {
		this.numConta = numConta;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getDono() {
		return dono;
	}
	public void setDono(String dono) {
		this.dono = dono;
	}
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	
	public void status() {
		System.out.println("---------------------------");
		System.out.println("BANCO SHOW:");
		System.out.println("Conta: " + this.getTipo() + " " + this.getNumConta());
		System.out.println("Dono: " + this.getDono());
		System.out.println("Saldo: R$" + this.getSaldo());
		System.out.println("Aberta? " + this.getStatus());
		System.out.println("---------------------------");
	}
	
	

}
