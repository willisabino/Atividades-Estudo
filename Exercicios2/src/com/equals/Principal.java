package com.equals;

public class Principal {

	public static void main(String[] args) {
		
		Cliente c1 = new Cliente(123);
		Cliente c2 = new Cliente(124);
		Cliente c3 = new Cliente(123);
		Cliente c4 = c1;
		
		Cliente2 c21 = new Cliente2(123);
	
		System.out.println(c1.Equals(c3));
		System.out.println(c1.Equals(null));
		System.out.println(c1.Equals(c2));
		System.out.println(c1.Equals(c4));
		System.out.println(c2.Equals(c1));
		System.out.println("====");
		
		System.out.println(c1.equals(c3));

	}

}
