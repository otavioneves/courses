package br.com.otavio.jdbc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaInsercaoComParâmetro {

	public static void main(String[] args) throws SQLException {

		ConnectionFactory criaConexao = new ConnectionFactory();

		try (Connection con = criaConexao.recuperarConexao()){
			con.setAutoCommit(false);

			try (PreparedStatement stm = con.prepareStatement("INSERT INTO PRODUTO (nome,descricao) VALUES (?,?)",Statement.RETURN_GENERATED_KEYS)){
				adicionarVariavel("SmartTV", "45 Polegadas", stm);
				adicionarVariavel("Radio", "Radio de Bateria", stm);

				con.commit();
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("Rollback executado.");
				con.rollback();
			}
		}
	}

	private static void adicionarVariavel(String nome, String descricao, PreparedStatement stm) throws SQLException {
		stm.setString(1, nome);
		stm.setString(2, descricao);
		stm.execute();		// como a query já está preparada podemos apenas executar o Statement

		try (ResultSet rst = stm.getGeneratedKeys()){

			while(rst.next()) {
				Integer id = rst.getInt(1);		// passamos como parâmetro a coluna 1, que é a primeira coluna

				System.out.println("O id criado foi: " + id);
			}
		}
	}
}
