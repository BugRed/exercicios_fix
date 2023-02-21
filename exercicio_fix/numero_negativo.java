package exercicio_fix;
import java.util.Scanner;
public class numero_negativo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número");
		int a = sc.nextInt();
		if (a <0) {
			System.out.println("Número negativo");
		}
		else {
			System.out.println("Número positivo");
		}
		sc.close();
		
	}

}
