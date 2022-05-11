package com.fors;

import java.util.ArrayList;

public class Iterator {
	public static void main(String[] args) {
		
		ArrayList<String> nomes = new ArrayList<>();
		nomes.add("Willi");
		nomes.add("Ramon");
		nomes.add("Sabino");
		
		java.util.Iterator<String> lista = nomes.iterator();
		
		System.out.println(nomes);
		System.out.println(lista.next());
		System.out.println(lista.next());
		System.out.println(lista.next());
		
		
		while(lista.hasNext()) {
			String novaLista = lista.next();
			System.out.println(novaLista);
		}
		
		System.out.println("====");
		
	
		
		
		

	}
}
