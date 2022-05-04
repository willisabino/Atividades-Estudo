package com.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ListaAluno {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		HashSet<Aluno> conjunto = new HashSet<Aluno>();
		HashSet<String> carros = new HashSet<String>();
		ArrayList<Aluno> aluno = new ArrayList<>();
		
		Aluno a = new Aluno("Willi", "Java", 10);
		Aluno b = new Aluno("Willi", "Java", 10);
		Aluno c = new Aluno("Willi", "Java", 10);
		Aluno d = new Aluno("W", "Site", 8);
		Aluno e = new Aluno("Ramonnnn", "Logica", 10);
		
		conjunto.add(a);
		conjunto.add(b);
		conjunto.add(c);
		conjunto.add(d);
		conjunto.add(e);
		
		carros.add("HRV");
		carros.add("HRV");
		carros.add("Oi");
		
		aluno.add(a);
		aluno.add(b);
		aluno.add(c);
		aluno.add(d);
		aluno.add(d);
		
		/*System.out.println("nome");
		String nome = ler.nextLine();
		System.out.println("Curso");
		String curso = ler.nextLine();
		System.out.println("nota");
		double nota = ler.nextDouble();
		
		conjunto.add(new Aluno(nome, curso, nota));
		
		ler.nextLine();
		System.out.println("nome");
		String nome2 = ler.nextLine();
		System.out.println("Curso");
		String curso2 = ler.nextLine();
		System.out.println("nota");
		double nota2 = ler.nextDouble();
		
		conjunto.add(new Aluno(nome2, curso2, nota2));*/
		
		System.out.println(conjunto);
		System.out.println("=======");
		System.out.println(carros);
		System.out.println("=======");
		System.out.println(aluno);

	}

}
