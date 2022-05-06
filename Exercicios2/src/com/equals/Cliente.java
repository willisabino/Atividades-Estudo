package com.equals;

public class Cliente {

	private int rg;
	private String nome;
	
	public Cliente(int rg) {
		this.setRg(rg);
	}
	
	public boolean Equals(Cliente obj) {
		if(obj == null) {
			return false;
		}
		
		/*Cliente c2 = obj as Cliente;
		
		if(c2 == null) {
			return false;
		}
		
		/*if(base.Equals(obj)) {
			return true;
		}*/
		
		return this.rg == obj.rg;
		
	}

	@Override
	public boolean equals(Object obj) {
		Cliente p = (Cliente) obj;
		return (this.rg == p.rg) && this.nome.equals(p.nome);
	}
	

	public int getRg() {
		return rg;
	}

	public void setRg(int rg) {
		this.rg = rg;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
