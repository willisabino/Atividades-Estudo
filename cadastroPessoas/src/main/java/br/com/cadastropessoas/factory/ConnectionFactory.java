package br.com.cadastropessoas.factory;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
	
	//Nome do usu�rio
	private static final String USERNAME = "root";
	
	//Senha do banco de dados
	private static final String PASSWORD = "root";
	
	//Caminho do banco de dados, porta, nome do db
	private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/db_cadastro";

	/*
	 * Conex�o com banco de dados
	 */
	
	public static Connection createConnectionToMySQL() throws Exception{
		
		//Faz com que a classe seja carregada pela JVM
		Class.forName("com.mysql.jdbc.Driver");
		
		//Cria Conex�o com banco de dados
		Connection connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
		
		return connection;
	}
	
	public static void main(String[] args) throws Exception {
		
		//Recuperar uma conex�o com banco de dados
		Connection con = createConnectionToMySQL();
		
		//Testar se conex�o � nula
		if(con!=null) {
			System.out.println("Conex�o obtida com sucesso!");
			con.close();
		}
		
	}

}
