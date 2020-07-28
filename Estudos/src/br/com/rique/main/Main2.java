package br.com.rique.main;

import java.util.ArrayList;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// WHILE
		ArrayList<String> historico = new ArrayList<String>();
		int numeros = 0;

		while (numeros <= 10) {

			String entrada = String.format("%d", numeros);
			historico.add(entrada);
			numeros += 1;
		}

		// FOR

		System.out.println(historico.size());

		System.out.println("Inicio do FOR");

		/*
		 * for (int i = historico.size(); i >= 0; i--) { System.out.println((i)); }
		 */

		for (int i = 0; i < historico.size(); i++) {
			String x;
			int xx;
			System.out.println(historico.get(i));
			x = historico.get(i);
			xx = Integer.parseInt(x);

			System.out.println(xx + 3);
		}	
		
		
	}

}
