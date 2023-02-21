package exercicio_fix;

import java.util.Locale;
import java.util.Scanner;

public class lanchonete_ex {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Digite o código do produto");
		int cod = sc.nextInt();
		sc.nextLine();
		System.out.println("Digite a quantidade de produtos");
		int quant = sc.nextInt();
		sc.nextLine();
		double total;
		
		if (cod == 1) {
			total = quant * 4.00;
			System.out.println("Total:" + total);
		}
		else if (cod == 2) {
			total = quant * 4.50;
			System.out.println("Total:" + total);
		}
		else if (cod == 3) {
			total = quant * 5.00;
			System.out.println("Total:" + total);
		}
		else if (cod == 4) {
			total = quant * 2.00;
			System.out.println("Total:" + total);
		}
		else if (cod == 5) {
			total = quant * 1.50;
			System.out.println("Total:" + total);
		}
		else {
			System.out.println("Codigo invalido");
		}
		sc.close();

	}

}
