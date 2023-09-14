package br.com.alura.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class TesteRemocao{
	public static void main(String[] args) throws SQLException {
		ConnectionFactory fatory = new ConnectionFactory();
		Connection connection = fatory.recuperarConexao();
		
		PreparedStatement stm = connection.prepareStatement("DELETE FROM PRODUTO WHERE ID > ?");
		stm.setInt(1, 2);
		stm.execute();
		
		Integer linhasModificadas = stm.getUpdateCount();
		
		System.out.println("Quantidade de linhas removidas: " +  linhasModificadas);
		
		stm.close();
		connection.close();
	}
	
}
