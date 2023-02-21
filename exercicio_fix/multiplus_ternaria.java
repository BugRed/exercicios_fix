package exercicio_fix;

import java.util.Scanner;

public class multiplus_ternaria {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor");
		int a = sc.nextInt();
		sc.nextLine();
		System.out.println("Digiti o segundo valor");
		int b = sc.nextInt();
		sc.nextLine();
		
		String resultado = (a % b == 0 || b % a == 0) ? "São multiplos" : "Não são Multiplos";
		
		System.out.printf("%d e %d %s", a, b,  resultado);
		sc.close();

	}

}
