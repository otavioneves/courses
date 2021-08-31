package challenges;

public class Verificador3 {

	public static void main(String[] args) {

		Integer[] numeros = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
		
		for (int i = 0; i < numeros.length ; i++) {
			Integer verificador = numeros[i];
			Integer divisorPor3 = verificador % 3;
		
			if (divisorPor3.equals(0)) {
				System.out.println("O número " + verificador +" é divisível por 3.");
			}
			

					
		}

		System.out.println("Quebra.");
		
		Integer[] numeros2 = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
		
		int c = 0;
		while (c < numeros2.length) {
			Integer verificador2 = numeros2[c];
			Integer divisorPor32 = verificador2 % 3;
			
			if (divisorPor32.equals(0)) {
				System.out.println("O número " + verificador2 +" é divisível por 3.");
			}			
			c++;	
		}
							
		}	
			
	}
