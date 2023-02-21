package exercicio_fix;
import java.util.Locale;
import java.util.Scanner;
public class produtc_write {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o código do Item:");
		int cod1 = sc.nextInt();
		sc.nextLine();
		System.out.println("Digite a quantidade de Itens:");
		int quant1 = sc.nextInt();
		sc.nextLine();
		System.out.println("Digite o valor da unidade:");
		double price1 = sc.nextDouble();
		sc.nextLine();
		
		
		System.out.println("Digite o código do Item:");
		int cod2 = sc.nextInt();
		sc.nextLine();
		System.out.println("Digite a quantidade de Itens:");
		int quant2 = sc.nextInt();
		sc.nextLine();
		System.out.println("Digite o valor da unidade:");
		double price2 = sc.nextDouble();
		sc.nextLine();
		
	
		double totalPrice = price1*quant1+price2*quant2;
		
		System.out.printf("Valor a pagar: %.2f%n", totalPrice);
	
		sc.close();
		
		
		
	

	}

}
