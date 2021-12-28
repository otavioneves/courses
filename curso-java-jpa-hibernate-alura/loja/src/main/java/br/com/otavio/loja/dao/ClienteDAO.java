package br.com.otavio.loja.dao;

import javax.persistence.EntityManager;

import br.com.otavio.loja.modelo.Cliente;

public class ClienteDAO {

	private EntityManager em;

	public ClienteDAO(EntityManager em) {
		this.em = em;
	}
	
	public void cadastrar(Cliente cliente) {
		this.em.persist(cliente);
	}	
	
	public Cliente buscarPorId(int id) {
		return em.find(Cliente.class, id);		// busca a entidade pelo id
	}
}
