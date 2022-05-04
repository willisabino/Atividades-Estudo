package exemplo.hashset;

import java.util.HashSet;

public class ListaComHashSet {

	public static void main(String[] args) {
		HashSet<String> nomes = new HashSet<String>();
		
		nomes.add("Willi");
		nomes.add("Ramon");
		nomes.add("Willi");
		nomes.add("Tamiris");
		nomes.add("Willi");
		nomes.add("Ariane");
		
		System.out.println(nomes);
		
		System.out.println("Tamanho da minha lista de nomes: " + nomes.size());
		
		//Exemplo importando classes
		
		HashSet<Pessoas> nomes2 = new HashSet<Pessoas>();
		
		Pessoas n1 = new Pessoas("PrimeiroNome");
		Pessoas n2 = new Pessoas("SegundoNome");
		Pessoas n3 = new Pessoas("terceiroNome");
		Pessoas n4 = new Pessoas("QuartoNome");
		
		nomes2.add(n1);
		nomes2.add(n2);
		nomes2.add(n3);
		nomes2.add(n3);
		
		System.out.println(nomes2);
		
	} 

}
