package wrapperteste;

public class Testeee {
	
	public static void main(String[] args) {
		Integer a = 127;
		Integer b = 127;
		Integer c = 128;
		Integer d = 128;
		System.out.println(a == b);
		System.out.println(c == d);
		System.out.println(a.equals(b));
		
		
		System.out.println("=========");
		
		String nome = "oi";
		String nome2 = "oi";
		String nome3 = new String("oi");
		
		byte abc = 127;
		
		System.out.println("Nomes iguais: " + (nome == nome2));
		System.out.println("Nomes iguais: " + (nome == nome3));
		
	}

}
