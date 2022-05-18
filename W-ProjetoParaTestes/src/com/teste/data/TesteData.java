package com.teste.data;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TesteData {

	public static void main(String[] args) {
		
		Date data = new Date();
		
		SimpleDateFormat formatador = new SimpleDateFormat("dd-MM-yyyy");
		
		String Calibragemveiculo = formatador.format(data);
		
		System.out.println(Calibragemveiculo);

	}

}
