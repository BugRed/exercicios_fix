package exercicio_fix;

import java.util.Scanner;

public class multiplus {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número");
		int a = sc.nextInt();
		sc.nextLine();
		System.out.println("Digite o segundo número");
		int b = sc.nextInt();
		sc.nextLine();
		
		if (a % b == 0 || b % a ==0) {
			System.out.println("São multiplos");
		}
		else {
			System.out.println("Não são multiplos");
		}
		sc.close();
	}

}
