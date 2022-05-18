package br.com.cadastropessoas.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import br.com.cadastropessoas.factory.ConnectionFactory;
import br.com.cadastropessoas.model.Pessoa;

public class PessoaDao {

	public void inserirCadastro(Pessoa pessoa) {
		
		String sql = "INSERT INTO tb_ficha(nome, idade, sexo, dataCadastro) VALUES (?, ?, ?, ?)";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {
			//Criar uma conexão com banco de dados
			conn = ConnectionFactory.createConnectionToMySQL();
			
			//Criamos uma PreparedStatement para executar query
			pstm = (PreparedStatement) conn.prepareStatement(sql);
			
			//Adicionamos os valores que são esperados pela query
			pstm.setString(1, pessoa.getNome());
			pstm.setInt(2, pessoa.getIdade());
			pstm.setString(3, pessoa.getSexo());
			pstm.setDate(4, new Date(pessoa.getDataCadastro().getTime()));
			
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


	public ArrayList<Pessoa> getListaPessoas(){
		
		String sql = "SELECT * FROM tb_ficha";
		
		ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		//Classe que vai recuperar os dados do banco ***SELECT***
		ResultSet rset = null;
		
		try {
			conn = ConnectionFactory.createConnectionToMySQL();
			
			pstm = conn.prepareStatement(sql);
			
			rset = pstm.executeQuery(); 
			
			while(rset.next()) {
				
				Pessoa pessoa = new Pessoa();
				
				//Recuperar o ID
				pessoa.setId(rset.getInt("id"));
				//Recuperar o nome
				pessoa.setNome(rset.getString("nome"));
				//Recuperar a idade
				pessoa.setIdade(rset.getInt("idade"));
				//Recuperar a Sexo
				pessoa.setSexo(rset.getString("sexo"));
				//Recuperar a data de cadastro
				pessoa.setDataCadastro(rset.getDate("dataCadastro"));
				
				pessoas.add(pessoa);
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
		
		return pessoas;
	}


	public void editarCadastro(Pessoa pessoa) {
		
		String sql = "UPDATE tb_ficha SET nome = ?, idade = ?, sexo = ?, dataCadastro = ? "+
		"WHERE id = ?";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {
			//Criar conexão com o banco
			conn = ConnectionFactory.createConnectionToMySQL();
			
			//Criar a classe para executar a query
			pstm = conn.prepareStatement(sql);
			
			//Adicionar os valores para atualizar
			pstm.setString(1, pessoa.getNome());
			pstm.setInt(2, pessoa.getIdade());
			pstm.setString(3, pessoa.getSexo());
			pstm.setDate(4, new Date(pessoa.getDataCadastro().getTime()));
			
			
			//Qual o ID do resgistro que deseja atualizar?
			pstm.setLong(5, pessoa.getId());
			
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

	
	public void deletarCadastro(long id) {
		
		String sql = "DELETE FROM tb_ficha WHERE id = ?";
		
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
