package exercicio_fix;
import java.util.Scanner;
public class crescente_decrescente {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número:");
		int a = sc.nextInt();
		sc.nextLine();
		System.out.println("Digite o segundo número");
		int b = sc.nextInt();
		sc.nextLine();
		while (a != b) {
			String cras = (a < b) ? "Ordem Crescente" : "Ordem Decrescente";
			System.out.println(cras);
			System.out.println("Digite o primeiro número:");
			a = sc.nextInt();
			sc.nextLine();
			System.out.println("Digite o segundo número");
			b = sc.nextInt();
			sc.nextLine();
			
		}
		System.out.println("Os números são iguais");
		sc.close();
	}

}
