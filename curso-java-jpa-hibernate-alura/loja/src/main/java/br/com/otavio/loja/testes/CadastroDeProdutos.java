package br.com.otavio.loja.testes;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.EntityManager;

import br.com.otavio.loja.dao.CategoriaDAO;
import br.com.otavio.loja.dao.ProdutoDAO;
import br.com.otavio.loja.modelo.Categoria;
import br.com.otavio.loja.modelo.Produto;
import br.com.otavio.loja.util.JPAUtil;

public class CadastroDeProdutos {

	public static void main(String[] args) {

		Categoria celulares = new Categoria ("CELULARES");
		Produto celular = new Produto("Xiaomi Redmi", "Muito legal",new BigDecimal("800"), celulares);

		EntityManager em = JPAUtil.getEntityManager();
		ProdutoDAO produtoDao = new ProdutoDAO(em);
		CategoriaDAO categoriaDao = new CategoriaDAO(em);

		em.getTransaction().begin();
		categoriaDao.cadastrar(celulares);
		produtoDao.cadastrar(celular);		
		em.getTransaction().commit();

		Produto produtoBuscado = produtoDao.buscarPorId(1);
		System.out.println(produtoBuscado);

		List<Produto> todos = produtoDao.buscarTodos();
		todos.forEach(p -> System.out.println(p));

		List<Produto> porNome = produtoDao.buscarPorNome("Xiaomi Redmi");
		porNome.forEach(p -> System.out.println(p));

		List<Produto> porCategoria = produtoDao.buscarPorCategoria("CELULARES");
		porCategoria.forEach(p -> System.out.println(p));

		BigDecimal precoDoProduto = produtoDao.buscarPrecoDoProdutoComNome("Xiaomi Redmi");
		System.out.println("Preço do Produto" + precoDoProduto);		
		
		em.close();

	}

}