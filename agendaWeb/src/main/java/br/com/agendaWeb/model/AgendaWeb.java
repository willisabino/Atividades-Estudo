package br.com.agendaWeb.model;

import java.util.Date;

public class AgendaWeb {

	private long id;
	private String nome;
	private long telefone;
	private Date dataCadastro;
	
	//<Getters e Setters>
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
	//</Getters e Setters>
	
}
