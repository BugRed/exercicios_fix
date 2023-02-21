package exercicio_fix;
import java.util.Scanner;
public class intervalo_for {

	public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Digite quantos números você quer checar:");
			int quant = sc.nextInt();
			int in = 0;
			int out = 0;
			
			
			for (int i = 0; i < quant; i++) {
				System.out.println("Digite os números:");
				int number = sc.nextInt();
				if (number >= 10 && number <= 20) {
					in = in + 1;
				}
				else {
					out = out + 1;
				}
			}
			System.out.println(in + " in");
			System.out.println(out + " out");
			sc.close();

	}

}
