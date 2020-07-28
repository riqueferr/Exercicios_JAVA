package br.com.rd.rdevs.contas;

public class ContaPoupanca extends ContaBancaria {
	
	private String tipoConta;

	public ContaPoupanca(int numero, int agencia, String titular, double saldo, double limite, String dtAbertura,
			int identificador, String tipoConta) {
		super(numero, agencia, titular, saldo, limite, dtAbertura, identificador, tipoConta);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getTipoConta() {
		return tipoConta;
	}

}
