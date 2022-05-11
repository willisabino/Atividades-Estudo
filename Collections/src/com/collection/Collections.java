package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

public class Collections {

	public static void main(String[] args) {
		ArrayList<String> nomes = new ArrayList<>();
		Collection<String> nomes2 = Arrays.asList("nomes", "mais");
		Scanner ler = new Scanner(System.in);
		
		nomes.add("Willi");
		nomes.add("Ramon");
		nomes.add("Sabino");
		
		for(String name : nomes) {
			System.out.println(name);
		}
		
		/*System.out.println("Consulte um nome: ");
		String nome = ler.nextLine();
		
		if(nomes.contains(nome)) {
			System.out.println("Esse nome está na lista");
		}else{
			System.out.println("Esse nome não está na lista");
		}*/
		
		/*System.out.println("Digite um nome para excluir");
		String nome = ler.nextLine();
		
		if(nomes.remove(nome) == false) {
			System.out.println("O nome " + nome + " não existe na lista");
		}else {
			System.out.println("Nome excluido");
		}*/
		
		System.out.println("Lista de nome: " + nomes);
		
		/*if(nomes.isEmpty()) {
			System.out.println("Lista vazia...");
		}else {
			System.out.println("Lista de nome: " + nomes);
		}*/
		
		//O método Clear() apaga todos os itens do da minha lista
	}
}
