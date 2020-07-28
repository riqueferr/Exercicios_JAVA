package rd.com.rd.rdevs.main;

import br.com.rd.rdevs.contas.ContaCorrente;
import rd.com.rd.rdevs.model.SeguroDeVida;

public class TestaSeguroDeVida {

	public static void main(String[] args) {
		SeguroDeVida x = new SeguroDeVida(4321, "Henrique", 543);
		
		x.recuperaDados();
		x.getValorImposto();
		//System.out.println(x.getValorImposto());
		//System.out.println(x.getValor());
		double y = x.getValorImposto() + x.getValor();
		System.out.println(String.format("O valor total é de R$%s.", y));

	}

}
