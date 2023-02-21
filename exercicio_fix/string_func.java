package exercicio_fix;

import java.util.Scanner;

public class string_func {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um texto");
		String og = "TeStE TeStE TeStE";
		String s01 = og.toLowerCase();
		String s02 = og.toUpperCase();
		String s03 = og.trim();
		String s04 = og.substring(2);
		String s05 = og.substring(2,9);
		String s06 = og.replace("E", "X");
		String s07 = og.replace("TeStE", "FuNcIoNa");
		int i = og.indexOf("eS");
		int j = og.lastIndexOf("eS");
		String[] vect = og.split(" ");
		
		
		System.out.println("Original: " + og);
		System.out.println("toLowerCase: " + s01);
		System.out.println("toUpperCase: " + s02);
		System.out.println("trim: " + s03);
		System.out.println("substring (2): " + s04);
		System.out.println("substring(2,9): " + s05);
		System.out.println("replace (E, X): " + s06);
		System.out.println("replace(Teste, Funciona): " + s07);
		System.out.println("Index of: " + i);
		System.out.println("Last Index of: " + j);
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);
		sc.close();
	}

}
