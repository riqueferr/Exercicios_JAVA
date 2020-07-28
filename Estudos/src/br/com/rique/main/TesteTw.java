package br.com.rique.main;

import br.com.rique.tw.Carro;
import br.com.rique.tw.Moto;
import br.com.rique.tw.Veiculo;

public class TesteTw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Veiculo veiculo = new Carro();
		
		try {
			veiculo.setNome("Gol Bolinha");
		
		
			veiculo.abastecer(10);
			System.out.println(veiculo.getQuantidadeCombustivel());
			veiculo.abastecer(35);
			System.out.println(veiculo.getQuantidadeCombustivel());
			
			//VALIDACAO THROW - EXCEPTION
			veiculo.setChassi("ABCDE");
			} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
			}
			System.out.println(veiculo.getChassi());
		
		
		Carro carro = new Carro();
		carro.setNome("Relampago Marquinhos");
		System.out.println(carro.getQuantidadeRodas());
		System.out.println(String.format("O carro %s está ligado? %b", carro.getNome(), carro.isLigado()));
		carro.ligar();
		System.out.println(String.format("Pronto, agora o carro %s está ligado...", carro.getNome()));
		
		
		
		Moto moto = new Moto();
		System.out.println(moto.getQuantidadeRodas());;
		
		
		
		
		
	}
}
