package aula04;

public class Aula04 {

	public static void main(String[] args) {

		Caneta c1 = new Caneta("BIC",0.5,"Azul"); //cria o objeto j� colocando os atributos nos par�metros
		c1.status();
		
		System.out.println("");
		
		System.out.println("Eu tenho uma caneta " + c1.getModelo());
		System.out.println("A caneta � de ponta " + c1.getPonta());
		System.out.println("A cor da caneta � " + c1.getCor());
		System.out.println("Ela est� tampada: " + c1.getTampada());
		
		System.out.println("");
		
		Caneta c2 = new Caneta("KKK",0.7,"Amarela");
		c2.status();
	}

}
