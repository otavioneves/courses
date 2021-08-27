package aula06;

public class Aula06 {

	public static void main(String[] args) {

		Controle c = new Controle();
		c.abrirMenu();
		
		c.play();
		
		c.maisVolume();
		c.abrirMenu();
		
		c.maisVolume();
		c.abrirMenu();

		c.maisVolume();
		c.abrirMenu();
		
		c.menosVolume();
		c.abrirMenu();
		
		c.ligarMudo();
		c.abrirMenu();
		
		c.maisVolume();
		c.abrirMenu();
		
		c.menosVolume();
		c.abrirMenu();
		
		c.menosVolume();
		c.abrirMenu();
		
		c.pause();
		
		c.desligarMudo();
		c.desligarMudo();
		c.abrirMenu();
		
		c.fecharMenu();

		c.desligar();
		c.abrirMenu();
		c.maisVolume();
		c.menosVolume();
		c.play();
		c.pause();
		c.fecharMenu();}

}
