package exercicio_fix;

import java.util.Scanner;

public class menor_numero {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o primeiro número");
		int a = sc.nextInt();
		sc.nextLine();
		System.out.println("Digite o segundo número");
		int b = sc.nextInt();
		sc.nextLine();
		System.out.println("Digite o terceiro número");
		int c = sc.nextInt();
		sc.nextLine();

		if (a < b && a < c) {

			System.out.printf("O menor número é: %d%n", a);
		} else if (b < a && b < c) {
			System.out.printf("O menor número é: %d%n", b);
		} else {
			System.out.printf("O menor número é: %d%n", c);
		}
		sc.close();
	}

}
