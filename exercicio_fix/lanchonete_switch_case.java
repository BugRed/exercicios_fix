package exercicio_fix;

import java.util.Locale;
import java.util.Scanner;

public class lanchonete_switch_case {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double total;
		System.out.println("Digite o código do produto:");
		int cod = sc.nextInt();
		sc.nextLine();
		System.out.println("Digite a quantidade de produtos:");
		int quant = sc.nextInt();
		sc.nextLine();

		switch (cod) {
		case 1:
			total = quant * 4.00;
			break;
		case 2:
			total = quant * 4.50;
			break;
		case 3:
			total = quant * 5.00;
			break;
		case 4:
			total = quant * 2.00;
			break;
		case 5:
			total = quant * 1.50;
			break;
		default:
			System.out.println("Código inválido");
			total = 0;
			break;
		}
		System.out.printf("Total da conta: %.2f%n", total);
		sc.close();
	}

}
