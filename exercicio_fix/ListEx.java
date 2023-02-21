package exercicio_fix;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListEx {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("Jonny");
		list.add("Nuno");
		list.add("JBob");
		list.add("Javan");
		list.add("Black man");
		list.add("Nara");
		list.add(0, "Tas vendo");

		System.out.println(list.size());

		list.remove("Tas vendo");

		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("---------------");
		list.removeIf(x -> x.charAt(0) == 'J');
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("---------------");
		System.out.println("Index of Nuno: " + list.indexOf("Nuno"));
		
		System.out.println("---------------");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'N').collect(Collectors.toList());
		for (String x : result) {
			System.out.println(x);
		}
		System.out.println("---------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'X').findFirst().orElse(null);
		System.out.println(name);
	}

}
