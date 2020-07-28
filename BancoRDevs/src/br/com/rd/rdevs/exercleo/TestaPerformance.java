package br.com.rd.rdevs.exercleo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TestaPerformance {

	public static void main(String[] args) {
		System.out.println("Iniciando...");
		Collection<Integer> teste = new ArrayList<>();
		long inicio = System.currentTimeMillis();
		int total = 30000;
		for (int i = 0; i < total; i++) {
			teste.add(i);
		}
		for (int i = 0; i < total; i++) {
			teste.contains(i);
		}
		long fim = System.currentTimeMillis();
		long tempo = fim - inicio;
		System.out.println("Tempo gasto: " + tempo);

	}

	// 1. ARRAYLIST - 322
	// HASHSET - 9

	// O QUE DEIXA MAIS LENTO É ADICIONAR (ADD).

	// 2.colocando arrayList no começo, em vez de collections demora menos tempo,
	// mas ainda assim demorou 2947 milisegundos;
	// 2.b) quando nos referimos a um grande volume de dados, devemos programar uma
	// interface personalizada para que seja
	// retornado os valores nos quais desejamos na ordem que desejamos.

}
