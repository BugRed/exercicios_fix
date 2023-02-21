package exercicio_fix;

import java.util.Locale;
import java.util.Scanner;

public class importo_renda {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor do seu salário");
		double salary = sc.nextDouble();
		sc.nextLine();
		double imposto;

		if (salary <= 2000.00) {
			imposto = 0.0;
		} else if (salary <= 3000.00) {
			imposto = (salary - 2000.00) * 0.08;
		} else if (salary <= 4500.00) {
			imposto = (salary - 3000.00) * 0.08 + 1000.0 * 0.08;
		} else {
			imposto = (salary - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.00 * 0.08;
		}

		if (imposto == 0) {
			System.out.println("Insento");
		} else {
			System.out.printf("Seu imposto de rende fica no valor de R$ %.2f%n", imposto);
		}
		sc.close();
	}

}
