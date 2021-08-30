package aula07;

public class Aula07 {

	public static void main(String[] args) {

		Lutador l[] = new Lutador[6];
		
		l[0] = new Lutador("Preety Boy","França", 31, 11,2,1,1.75,68.9) ;
		
		l[1] = new Lutador("Script","Brasil",29,14,2,3,1.68,57.8);
		
		l[2] = new Lutador("Snapshadow","EUA",35,12,2,1,1.65,80.9);
		
		l[3] = new Lutador("Dead Code","Austrália",28,13,0,2,1.93,81.6);
		
		l[4] = new Lutador("UFOCobol","Brasil",37,5,4,3,1.70,119.3);
		
		l[5] = new Lutador("Nerdaart","EUA",30,12,2,4,1.81,105.7);	
		
		
		
		for (int i = 0 ; i<6;i++) {
			l[i].apresentar();
			l[i].status();
		}
		
		Luta UEC01 = new Luta();
		UEC01.marcarLuta(l[0], l[1]);
		UEC01.lutar();
	}

}
