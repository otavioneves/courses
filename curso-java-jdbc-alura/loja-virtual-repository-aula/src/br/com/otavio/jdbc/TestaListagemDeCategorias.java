package br.com.otavio.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.otavio.jdbc.dao.CategoriaDAO;
import br.com.otavio.jdbc.modelo.Categoria;
import br.com.otavio.jdbc.modelo.Produto;

public class TestaListagemDeCategorias {

	public static void main(String[] args) throws SQLException {

		try(Connection connection = new ConnectionFactory().recuperarConexao()){

			CategoriaDAO categoriaDAO = new CategoriaDAO(connection);

			List<Categoria> listaDeCategorias = categoriaDAO.listarComProdutos();

			listaDeCategorias.stream().forEach(ct -> {

				System.out.println(ct.getNome());

				for (Produto produto :ct.getProdutos()) {
					System.out.println(ct.getNome() + " - " + produto.getNome());
				}
			});
			
		}
	}
}