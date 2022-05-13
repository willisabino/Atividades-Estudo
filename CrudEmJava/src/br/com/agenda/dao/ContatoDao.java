package br.com.agenda.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.agenda.factory.ConnectionFactory;
import br.com.agenda.model.Contato;

public class ContatoDao {
	
	/*
	 * CRUD
	 * C: CREATE - OK
	 * R: READ
	 * U: UPDATE
	 * D: DELETE
	 */

	
	public void save(Contato contato) {
		
		String sql = "INSERT INTO tb_pessoas(nome, idade, dataCadastro) VALUES (?, ?, ?)";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {
			//Criar uma conexão com banco de dados
			conn = ConnectionFactory.createConnectionToMySQL();
			
			//Criamos uma PreparedStatement para executar query
			pstm = (PreparedStatement) conn.prepareStatement(sql);
			
			//Adicionamos os valores que são esperados pela query
			pstm.setString(1, contato.getNome());
			pstm.setInt(2, contato.getIdade());
			pstm.setDate(3, new Date(contato.getDataCadastro().getTime()));
			
			//Executar a query
			pstm.execute();
			
			System.out.println("Dados salvos!!!");
			
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


	public List<Contato> getContatos(){
		
		String sql = "SELECT * FROM tb_pessoas";
		
		List<Contato> contatos = new ArrayList<Contato>();
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		//Classe que vai recuperar os dados do banco ***SELECT***
		ResultSet rset = null;
		
		try {
			conn = ConnectionFactory.createConnectionToMySQL();
			
			pstm = conn.prepareStatement(sql);
			
			rset = pstm.executeQuery(); 
			
			while(rset.next()) {
				
				Contato contato = new Contato();
				
				//Recuperar o ID
				contato.setId(rset.getInt("id"));
				//Recuperar o nome
				contato.setNome(rset.getString("nome"));
				//Recuperar a idade
				contato.setId(rset.getInt("idade"));
				//Recuperar a data de cadastro
				contato.setDataCadastro(rset.getDate("dataCadastro"));
				
				contatos.add(contato);
			}
			
		}catch (Exception e) {
			
			e.printStackTrace();
			
		}finally {
			try {
				if(rset != null) {
					rset.close();
				}
				
				if(pstm != null) {
					pstm.close();
				}
				
				if(conn!=null) {
					conn.close();
				}
				
			}catch(Exception e) {
				e.printStackTrace(); 
			}
		}
		
		return contatos;
	}


	public void update(Contato contato) {
		
		String sql = "UPDATE tb_pessoas SET nome = ?, idade = ?, dataCadastro = ? "+
		"WHERE id = ?";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {
			//Criar conexão com o banco
			conn = ConnectionFactory.createConnectionToMySQL();
			
			//Criar a classe para executar a query
			pstm = conn.prepareStatement(sql);
			
			//Adicionar os valores para atualizar
			pstm.setString(1, contato.getNome());
			pstm.setInt(2, contato.getIdade());
			pstm.setDate(3, new Date(contato.getDataCadastro().getTime()));
			
			
			//Qual o ID do resgistro que deseja atualizar?
			pstm.setLong(4, contato.getId());
			
			//Executar a Query
			pstm.execute();
			
		}catch(Exception e) {
			
			e.printStackTrace();
			
		}finally {
			try {
				if(pstm!=null) {
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

	
	public void deleteById(int id) {
		
		String sql = "DELETE FROM tb_pessoas WHERE id = ?";
		
		Connection conn = null;
		
		PreparedStatement pstm = null;
		
		try {
			conn = ConnectionFactory.createConnectionToMySQL();
			
			pstm = conn.prepareStatement(sql);
			
			pstm.setLong(1, id);
			
			pstm.execute();
			
		}catch (Exception e) {
			
			e.printStackTrace();
			
		}finally {
			try {
				if(pstm != null) {
					
					pstm.close();
					
				}
				if(conn != null) {
					conn.close();
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}

