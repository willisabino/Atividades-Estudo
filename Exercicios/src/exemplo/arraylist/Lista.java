package exemplo.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Lista {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int op = 1;
		
		Cliente c1 = new Cliente("Willi", 26, 1.80);
		Cliente c2 = new Cliente("Tamiris", 24, 1.60);
		Cliente c3 = new Cliente("Ariane", 23, 1.60);
		
		ArrayList<Cliente> lista = new ArrayList<>();
		ArrayList<Cliente> lista2 = new ArrayList<>();
		
		lista.add(c1);
		lista.add(c2);
		lista.add(c3);
		System.out.println(lista);
		
		lista.remove(c3);
		System.out.println(lista);
		
		int tamanho = lista.size();
		System.out.println("Tamanho da lista: " + tamanho);
		
		//Entrada de valores manualmente
		
		do{
		System.out.println("Digite o nome: ");
		String nome = ler.nextLine();
		System.out.println("Digite a idade: ");
		int idade = ler.nextInt();
		System.out.println("A altura: ");
		double altura = ler.nextDouble();
		
		lista2.add(new Cliente(nome, idade, altura));
		
		System.out.println("Adicionar mais alguém? Digite 1 para adicionar cliente e 2 para parar");
		op = ler.nextInt();
		ler.nextLine();
		}while(op != 2);
		
		System.out.println(lista2);
		
		System.out.println("=======");
		
		lista.addAll(lista2);
		System.out.println("Listas 1 e 2 junstas");
		System.out.println(lista);
		
	}
}
