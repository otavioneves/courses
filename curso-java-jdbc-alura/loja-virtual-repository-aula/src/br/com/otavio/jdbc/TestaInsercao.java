package br.com.otavio.jdbc;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaInsercao {

	public static void main(String[] args) throws SQLException {

		ConnectionFactory criaConexao = new ConnectionFactory();
		Connection con = criaConexao.recuperarConexao();	
		
		Statement stm = con.createStatement();
		stm.execute("INSERT INTO PRODUTO (nome,descricao) VALUES ('Mouse','Mouse sem fio')",Statement.RETURN_GENERATED_KEYS);
		
		ResultSet rst = stm.getGeneratedKeys();
		
		while(rst.next()) {
			Integer id = rst.getInt(1);		// passamos como parâmetro a coluna 1, que é a primeira coluna
			
			System.out.println("O id criado foi: " + id);
		}
						
		con.close();
		
	}

}
