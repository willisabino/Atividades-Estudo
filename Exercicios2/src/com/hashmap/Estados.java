package com.hashmap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Estados {
	
	public static void main(String[] args) {
		
		LinkedHashMap<String, String> map = new LinkedHashMap<>();
		
		
		map.put("AC", "Acre"); map.put("AL", "Alagoas");
		map.put("AP", "Amap�"); map.put("AM", "Amazonas");
		map.put("BA", "Bahia"); map.put("CE", "Cear�"); 
		map.put("DF", "Distrito Federal"); map.put("ES", "Esp�rito Santo"); 
		map.put("GO", "Goi�s"); 
		
		for(String sigla : map.keySet()) {
			System.out.println(sigla + " ");
		}
		
		System.out.println("====");
		
		for(String valor : map.values()) {
			System.out.println(valor);
		}	
		
		System.out.println("===");
		
		for(Entry<String, String> entrada : map.entrySet()) {
			
			System.out.println(entrada.getKey());
			System.out.println(entrada.getValue());
		}

	}

}
