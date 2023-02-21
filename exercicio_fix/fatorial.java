package exercicio_fix;

import java.util.Scanner;

public class fatorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor");
		int number = sc.nextInt();
		int fat = 1;
		
		for (int i = 1; i<=number; i++) {
			fat = fat * i;
		}
		System.out.printf("O fatorial do número %d é igual a: %d", number, fat);
		sc.close();

	}

}
