package br.com.agendaWeb.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.agendaWeb.factory.ConnectionFactory;
import br.com.agendaWeb.model.AgendaWeb;

public class AgendaWebDao {

	public List<AgendaWeb> getAgendaWeb(){
		
		String sql = "SELECT * FROM tb_registros";
		
		List<AgendaWeb> agendas = new ArrayList<AgendaWeb>();
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		//Classe que vai recuperar os dados do banco ***SELECT***
		ResultSet rset = null;
		
		try {
			conn = ConnectionFactory.createConnectionToMySQL();
			
			pstm = conn.prepareStatement(sql);
			
			rset = pstm.executeQuery(); 
			
			while(rset.next()) {
				
				AgendaWeb agendaWeb = new AgendaWeb();
				
				//Recuperar o ID
				agendaWeb.setId(rset.getInt("id"));
				//Recuperar o nome
				agendaWeb.setNome(rset.getString("nome"));
				//Recuperar a idade
				agendaWeb.setTelefone(rset.getLong("telefone"));
				//Recuperar a data de cadastro
				agendaWeb.setDataCadastro(rset.getDate("dataCadastro"));
				
				agendas.add(agendaWeb);
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
		
		return agendas;
	}

	public void save(AgendaWeb agendaWeb) {
		
		String sql = "INSERT INTO tb_registros(nome, telefone, dataCadastro) VALUES (?, ?, ?)";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		
		try {
			//Criar uma conexão com banco de dados
			conn = ConnectionFactory.createConnectionToMySQL();
			
			//Criamos uma PreparedStatement para executar query
			pstm = conn.prepareStatement(sql);
			
			//Adicionamos os valores que são esperados pela query
			pstm.setString(1, agendaWeb.getNome());
			pstm.setLong(2, agendaWeb.getTelefone());
			pstm.setDate(3, new Date(agendaWeb.getDataCadastro().getTime()));
			
			//Executar a query
			pstm.execute();
			
		}catch (Exception e) {
			
			e.printStackTrace();
			System.out.println("Erro de conexão");
			
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
