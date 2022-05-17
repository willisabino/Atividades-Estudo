package br.com.cadastropessoas.factory;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
	
	//Nome do usuário
	private static final String USERNAME = "root";
	
	//Senha do banco de dados
	private static final String PASSWORD = "root";
	
	//Caminho do banco de dados, porta, nome do db
	private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/db_cadastro";

	/*
	 * Conexão com banco de dados
	 */
	
	public static Connection createConnectionToMySQL() throws Exception{
		
		//Faz com que a classe seja carregada pela JVM
		Class.forName("com.mysql.jdbc.Driver");
		
		//Cria Conexão com banco de dados
		Connection connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
		
		return connection;
	}
	
	public static void main(String[] args) throws Exception {
		
		//Recuperar uma conexão com banco de dados
		Connection con = createConnectionToMySQL();
		
		//Testar se conexão é nula
		if(con!=null) {
			System.out.println("Conexão obtida com sucesso!");
			con.close();
		}
		
	}

}
