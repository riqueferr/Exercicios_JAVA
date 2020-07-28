package rd.com.rd.rdevs.main;
import rd.com.rd.rdevs.model.ContaBancaria;
import rd.com.rd.rdevs.model.ContaCorrente;
public class TestaArrays {

	public static void main(String[] args) {
		
		ContaBancaria[] contas = new ContaBancaria[10];
		
		for (int i = 0; i < contas.length; i++) {
			contas[i] = new ContaCorrente();
			contas[i].depositar(i * 100);
			System.out.println(i);
		}

	}

}
