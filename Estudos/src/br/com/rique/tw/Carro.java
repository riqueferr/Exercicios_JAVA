package br.com.rique.tw;

public class Carro extends Veiculo {
	
	private int quantidadePortas;
	
	public Carro() {
		this.quantidadeRodas = 4;
	}

	public int getQuantidadePortas() {
		return quantidadePortas;
	}

	public void setQuantidadePortas(int quantidadePortas) {
		this.quantidadePortas = quantidadePortas;
	}

	@Override
	public void preparar() {
		System.out.println("Colocar o cinto.");
		
	}

	
	

}
