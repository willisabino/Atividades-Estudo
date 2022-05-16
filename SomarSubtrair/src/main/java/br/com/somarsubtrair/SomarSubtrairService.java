package br.com.somarsubtrair;

public class SomarSubtrairService {
	
	public String somar(String valor1, String valor2) {
		
		float numero1 = Float.parseFloat(valor1);
		float numero2 = Float.parseFloat(valor2);
		
		return Float.toString(numero1 + numero2);
		
	}
	
	public String subtrair(String valor1, String valor2) {
		
		float numero1 = Float.parseFloat(valor1);
		float numero2 = Float.parseFloat(valor2);
		
		return Float.toString(numero1 - numero2);
	}
}
