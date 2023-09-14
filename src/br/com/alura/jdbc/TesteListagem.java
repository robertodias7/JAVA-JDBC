package br.com.alura.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TesteListagem{
	public static void main(String[] args) throws SQLException {
		ConnectionFactory factory = new ConnectionFactory();
		Connection connection = factory.recuperarConexao();
			
		PreparedStatement stm = connection.prepareStatement("SELECT ID, NOME, DESCRICAO FROM PRODUTO");
		
		stm.execute();
		
		ResultSet rst = stm.getResultSet();
		
		while(rst.next()) {
			Integer id = rst.getInt("ID");
			System.out.println(id);
			String nome =  rst.getString("NOME");
			System.out.println(nome);
			String descricao = rst.getString("DESCRICAO");
			System.out.println(descricao);
		}
		rst.close();
		stm.close();
		connection.close();
		}
}