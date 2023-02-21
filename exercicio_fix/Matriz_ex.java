package exercicio_fix;

import java.util.Scanner;

public class Matriz_ex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a ordem da matriz: ");
		int n = sc.nextInt();
		int[][] matz = new int[n][n];
		for (int i = 0; i < matz.length; i++) {
			for (int j = 0; j < matz[i].length; j++) {
				matz[i][j] = sc.nextInt();
			}
		}
		System.out.println(" Diagonal principal: ");
		for (int i = 0; i < matz.length; i++) {
			System.out.print(matz[i][i]);
		}

		int cont = 0;
		for (int i = 0; i < matz.length; i++) {
			for (int j = 0; j < matz[i].length; j++) {
				if (matz[i][j] < 0) {
				cont++;
				}
			}
		}

		System.out.println("quantidade de numeros negativos:" + cont);

		sc.close();
	}

}
