package br.com.rd.rdevs.exercleo;

public class Inverter {

	String frase;

	public Inverter() {

	}

	public String getFrase() {
		return frase;
	}

	public void setFrase(String frase) {
		this.frase = frase;
	}

	// INVERTE NA MESMA LINHA
	public String inverter(String frase) {

		String resultado = "";
		for (int i = (frase.length() - 1); i >= 0; i--) {
			resultado += frase.charAt(i);
		}
		return resultado;
	}

	// PULA LINHA INVERTENDO
	public String inverterPulandoLinha(String frase) {

		String resultado = "";
		for (int i = (frase.length() - 1); i >= 0; i--) {
			resultado += (frase.charAt(i) + "\n");
		}
		return resultado;
	}

	// PULANDO LINHA NORMAL
	public String pulandoLinha(String frase) {
		String resultado = "";
		for (int i = 0; i <= (frase.length() - 1); i++) {
			resultado += (frase.charAt(i) + "\n");
		}
		return resultado;
	}

}
