package aula11b;

public class Bolsista extends Aluno {

	private Double Bolsa;
	
	public void renovarBolsa() {
		System.out.println("Bolsa renovada!");
	}
	
	@Override
	public void pagarMensalidade() {
		System.out.println(this.getNome() + " é bolsita. Pagamento facilitado.");
	}

	public Double getBolsa() {
		return Bolsa;
	}

	public void setBolsa(Double bolsa) {
		Bolsa = bolsa;
	}
	
	
}
