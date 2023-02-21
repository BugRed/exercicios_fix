package exercicio_fix;

import java.util.Locale;
import java.util.Scanner;

public class quadrantes_cartesianos {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor de x");
		double x = sc.nextDouble();
		sc.nextLine();
		System.out.println("Digite o valor de y");
		double y = sc.nextDouble();
		sc.nextLine();

		while (x != 0 && y != 0) {

			if (x > 0 && y > 0) {
				System.out.println("Q1");
			} else if (x < 0 && y > 0) {
				System.out.println("Q2");
			} else if (x < 0 && y < 0) {
				System.out.println("Q3");
			} else if (x > 0 && y < 0) {
				System.out.println("Q4");
			}
			System.out.println("Digite um novo x");
			x = sc.nextDouble();
			sc.nextLine();
			System.out.println("Digite um novo y");
			y = sc.nextDouble();
			sc.nextLine();
			
		}
		
		sc.close();
	}

}
