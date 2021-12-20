package br.com.otavio.jdbc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TesteRemocao {

	public static void main(String[] args) throws SQLException {

		ConnectionFactory criaConexao = new ConnectionFactory();
		Connection con = criaConexao.recuperarConexao();	
		
		PreparedStatement stm = con.prepareStatement("DELETE FROM PRODUTO WHERE ID> ? ");
		
		stm.setInt(1, 2);
		stm.execute();
		
		Integer linhasmodificadas = stm.getUpdateCount();		// o método retorna um inteiro, que é quantas linhas foram modificadas na tabela
		
		System.out.println("Quantidade de linhas modificadas: " + linhasmodificadas);	
		con.close();
		
	}

}
