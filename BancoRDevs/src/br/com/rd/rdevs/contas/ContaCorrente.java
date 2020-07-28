package br.com.rd.rdevs.contas;

import rd.com.rd.rdevs.model.Tributavel;

public class ContaCorrente extends ContaBancaria implements Tributavel {
	
	private String tipoConta = "Corrente";
	private double saldo;

	
	public ContaCorrente() {
		
	}
	
	public ContaCorrente(int numero, int agencia, String titular, double saldo, double limite, String dtAbertura,
			int identificador, String tipoConta) {
		super(numero, agencia, titular, saldo, limite, dtAbertura, identificador, tipoConta);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getTipoConta() {
		return tipoConta;
	}

	/*
	 * @Override public double getValorImposto() { return this.getSaldo() * }
	 */
	
	boolean sacar(double valorSacado){
        double rendimento = 0.1;
        if(this.getSaldo() < valorSacado && valorSacado < 0){
        //	throw new IllegalArgumentException();
        	throw new SaldoInsuficienteException("Saldo Insuficiente, " + "tente um valor menor");
		}else{	
            this.saldo = this.getSaldo() - valorSacado;
            this.saldo *= rendimento;
			if(this.tipoConta == "Corrente") {
				this.saldo = getSaldo() - 0.10;
			}
			return true;
		}

	}

	@Override
	public double getValorImposto() {
		
		return getSaldo() * 0.01;
	}
}

