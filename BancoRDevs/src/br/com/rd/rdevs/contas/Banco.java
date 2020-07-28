package br.com.rd.rdevs.contas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Banco {
	List<ContaBancaria> contas;
	Map<String, ContaBancaria> contasMapeadas;
	
	public Banco() {
		contas = new ArrayList<ContaBancaria>();
		contasMapeadas = new HashMap();
	}
	
	public void adicionar(ContaBancaria contaBancaria) {
		this.contas.add(contaBancaria);
		this.contasMapeadas.put(contaBancaria.getTitular(), contaBancaria);
	}
	
	public ContaBancaria pega(int index) {
		return this.contas.get(index);
	}
	
	public int pegaQtdeDeContas() {
		return this.contas.size();
	}
	
	public ContaBancaria buscaPorTitular(String nome) {
		return this.contasMapeadas.get(nome);
	}
}
