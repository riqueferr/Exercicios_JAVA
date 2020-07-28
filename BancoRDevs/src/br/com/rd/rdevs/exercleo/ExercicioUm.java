package br.com.rd.rdevs.exercleo;

public class ExercicioUm {
	public void localizarPalavra(String frase, String localizar) {
		if (frase.toLowerCase().contains(localizar.toLowerCase()) == true) {
			System.out.println("A palavra " + localizar + " existe na frase informada.");
		} else {
			System.out.println("A palavra NÃO existe na frase informada.");
		}
	}

	public void mudarEspacoBranco(String frase, String valorMudar) {
		System.out.println("Resultado: " + frase.replace("", valorMudar));

	}

	public void procurarVazio(String frase) {
		if (frase.isEmpty()) {
			System.out.println("Está vazio!");
		} else {
			System.out.println("Existe algo!");
		}
	}

	public void contaCaracter(String frase) {
		System.out.println("Tamanho: " + frase.length());
	}
}
