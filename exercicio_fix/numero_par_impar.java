package exercicio_fix;
import java.util.Scanner;

public class numero_par_impar {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		int a = sc.nextInt();
		
		if (a % 2 == 0) {
			System.out.println("Número par");
		}
		else {
			System.out.println("Numero impar");
		}
		sc.close();
	}

}
