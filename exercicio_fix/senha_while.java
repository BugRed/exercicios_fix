package exercicio_fix;
import java.util.Scanner;
public class senha_while {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Digite a senha:");
		int senha = sc.nextInt();
		sc.nextLine();
		
		while (senha != 2002) {
			System.out.println("Senha incorreta!");
			System.out.println("Digite a senha novamente");
			senha = sc.nextInt();
			
		}
		System.out.println("Acesso permitido!");
		sc.close();
	}

}
