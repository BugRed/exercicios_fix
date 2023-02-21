package exercicio_fix;

import java.util.Scanner;

public class posto_produtos {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;

		System.out.println("Qual combustível você deseja:");
		int check = sc.nextInt();
		sc.nextLine();

		while (check != 4) {
			if (check == 1) {
				alcool = alcool + 1;
			}
			else if (check == 2) {
				gasolina = gasolina + 1;
			}
			else if (check == 3) {
				diesel = diesel + 1;
			}
			
			System.out.println("Digite qual outro produto deseja:");
			check = sc.nextInt();
			sc.nextLine();
		}
		System.out.println("Muito Obrigado!");
		System.out.printf("Álcool: %d%n", alcool);
		System.out.printf("Gasolina: %d%n", gasolina);
		System.out.printf("Diesel: %d%n", diesel);
		sc.close();

	}
}
