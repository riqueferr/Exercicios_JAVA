package br.com.rd.rdevs.exercleo;

import java.util.ArrayList;

public class Converter {

	public Converter() {

	}

	private String palavra;

	public String getPalavra() {
		return palavra;
	}

	public void setPalavra(String palavra) {
		this.palavra = palavra;
	}

	
	
	public int alterar(String palavra) {
		int num = Integer.parseInt(palavra);
		return num;

	}

	public int alterarSemBiblioteca(String palavra) {
		int r = 0;

		while (palavra.length() > 0) {
			char a = palavra.charAt(0);
			r = r * 10 + (a - '0');
			palavra = palavra.substring(1);
		}
		return r;
	}
	
	/*
	 * public int[] xxx(String palavra) { int[] a = new int [palavra.length()];
	 * //ArrayList<String> s = new ArrayList()<String>; int b = 0; for (int i =
	 * palavra.length(); i > 0; i--) { b += palavra.charAt(i); //a.add(b); } return
	 * a;
	 * 
	 * }
	 */

}
