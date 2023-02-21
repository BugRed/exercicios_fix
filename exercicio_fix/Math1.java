package exercicio_fix;
import java.util.Locale;
import java.util.Scanner;

public class Math1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Digite a largura do terreno:");
		double large = sc.nextDouble();
		sc.nextLine();
		System.out.println("Digite a altura do terreno:");
		double height = sc.nextDouble();
		sc.nextLine();
		System.out.println("Digite o preço do metro do terreno:");
		double priceM = sc.nextDouble();
		
		double area = large*height;
		double totalPrice = area*priceM;
		System.out.printf("A Area do terreno é %.2f e o preço por metro é %.2f!%n", area, totalPrice);
		
		
		
		
		
		
		sc.close();
	

	}

}
