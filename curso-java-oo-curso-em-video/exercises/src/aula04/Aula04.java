package aula04;

public class Aula04 {

	public static void main(String[] args) {

		Caneta c1 = new Caneta("BIC",0.5,"Azul"); //cria o objeto já colocando os atributos nos parâmetros
		c1.status();
		
		System.out.println("");
		
		System.out.println("Eu tenho uma caneta " + c1.getModelo());
		System.out.println("A caneta é de ponta " + c1.getPonta());
		System.out.println("A cor da caneta é " + c1.getCor());
		System.out.println("Ela está tampada: " + c1.getTampada());
		
		System.out.println("");
		
		Caneta c2 = new Caneta("KKK",0.7,"Amarela");
		c2.status();
	}

}
