package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List <String> list = new ArrayList<String>();
		
		list.add("Marcia");
		list.add("Pedro");
		list.add("Olívia");
		list.add("Julia");
		list.add("Juliyane");
		list.add("Janete");
		list.add("Paula");
		list.add("Peterson");
		
		
		System.out.println(list);
		System.out.println(list.size());
		
		System.out.println("----------------------");
		
		list.add(1, "Mariana");
		list.remove("Pedro");
		list.remove(2);		
		
		for(String nomesLista: list) {
			System.out.println(nomesLista);
		}
		System.out.println(list.size());
		
		System.out.println("----------------------");
		
		//Removendo todos com a letra J
		list.removeIf(x -> x.charAt(0) == 'J');
		for(String nomesLista: list) {
			System.out.println(nomesLista);
		}
		System.out.println(list.size());
		
		System.out.println("----------------------");
		System.out.println(list.indexOf("Marcia"));
		System.out.println(list.indexOf("Marciaaa"));
		
		System.out.println("----------------------");
		
		// Filtrando a lista, deixando somente pessoas com a letra M
		List<String> somenteComM = list.stream().filter(x -> x.charAt(0) == 'M').collect(Collectors.toList());
		System.out.println(somenteComM);
		System.out.println("----------------------");
		
		//Encontrar um elemento que atenda um predicato 
		String nameComM = list.stream().filter(x -> x.charAt(0) == 'M').findFirst().orElse(null);
		System.out.println(nameComM);
	}

}
