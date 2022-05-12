package com.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Conexao {

	public static void main(String[] args) throws SQLException {
		
		Connection connection = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_funcionario", "root", "root");
			ResultSet rsCliente = connection.createStatement().executeQuery("Select * from tb_pessoas");
			while (rsCliente.next()) {
				System.out.println("Nome: " + rsCliente.getString("nome"));
			}
		} catch (ClassNotFoundException e) {
			
			System.out.println("Driver do banco de dados não localizado.");
			
		} catch (SQLException e) {
			
			System.out.println("Ocorreu um erro ao acessar o banco " + e.getMessage());
			
		} finally{
			
			if (connection != null) {
				connection.close();
			}
		}

	}

}
