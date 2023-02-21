package exercicio_fix;
import java.util.Locale;
import java.util.Scanner;
public class funcionario_salary {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu Código de Funcionario:");
		int empNumber = sc.nextInt();
		sc.nextLine();
		System.out.println("Digite suas  horas trabalhadas:");
		int empHour = sc.nextInt();
		sc.nextLine();
		System.out.println("Digite quanto custa sua hora trabalhada:");
		double empSalary = sc.nextDouble();
		
		double totalSalary = empHour*empSalary;
		
		System.out.printf("Number: %d%n", empNumber);
		System.out.printf("Salary: %.2f%n", totalSalary);
	
	sc.close();
		
		

	}

}
