package exercicio_fix;

import java.util.Locale;
import java.util.Scanner;

public class media_idade {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a idade da primeira pessoa:");
		int idade = sc.nextInt();
		sc.nextLine();
		int soma = 0;
		int quant = 0;

		while (idade >= 0) {

			soma = soma + idade;
			quant = quant + 1;
			System.out.println("Digite a idade da próxima pessoa:");
			idade = sc.nextInt();

		}
		if (quant > 0) {
			double media = (double) soma / quant;
			System.out.printf("A média entre as idades das %d é de %.2f%n", quant, media);
		} else {
			System.out.println("Impossivél calcular!");
		}

		sc.close();
	}

}
