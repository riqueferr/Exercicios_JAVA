package rd.com.rd.rdevs.main;

import java.util.HashMap;
import java.util.Map;

import br.com.rd.rdevs.contas.ContaBancaria;
import br.com.rd.rdevs.contas.ContaCorrente;

public class TestaConta {

	public static void main(String[] args) {
		ContaBancaria c1 = new ContaCorrente();
		c1.depositar(10000);
		ContaBancaria c2 = new ContaCorrente();
		c2.depositar(3000);

		Map<String, ContaCorrente> mapaDeContas = new HashMap();
		mapaDeContas.put("diretor", (ContaCorrente) c1);
		mapaDeContas.put("gerente", (ContaCorrente) c2);
		ContaBancaria contaDoDiretor = (ContaBancaria) mapaDeContas.get("diretor");
		System.out.println(contaDoDiretor.getSaldo());
		
		//ADD TYPES A ARGUMENTS TO 'MAP'
	}

}
