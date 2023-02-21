package exercicio_fix;

import java.util.Scanner;

public class impar_entre {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número qualquer:");
		int check = sc.nextInt();
		
		for (int i=1; i<=check; i ++) {
				if (i % 2 != 0) {
					System.out.println(i);
				}
		}
		sc.close();
	}

}
