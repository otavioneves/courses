package br.com.otavio.jdbc;
import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class ConnectionFactory {

	public DataSource dataSource;

	public ConnectionFactory() {
		// toda vez que o Connection Factory for instanciado, criaremos um pool de conexões.

		ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
		comboPooledDataSource.setJdbcUrl("jdbc:mysql://localhost/loja_virtual?useTimezone=true&serverTimezone=UTC");
		comboPooledDataSource.setUser("root");
		comboPooledDataSource.setPassword("root");

		comboPooledDataSource.setMaxPoolSize(15);
		
		this.dataSource = comboPooledDataSource;		// a variavel DataSource é o que faz funcionar o pool

	}	

	public Connection recuperarConexao() throws SQLException {
		//		com o pool, não utilizamos mais o Driver Manager.
		//		return DriverManager.getConnection("jdbc:mysql://localhost/loja_virtual?useTimezone=true&serverTimezone=UTC", "root", "root");

		return this.dataSource.getConnection();		// o pool que irá prover a conexão

	}
}
