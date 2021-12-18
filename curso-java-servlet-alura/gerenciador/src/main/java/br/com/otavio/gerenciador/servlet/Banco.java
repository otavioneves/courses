package br.com.otavio.gerenciador.servlet;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	private static List<Empresa> lista = new ArrayList<Empresa>();
	
	static {
		Empresa empresa = new Empresa("Alura");
		Empresa empresa2 = new Empresa("Caelum");	
		lista.add(empresa2);
		lista.add(empresa);
	}
	
	public void adiciona(Empresa empresa) {
		lista.add(empresa);
	}

	public List<Empresa> getEmpresas(){
		return Banco.lista;
	}
	
}
