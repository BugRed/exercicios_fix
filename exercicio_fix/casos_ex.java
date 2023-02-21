package exercicio_fix;

import java.util.Locale;
import java.util.Scanner;

public class casos_ex {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos casos precisa checar");
		int caso = sc.nextInt();

		for (int i = 0; i < caso; i++) {
			System.out.println("Digite os valores de três sem três");
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double c = sc.nextDouble();
			double media = a * 2 + 3 * b + 5 * c;
			System.out.printf("Sua média é: %.2f%n", media);
		}
		sc.close();

	}

}
