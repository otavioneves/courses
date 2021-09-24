package com.otavio.cursojava.aula46.Exer02;

public class Teste {

	public static void main(String[] args) {

		
		Quadrado f1 = new Quadrado(2);
		Circulo f2= new Circulo(2);
		Triangulo f3 = new Triangulo(2, 2, 2);
		Cubo f4 = new Cubo(2, 2, 2);
		Cilindro f5 = new Cilindro(2, 2);
		Piramide f6 = new Piramide(2, 2, 2);
		
		
		FiguraGeometrica[] figuras = new FiguraGeometrica[6];
		figuras[0]=f1;		
		figuras[1]=f2;		
		figuras[2]=f3;		
		figuras[3]=f4;		
		figuras[4]=f5;		
		figuras[5]=f6;		

		
		
		for(FiguraGeometrica figura : figuras) {
			System.out.println("----");
			System.out.println(figura.getNome());
			
			if (figura instanceof Figura2D) {
				Figura2D f2d = (Figura2D) figura;
				System.out.println(f2d.calcularArea());
			}
			
			if (figura instanceof Figura3D) {
				Figura3D f3d = (Figura3D) figura;
				System.out.println(f3d.calcularVolume());
			}
			
		}
		
		
		for (int i = 0 ; i<figuras.length;i++) {
			System.out.println("--2--");
			System.out.println(figuras[i].getNome());
			
			if (figuras[i] instanceof Figura2D) {
				Figura2D f2d = (Figura2D) figuras[i];
				System.out.println(f2d.calcularArea());
			}
			
			if (figuras[i] instanceof Figura3D) {
				Figura3D f3d = (Figura3D) figuras[i];
				System.out.println(f3d.calcularVolume());
			}
			
		}
		
		for(int i = 0;i<figuras.length;i++) {
			
			System.out.println(figuras[i].toString());
			
		}
		
	}

}
