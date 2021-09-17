package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marcos");
		
		System.out.println(list.size());
		
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("-------------------------");
		//Remover por posição
		//list.remove(1);
		//Remover todos que começam com a letra 'M'
		//list.removeIf(x -> x.charAt(0) == 'M');
		
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("-------------------------");
		//Procurar por posição na lista
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		System.out.println("Index of Marco: " + list.indexOf("Marco"));
		System.out.println("-------------------------");
		
		//Deixar na lista apenas quem tem o nome começado com a letra desejada
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		
		for (String x : result) {
			System.out.println(x);
		}
		
		System.out.println("-------------------------");
		//Encontrar apenas  o primeiro elemento da lista com a inicial desejada
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);
		
	}

}
