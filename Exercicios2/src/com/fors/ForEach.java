package com.fors;

import java.util.ArrayList;

public class ForEach {
	
	public static void main(String[] args) {
		
		ArrayList<User> user = new ArrayList<>();
		user.add(new User("Nome1"));
		user.add(new User("Nome2"));
		user.add(new User("Nome3"));
		
		for(User x : user) {
			System.out.println(x);
		}
		
		
		int[] num = new int[4];
		int x = 0;
		for(int i:num) {
			System.out.println(num[i] + x);
			x++;
		}
		
		System.out.println(user);
		
	}
}
