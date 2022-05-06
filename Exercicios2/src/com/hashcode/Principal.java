package com.hashcode;

import java.util.HashSet;
import java.util.Set;

public class Principal {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa(1, "nome1");
		Pessoa p2 = new Pessoa(2, "nome2");
		Pessoa p3 = new Pessoa(3, "nome3");
		Pessoa p4 = new Pessoa(1, "nome1");
		Pessoa pesquisa = new Pessoa(2);
		
		Set<Pessoa> pessoas = new HashSet<Pessoa>();

		pessoas.add(p1);
		pessoas.add(p2);
		pessoas.add(p3);
		pessoas.add(p4);
		
		boolean existePessoa = pessoas.contains(pesquisa);
		System.out.println("Existe pessoa: " + existePessoa);
		
		System.out.println("===");
		System.out.println(pesquisa.hashCode(p1));
		System.out.println("=====");
		System.out.println(pessoas);
		
	}
	
}
