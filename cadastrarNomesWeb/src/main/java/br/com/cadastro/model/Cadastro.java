package br.com.cadastro.model;

import java.util.Date;

public class Cadastro {
	
	private int id;
	private String nome;
	private Date dataCadastro;
	
	
	//Getters e Setters

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	//Getters e Setters
	
	

}
