package br.com.otavio.gerenciador.modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {

	private static List<Empresa> lista = new ArrayList<Empresa>();
	private static List<Usuario> listaUsuarios = new ArrayList<Usuario>();
	private static Integer chaveSequencial = 1;	
	
	static {
		Empresa empresa = new Empresa("Alura");
		empresa.setId(Banco.chaveSequencial++);
		Empresa empresa2 = new Empresa("Caelum");
		empresa2.setId(Banco.chaveSequencial++);
		lista.add(empresa2);
		lista.add(empresa);
		
		Usuario u1 = new Usuario();
		u1.setLogin("Otavio");
		u1.setSenha("12345");
		
		Usuario u2 = new Usuario();
		u2.setLogin("Carol");
		u2.setSenha("678910");
		
		listaUsuarios.add(u1);
		listaUsuarios.add(u2);
	}
	
	public void adiciona(Empresa empresa) {
		empresa.setId(Banco.chaveSequencial++);
		lista.add(empresa);
	}

	public List<Empresa> getEmpresas(){
		return Banco.lista;
	}

	public void removeEmpresa(Integer id) {
		
		Iterator<Empresa> it = lista.iterator();
		while (it.hasNext()) {
			Empresa emp = it.next();
			
			if (emp.getId()== id) {
				it.remove();
			}
		}

	}

	public Empresa buscaEmpresaPelaId(Integer id) {
		
		for (Empresa empresa : lista) {
			if (empresa.getId() == id) {
				return empresa;
			}
		}
		
		return null;
	}

	public Usuario existeUsuario(String login, String senha) {

		for (Usuario usuario : listaUsuarios) {
			
			if(usuario.ehIgual(login, senha)) {
				return usuario;
			}
			
		}
		
		return null;
	}

	
}
