package br.com.cadastro.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;

import br.com.cadastro.factory.ConnectionFactory;
import br.com.cadastro.model.Cadastro;

public class CadastroDAO {

	public void save(Cadastro cadastro) {
		
		String sql = "INSERT INTO tb_nomes(nome) VALUES (?)";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {
			//Criar uma conexão com banco de dados
			conn = ConnectionFactory.createConnectionToMySQL();
			
			//Criamos uma PreparedStatement para executar query
			pstm = (PreparedStatement) conn.prepareStatement(sql);
			
			//Adicionamos os valores que são esperados pela query
			pstm.setString(1, cadastro.getNome());
			pstm.setDate(2, new Date(cadastro.getDataCadastro().getTime()));
			
			//Executar a query
			pstm.execute();
			
		}catch (Exception e) {
			
			e.printStackTrace();
			
		}finally {
			//Fechar as conexões
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
