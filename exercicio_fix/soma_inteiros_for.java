package exercicio_fix;

import java.util.Scanner;

public class soma_inteiros_for {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		int soma = 0;
		System.out.println("Quantos números devemos somas:");
		int quant = sc.nextInt();
		sc.nextLine();
		
		for (int i =0; i<quant; i++) {
			System.out.println("Digite um número para ser somado:");
			int number = sc.nextInt();
			sc.nextLine();
			soma = soma + number;
		}
		System.out.printf("Sua soma de %d números deu o total de %d", quant, soma);
		sc.close();

	}

}
