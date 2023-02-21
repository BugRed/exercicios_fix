package exercicio_fix;

import java.util.Locale;
import java.util.Scanner;

public class divivid_ex {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos pares você quer calcular:");
		int check = sc.nextInt();

		for (int i = 0; i < check; i++) {

			System.out.println("Digite o primeiro número");
			int a = sc.nextInt();
			System.out.println("Digite o segundo número");
			int b = sc.nextInt();

			if (a != 0 && b != 0) {
				double div = (double) a / b;
				System.out.printf("%d dividido por %d é igual a: %.1f%n", a, b, div);

			} else {
				System.out.println("Impóssivel dividir");
			}

		}
		sc.close();

	}

}
