package com.fors;

import java.util.ArrayList;
import java.util.List;

public class For {

	public static void main(String[] args) {
		
		List<User> user = new ArrayList<>();
		
		for(int x = 0; x < 10; x++) {
			user.add(new User("Nome " + x));
		}
		
		System.out.println(user);
	}
}
