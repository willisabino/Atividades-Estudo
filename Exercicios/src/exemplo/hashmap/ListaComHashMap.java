package exemplo.hashmap;

import java.util.HashMap;

public class ListaComHashMap {

	public static void main(String[] args) {
		
		HashMap<Integer, String> nomes = new HashMap<Integer, String>();
		
		nomes.put(1, "Willi");
		nomes.put(2, "Ramon");
		nomes.put(3, "Sabino");
		
		System.out.println(nomes);
		
		System.out.println(nomes.values());
		
		System.out.println("Buscando: " + (String)nomes.get(1));

	}

}
