package br.com.rique.tw;

import br.com.rique.Exception.ChassiInvalidoException;
import br.com.rique.interfaces.VeiculoInterface;

public abstract class Veiculo implements VeiculoInterface {

	private String nome;
	private String marca;
	private String chassi;
	protected int quantidadeRodas;
	private float quantidadeCombustivel;
	private boolean ligado;
	protected int velocidade;

	public Veiculo() {
		this.ligado = false;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) throws Exception {
		if (chassi.length() == 5) {
			this.chassi = chassi;
		} else {
			throw new ChassiInvalidoException(chassi);
		}
	}

	public int getQuantidadeRodas() {
		return quantidadeRodas;
	}

	public void abastecer(float litros) {
		if (!this.ligado) {
			quantidadeCombustivel += litros;
		} else {
			System.out.println("Opa, desligue o veículo");
		}
	}

	public float getQuantidadeCombustivel() {
		return quantidadeCombustivel;
	}

	public void setQuantidadeCombustivel(float quantidadeCombustivel) {
		this.quantidadeCombustivel = quantidadeCombustivel;
	}
	
	
	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public boolean isLigado() {
		return ligado;
	}

	public void ligar() {
		this.ligado = true;
		System.out.println("O veículo ligou!");

	}

	public void desligar() {
		this.ligado = false;
		System.out.println("O veículo desligou!");

	}
	
	public void acelerar() {
		if(this.ligado) {
			this.velocidade += 10;
		} else {
			System.out.println("O veículo está desligado");
		}
	}
	
	public abstract void preparar();
}
