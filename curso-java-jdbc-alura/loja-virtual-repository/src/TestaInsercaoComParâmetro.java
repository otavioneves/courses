import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaInsercaoComParâmetro {

	public static void main(String[] args) throws SQLException {
		
		String nome = "Mouse";
		String descricao = "Mouse sem fio";

		ConnectionFactory criaConexao = new ConnectionFactory();
		Connection con = criaConexao.recuperarConexao();	
		
		PreparedStatement stm = con.prepareStatement("INSERT INTO PRODUTO (nome,descricao) VALUES (?,?)",Statement.RETURN_GENERATED_KEYS);
		stm.setString(1, nome);
		stm.setString(2, descricao);
		
		stm.execute();		// como a query já está preparada podemos apenas executar o Statement
		
		ResultSet rst = stm.getGeneratedKeys();
		
		while(rst.next()) {
			Integer id = rst.getInt(1);		// passamos como parâmetro a coluna 1, que é a primeira coluna
			
			System.out.println("O id criado foi: " + id);
		}
						
		con.close();
		
	}

}
