package contaBanco;

public class Banco {

	public static void main(String[] args) {

		ContaBanco c1 = new ContaBanco(11111111,"cc","Otavio");
		
		c1.abrirConta();		
		c1.status();
		
		c1.sacar(50.0);
		c1.status();
		
		c1.pagarMensalidade();
		c1.status();
			
		c1.depositar(10.0);
		c1.status();
				
		c1.fecharConta();
		c1.status();
		

		
		
	}

}
