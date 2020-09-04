package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>(); 	//não aceita variaveis primitivas, só wrapper classes
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Ana");
		
		for (String x : list) {
			System.out.println(list.indexOf(x) + " - " + x);
		}
		
		list.add(2, "Marcos");

		traco();
		
		for (String x : list) {
			System.out.println(x);
		}
		
		traco();
		System.out.println("Total de itens na Lista: " + list.size());
		traco();
		
		System.out.println();
		System.out.println("Removendo da Lista");
		//para remover pode-se usar o nome ou a posição na lista:
		// para remover da posição: list.remove(1);
		list.remove("Ana");
		
		traco();
		
		for (String x : list) {
			System.out.println(list.indexOf(x) + " - " + x);
		}
		
		list.add(4, "Ana");
		
		traco();
		
		for (String x : list) {
			System.out.println(list.indexOf(x) + " - " + x);
		}
		
		traco();
		
		
		// x -> x.charAt(0) == 'M' *** ISSO É UMA FUNÇÃO LAMBDA
		// Vai remover por predicado, ou seja todos os itens da Lista que começarem com M
		// x é o apelido do tipo String! Remove todo String X tal que X comece com a letra M
		
		list.removeIf(x -> x.charAt(0) == 'M');
		
		for (String x : list) {
			System.out.println(list.indexOf(x) + " - " + x);
		}
		
		//list.add(0, "Maria");
		//list.add(2, "Marcos");
		traco();
		
		//Encontrando o índice, numero, de um elemento
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		System.out.println("Index of Marco: " + list.indexOf("Marco"));
		// Quando não encontrado, retorna o numero negativo -1
		
				
		//Criando uma lista com um filtro, vai criar uma nova lista contendo apenas os valores da lista LIST
		// que iniciam com a letra 'A'
		// Esta Sintaxe só funciona da versão 8 do Java para frente
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
	
		traco();
		
		for (String x : result) {
			System.out.println(list.indexOf(x) + " - " + x);
		}
		
		traco();
		// Fazendo uma pesquisa na Lista para encontrar o primeiro elemento que comece com a letra A
		
		String nome = list.stream().filter(x -> x.charAt(0) =='J').findFirst().orElse("NÃO ENCONTRADO");
		System.out.println(nome);
	}

	
	
	public static void traco() {
		for (int i=0; i<100; i++) {
			System.out.print("-");
		}
		System.out.println();
	}
	
}


