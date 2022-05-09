package wrapperteste;

public class TratandoString {

	public static void main(String[] args) {
		int s = 1;
		int s2 = 1;
		
		System.out.println(s == s2);
		System.out.println("=========");
		
		String res = 1 + 2 +1 + "" + 1 + 5; 
		System.out.println(res);
		/*Nesse exemplo, o java começou a contar o numeros e, quando chegou na string,
		 * transformou a variavel em string. Por esse motivo consegui realizar
		 * uma soma com String.
		 * Outro detalhe é que, depois das aspas, a variavel virou String e não
		 * consigo mais somar.
		 * 
		 * 
		 * REGRA
		 * "" Depois do numeral eu somo.
		 * "" Antes do numeral vira String*/

	}

}
