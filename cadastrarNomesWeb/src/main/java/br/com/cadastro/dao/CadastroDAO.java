package br.com.cadastro.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;

import br.com.cadastro.factory.ConnectionFactory;
import br.com.cadastro.model.Cadastro;

public class CadastroDAO {

	public void save(Cadastro cadastro) {
		
		String sql = "INSERT INTO tb_nomes(nome, dataCadastro) VALUES (?, ?)";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {
			//Criar uma conex�o com banco de dados
			conn = ConnectionFactory.createConnectionToMySQL();
			
			//Criamos uma PreparedStatement para executar query
			pstm = conn.prepareStatement(sql);
			
			//Adicionamos os valores que s�o esperados pela query
			pstm.setString(1, cadastro.getNome());
			pstm.setDate(2, new Date(cadastro.getDataCadastro().getTime()));
			
			//Executar a query
			pstm.execute();
			
		}catch (Exception e) {
			
			e.printStackTrace();
			System.out.println("Erro de conex�o");
			
		}finally {
			//Fechar as conex�es
			try{
				if(pstm!=null){
					pstm.close();
				}
				
				if(conn!=null) {
					conn.close();
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}
