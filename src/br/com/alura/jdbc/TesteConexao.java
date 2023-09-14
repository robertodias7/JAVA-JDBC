package br.com.alura.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

public class TesteConexao{
	
	public static void main(String[] args) throws SQLException {
		ConnectionFactory factory = new ConnectionFactory();
		Connection connection = factory.recuperarConexao();
		System.out.println("Conexão Funcionando!");
		
		connection.close();
	}
	
}
