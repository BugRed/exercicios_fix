package exercicio_fix;

import java.util.Scanner;

public class bit_wise {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int mask = 0b00010000;
		System.out.print("Digite o número a ser testado:");
		int n = sc.nextInt();
		if ((n & mask) != 0) {
			System.out.println("O 5º número é verdadeiro!");
		}
		else {
			System.out.println("O 5º número é falso!");
		}
		sc.close();
	}
	

}
