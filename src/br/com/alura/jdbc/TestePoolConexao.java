package br.com.alura.jdbc;

import java.sql.SQLException;

public class TestePoolConexao {

	public static void main(String[] args) throws SQLException {
		
		ConnectionFactory connectionFactory = new ConnectionFactory();
		
		for(int i = 0; i < 30; i++) {
			connectionFactory.recuperarConexao();
			System.out.println("Conexão número: " + i);
		}
	}

}
