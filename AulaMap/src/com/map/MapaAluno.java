package com.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapaAluno {
	public static void main(String[] args) {

		Map<String, Aluno> mapa = new TreeMap<String, Aluno>();

		Aluno a = new Aluno("Willi", "Java", 10);
		Aluno b = new Aluno("Ramon", "Inglês", 9);
		Aluno c = new Aluno("Sabino", "Internet", 5.5);
		Aluno d = new Aluno("W", "Site", 8);

		mapa.put("Willi", a);
		mapa.put("Ramon", b);
		mapa.put("Sabino", c);
		mapa.put("W", d);
		
		System.out.println(mapa.values());
		System.out.println(mapa.get("Willi"));
		
		Collection<Aluno> alunos = mapa.values();
		
		for(Aluno e: alunos) {
			System.out.println(e);
		}
		
		HashMap<Integer, String> carros = new HashMap<Integer, String>();
		
		carros.put(1, "carro1");
		carros.put(2, "carro2");
		carros.put(3, "carro3");
		carros.put(4, "carro4");
		
		carros.remove(4);
		//carros.clear() --- Limpa minha coleção
		
		System.out.println(carros);
		System.out.println(carros.get(1));
		
		for(String ca : carros.values()) {
			System.out.println(ca);
		}
		
		int[] num = new int[] {1, 2, 3};
		for(int x : num) {
			System.out.println(x);
		}
		
		
	}
}
