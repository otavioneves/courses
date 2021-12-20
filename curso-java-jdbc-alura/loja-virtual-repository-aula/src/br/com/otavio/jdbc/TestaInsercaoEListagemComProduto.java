package br.com.otavio.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.otavio.jdbc.dao.ProdutoDAO;
import br.com.otavio.jdbc.modelo.Produto;

public class TestaInsercaoEListagemComProduto {

	public static void main(String[] args) throws SQLException {

		Produto comoda = new Produto("Cômoda","Cômoda Vertical");

		try (Connection con = new ConnectionFactory().recuperarConexao()){

			ProdutoDAO produtoDao = new ProdutoDAO(con);

			produtoDao.salvar(comoda);

			List<Produto> listaDeProdutos = produtoDao.listar();
			listaDeProdutos.stream().forEach(lp -> System.out.println(lp));

		}
	}
}
