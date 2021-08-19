package challenges;

public class SemanaDeMaiorFaturamento {

	public static void main(String[] args) {
		
		Double[] semanaUm = new Double[]{ 1000.0, 1500.0, 1250.0, 2100.0, 1350.0, 970.0, 0.0 };
		Double[] semanaDois = new Double[]{ 1050.0, 2500.0, 3250.0, 1100.0, 1430.0, 900.0, 0.0 };
		Double[] semanaTres = new Double[]{ 1700.0, 1300.0, 1450.0, 2000.0, 1390.0, 800.0, 0.0 };
		Double[] semanaQuatro = new Double[]{ 2100.0, 1600.0, 1850.0, 2100.0, 1220.0, 998.0, 0.0 };

		Double[][] mes = new Double[][] { semanaUm, semanaDois, semanaTres, semanaQuatro };
		
		
		Double calculoMaiorSemana = 0.0;
		Integer maiorSemana = 0;
		
		for (int y = 0; y<mes.length;y++) {
			Double somaSemana = 0.0;
			for (int x = 0; x<mes[y].length;x++) {
				
				somaSemana = somaSemana + mes[y][x];
			}
			
			System.out.println("Soma da semana" + (y+1) + ": R$" + somaSemana);
			
			Boolean verificadorMaiorSemana = somaSemana>=calculoMaiorSemana;
			if (verificadorMaiorSemana) {
				calculoMaiorSemana = somaSemana;
				maiorSemana = y+1;
				
			}
		}
		
		System.out.println("A semana com maior faturamento foi a "+maiorSemana+"a semana");
		
	
		switch (maiorSemana) {
		case 1: System.out.println("A semana com maior faturamento foi a 1a semana");
		break;
		case 2: System.out.println("A semana com maior faturamento foi a 2a semana");
		break;
		case 3: System.out.println("A semana com maior faturamento foi a 3a semana");
		break;
		case 4: System.out.println("A semana com maior faturamento foi a 4a semana");
		break;
		default:
			break;
		}
	}

}
