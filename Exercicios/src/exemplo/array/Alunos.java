package exemplo.array;

import java.util.Scanner;

public class Alunos {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		/*int[] nota = new int[5];
		
		for(int x=0; x < 5; x++) {
			System.out.println("Valor ");
			nota[x] = ler.nextInt();
		}
		System.out.println("Valores digitados");
		for(int x : nota) {
			System.out.println(x);
		}*/
		
		//Matriz
		int mat[][] = new int[3][3];
		int soma=0, somaDiagonal=0;
		
		for(int x = 0; x < 3; x++) {
			for(int y = 0; y < 3; y++) {
				System.out.println("Digite o valor da linha " + (x+1) + " coluna " + (y+1) + ": ");
				mat[x][y] = ler.nextInt();

				soma += mat[x][y];
			}
		}
		somaDiagonal = mat[0][0] + mat[1][1] + mat[2][2];
		System.out.println("A somatória de todos os valores da matriz é: " + soma);
		System.out.println("A somatória da primeira diagonal é: " + somaDiagonal);

	}
	
}
