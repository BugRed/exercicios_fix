package exercicio_fix;
import java.util.Locale;
import java.util.Scanner;


public class product_value {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite três números:");
		
		double a = sc.nextDouble();
		sc.nextLine();
		double b = sc.nextDouble();
		sc.nextLine();
		double c = sc.nextDouble();
		
		double trivalue = a*c/2;
		double cirvalue =  3.14159*Math.pow(c,2.0);
		double trapvalue = (a+b)*c/2;
		double quadvalue = Math.pow(b,2.0);
		double retvalue = a*b;
		
		System.out.println("Os resultados são:");
		System.out.printf("Triangulo: %.3f%n", trivalue);
		System.out.printf("Círculo: %.3f%n", cirvalue);
		System.out.printf("Trapézio: %.3f%n", trapvalue);
		System.out.printf("Quadrado: %.3f%n", quadvalue);
		System.out.printf("Retângulo: %.3f%n", retvalue);
		
		
		
		
		
		
		
		sc.close();

	}

}