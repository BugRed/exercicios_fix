package exercicio_fix;
import java.util.Scanner;
public class horario_jogo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a hora inicial do jogo");
		int a = sc.nextInt();
		sc.nextLine();
		System.out.println("Digite a hora final do jogo");
		int b = sc.nextInt();
		sc.nextLine();
		
		if (a + b <= 24) {
			int horaFinal = a + b;
			System.out.println("O Jogo durou " + horaFinal + " Hora(s)");
		}
		else {
			System.out.println("Favor digite novamente");
		}
		sc.close();

	}

}
