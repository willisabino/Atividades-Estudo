package com.hashcode;

import java.util.Objects;

public class Pessoa {

	//Se x.equals(y) == true y.hashCode() == x.hashCode();
	//y.hashCode() == x.hashCode() n�o necess�riamente o equals dever� retornar true.
	//y.hashCode() != x.hashCode() ent�o x.equals(y) dever� ser falso
	
	
	private int codigo;
	private String nome;
	
	public Pessoa(int codigo, String nome) {
		super();
		this.codigo = codigo;
		this.nome = nome;
	}
	
	public Pessoa(int codigo) {
		this.codigo = codigo;
	}


	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}
	
	public boolean hashCode(Pessoa obj) {
		Pessoa bla = (Pessoa) obj;
		return this.codigo == bla.codigo;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		return this.codigo == other.codigo;
	}
	
	

	@Override
	public String toString() {
		return "nome=" + nome + " ";
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
