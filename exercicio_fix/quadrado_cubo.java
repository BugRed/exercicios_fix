package exercicio_fix;

import java.util.Scanner;

public class quadrado_cubo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numeral");
		int check = sc.nextInt();
		
		for (int i = 1; i <= check; i++) {
			int cubo = (int)Math.pow(i, 3.0);
			int quadrado = (int)Math.pow(i, 2.0);
			System.out.printf("%d %d %d%n", i, quadrado, cubo);			
		}
		sc.close();

	}

}
