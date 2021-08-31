package projetoFinal;

public class Youtube {

	public static void main(String[] args) {

		Video v[] = new Video[3];
		
		v[0] = new Video("Aula 1 de POO");
		v[1] = new Video("Aula 10 de Git");
		v[2] = new Video("Aula 17 de Linux");
		
		System.out.println(v[0].toString());
		System.out.println(v[1].toString());
		System.out.println(v[2].toString());
		
		Gafanhoto g[] = new Gafanhoto[2];
		
		g[0] = new Gafanhoto("Jubileu","Masculino",19,"Jub123");
		g[1] = new Gafanhoto("João","Masculino",20,"Joao123");
		
		System.out.println(g[0].toString());
		System.out.println(g[1].toString());
		
		Visualizacao vis1 = new Visualizacao(g[0], v[0]);
		vis1.avaliar();
		
		Visualizacao vis2 = new Visualizacao(g[0], v[1]);
		vis2.avaliar(1.5);
		
		Visualizacao vis3 = new Visualizacao(g[0], v[2]);
		vis3.avaliar(10);
		
		System.out.println(vis1.toString());
		System.out.println(vis2.toString());
		System.out.println(vis3.toString());
		
		System.out.println(v[0].toString());
		System.out.println(v[1].toString());
		System.out.println(v[2].toString());
		System.out.println(g[0].toString());
		System.out.println(g[1].toString());
		
		
		
		
		
	}

}
