package vetor.exer01_05;

public class Exer01 {

	public static void main(String[] args) {

		Lista<String> lista = new Lista<String>();
		
		lista.adiciona("A");
		lista.adiciona("B");
		lista.adiciona("C");
		lista.adiciona("A");
		lista.adiciona("B");
		lista.adiciona("B");
		
		System.out.println(lista);
		
		lista.clear();

		System.out.println(lista);
		
		lista.adiciona("A");
		lista.adiciona("B");
		lista.adiciona("C");
		
		System.out.println(lista);

	}

}
