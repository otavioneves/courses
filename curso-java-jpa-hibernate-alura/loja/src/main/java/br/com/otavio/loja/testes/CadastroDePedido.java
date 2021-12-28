package br.com.otavio.loja.testes;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.EntityManager;

import br.com.otavio.loja.dao.CategoriaDAO;
import br.com.otavio.loja.dao.ClienteDAO;
import br.com.otavio.loja.dao.PedidoDAO;
import br.com.otavio.loja.dao.ProdutoDAO;
import br.com.otavio.loja.modelo.Categoria;
import br.com.otavio.loja.modelo.Cliente;
import br.com.otavio.loja.modelo.ItemPedido;
import br.com.otavio.loja.modelo.Pedido;
import br.com.otavio.loja.modelo.Produto;
import br.com.otavio.loja.util.JPAUtil;
import br.com.otavio.loja.vo.RelatorioDeVendaVO;

public class CadastroDePedido {

	public static void main(String[] args) {

		popularBancoDeDados();

		EntityManager em = JPAUtil.getEntityManager();
		ProdutoDAO produtoDao = new ProdutoDAO(em);
		Produto produto1 = produtoDao.buscarPorId(1);
		Produto produto2 = produtoDao.buscarPorId(2);
		Produto produto3 = produtoDao.buscarPorId(3);

		ClienteDAO clienteDao = new ClienteDAO(em);
		Cliente cliente = clienteDao.buscarPorId(1);

		em.getTransaction().begin();

		Pedido pedido1 = new Pedido(cliente);
		Pedido pedido2 = new Pedido(cliente);

		pedido1.adicionarItem(new ItemPedido(10, pedido1, produto1));
		pedido1.adicionarItem(new ItemPedido(40, pedido1, produto2));

		pedido2.adicionarItem(new ItemPedido(2, pedido2, produto3));

		PedidoDAO pedidoDao = new PedidoDAO(em);
		pedidoDao.cadastrar(pedido1);
		pedidoDao.cadastrar(pedido2);

		em.getTransaction().commit();

		BigDecimal totalVendido = new PedidoDAO(em).valorTotalVendido();
		System.out.println("VALOR TOTAL: " + totalVendido);

		List<RelatorioDeVendaVO> relatorio = pedidoDao.relatorioDeVendas();
		
		relatorio.forEach(System.out::println);
		
		em.close();

	}

	public static void popularBancoDeDados() {
		Categoria celulares = new Categoria("CELULARES");
		Categoria videogames = new Categoria("VIDEOGAMES");
		Categoria informatica = new Categoria("INFORMATICA");

		Produto celular = new Produto("Xiaomi Redmi", "Muito legal", new BigDecimal("800"), celulares);
		Produto videogame = new Produto("PS5", "Playstation 5", new BigDecimal("800"), celulares);
		Produto macbook = new Produto("Macbook", "Macbook pro", new BigDecimal("800"), celulares);

		Cliente cliente = new Cliente("Otavio", "123456789-12");

		EntityManager em = JPAUtil.getEntityManager();
		ProdutoDAO produtoDao = new ProdutoDAO(em);
		CategoriaDAO categoriaDao = new CategoriaDAO(em);
		ClienteDAO clienteDao = new ClienteDAO(em);

		em.getTransaction().begin();

		categoriaDao.cadastrar(celulares);
		categoriaDao.cadastrar(videogames);
		categoriaDao.cadastrar(informatica);

		produtoDao.cadastrar(celular);
		produtoDao.cadastrar(videogame);
		produtoDao.cadastrar(macbook);

		clienteDao.cadastrar(cliente);
		em.getTransaction().commit();
		em.close();
	}

}
