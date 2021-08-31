package challenges;

public class FaturamentoMensalVetores {

	public static void main(String[] args) {
		Double[] faturamentoJaneiro = new Double[] { 1500.0, 2000.0, 1700.0 };
		Double[] faturamentoFeveriro = new Double[] { 1000.0, 2500.0, 1800.0 };
		
		Double[][] faturamentoAnual = new Double[][] { faturamentoJaneiro, faturamentoFeveriro };
		
		for (int i = 0; i < faturamentoAnual.length; i++) {
			System.out.println("Mês: " + (i + 1));
						
			for(int y = 0; y < faturamentoAnual[i].length; y++) {
				
				System.out.println("Dia " + (y + 1) + ": " + faturamentoAnual[i][y]);
			}
		}
	}

}
