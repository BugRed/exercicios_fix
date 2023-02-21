package exercicio_fix;

import java.util.Locale;
import java.util.Scanner;

public class nota_aluno {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a nota do primeiro semestre:");
		double nota1 = sc.nextDouble();
		sc.nextLine();
		System.out.println("Digite a nota do segundo semestre:");
		double nota2 = sc.nextDouble();
		sc.nextLine();
		double notaFinal = nota1 + nota2;

		if (notaFinal > 60.00) {
			System.out.printf("Nota final: %.1f%n", notaFinal);
			System.out.println("Aprovado!");
		} else {
			System.out.printf("Nota final: %.1f%n", notaFinal);
			System.out.println("Reprovado!");
		}

		sc.close();

	}

}
