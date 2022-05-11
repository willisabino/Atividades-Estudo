package com.fors;

public class User {

	private String nome;
	
	

	public User() {
		super();
	}



	public User(String nome) {
		super();
		this.nome = nome;
	}
	
	

	@Override
	public String toString() {
		return nome + " ";
	}



	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
