package br.com.alura.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TesteInsercao{
	public static void main(String[] args) throws SQLException {
		
		ConnectionFactory factory =  new ConnectionFactory();
		Connection connection = factory.recuperarConexao();
		
		Statement stm = connection.createStatement();
		
		stm.execute("INSERT INTO PRODUTO (NOME, DESCRICAO) VALUES ('MOUSE', 'MOUSE DE COMPUTADOR')", Statement.RETURN_GENERATED_KEYS);
		
		ResultSet rst = stm.getGeneratedKeys();		
		
		while(rst.next()) {
			Integer id = rst.getInt(1);
			System.out.println("O ID criado foi: " + id);
		}
		rst.close();
		stm.close();
		connection.close();
		}
	
}