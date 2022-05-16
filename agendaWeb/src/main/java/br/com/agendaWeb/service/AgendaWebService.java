package br.com.agendaWeb.service;

import java.util.ArrayList;
import java.util.Date;

import br.com.agendaWeb.dao.AgendaWebDao;
import br.com.agendaWeb.model.AgendaWeb;

public class AgendaWebService {
	
	private long id;
	private String nome;
	private long telefone;
	private Date dataCadastro;
	
	
	public AgendaWebService() {
		super();
	}

	public AgendaWebService(long id, String nome, long telefone, Date dataCadastro) {
		super();
		this.id = id;
		this.nome = nome;
		this.telefone = telefone;
		this.dataCadastro = dataCadastro;
	}

	@Override
	public String toString() {
		return "Id=" + id + ", Nome=" + nome + ", Telefone=" + telefone + "DataCadastro="
				+ dataCadastro + "]";
	}

	public ArrayList<AgendaWebService> registros() {
		
		AgendaWebDao agendaWebDao = new AgendaWebDao();
		ArrayList<AgendaWebDao> contatos = new ArrayList<>();
		AgendaWeb agendaWeb = new AgendaWeb();
		
		ArrayList<AgendaWebService> listaAgenda = new ArrayList<>();

		//Visualização dos registros do banco de dados TODOS		
		for(AgendaWeb registros : agendaWebDao.getAgendaWeb()) {
			
			listaAgenda.add(new AgendaWebService(registros.getId(), registros.getNome(), registros.getTelefone(), registros.getDataCadastro()));
		
		}
		
		return listaAgenda;
	}

	
	public void save(String nome, String telefone) {
		
		AgendaWebDao agendaWebDao = new AgendaWebDao();
		long fone = Long.parseLong(telefone);
		
		AgendaWeb agendaWeb = new AgendaWeb();
		agendaWeb.setNome(nome);
		agendaWeb.setTelefone(fone);
		agendaWeb.setDataCadastro(new Date());
		
		agendaWebDao.save(agendaWeb);
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public long getTelefone() {
		return telefone;
	}

	public void setTelefone(long telefone) {
		this.telefone = telefone;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	
	
}
