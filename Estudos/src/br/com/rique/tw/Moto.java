package br.com.rique.tw;

public class Moto extends Veiculo {
	
	public Moto() {
		this.quantidadeRodas = 2;
	}
	
	@Override
	public void acelerar() {
		if(this.isLigado()) {
			this.velocidade += 3;
		} else {
			System.out.println("O veículo está desligado");
		}
	}

	@Override
	public void preparar() {
		System.out.println("Colocar o capacete.");
		
	}

}
