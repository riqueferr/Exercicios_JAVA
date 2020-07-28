package br.com.rd.rdevs.contas;

public abstract class ContaBancaria extends RuntimeException implements Comparable<ContaBancaria> {

	private int numero;
    private int agencia;
	private String titular;
	private double saldo;
    private double limite;
	private String dtAbertura;
	private int identificador;
	private String tipoConta;

	boolean sacar(double valorSacado){
        double rendimento = 0.1;
        if(this.saldo < valorSacado && valorSacado < 0){
        	//throw new IllegalArgumentException();
        	throw new SaldoInsuficienteException("Saldo Insuficiente, " + "tente um valor menor");
		}else{	
            this.saldo = this.saldo - valorSacado;
            this.saldo *= rendimento;
			if(this.tipoConta == "Corrente") {
				this.saldo = saldo - 0.10;
			}
			return true;
		}

	}
	
	public boolean depositar(double valorDepositado){
        if (valorDepositado < 0){
			return false;
		}else{
            this.saldo += valorDepositado;
            double rendimento = 0.1;
			this.saldo *= rendimento ;
			return true;
		}	
	}

	boolean transferir(ContaBancaria destino, double valorTransferido){
		boolean retirou = this.sacar(valorTransferido);
		if (!retirou){
			return false;
		}else{
			destino.depositar(valorTransferido);
			this.saldo = this.saldo - valorTransferido;
			destino.saldo = destino.saldo + valorTransferido;
			return true;
		}


    }
    
    // boolean calcularRendimento() {
    //     double rendimento = 0.1;
    //     this.saldo *= rendimento;
    //     return true;
    // }


    void recuperarDadosParaImpressao() {
        System.out.println("Conta:" + this.numero);
        System.out.println("Agencia: " + this.agencia);
        System.out.println("Titular: " + this.titular);
        System.out.println("Data de Abertura: " + this.dtAbertura);
        System.out.println("Saldo disponível: " + this.saldo);
        System.out.println("Tipo de Conta: " + this.tipoConta);

	}
	

	public String getTitular (){
		return titular;
	}

	public int getNumero(){
		return numero;
	}

	public int getAgencia(){
		return agencia;
	}

	public double getSaldo (){
		return saldo;
	}

	public double getLimite (){
		return limite;
	}

	public void setLimite (double limite){
		this.limite = limite;
	}

	public String getDtAbertura(){
		return dtAbertura;
	}

	public int getIdentificador(){
		return identificador;
	}

	public int setIdentificador(){
		return this.identificador = identificador + 1;
	}

	public String getTipoConta() {
		return tipoConta;
	}

	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}

	public ContaBancaria(int numero, int agencia, String titular, double saldo, double limite, String dtAbertura,
			int identificador, String tipoConta) {
		this.numero = numero;
		this.agencia = agencia;
		this.titular = titular;
		this.saldo = saldo;
		this.limite = limite;
		this.dtAbertura = dtAbertura;
		this.identificador = identificador;
		this.tipoConta = tipoConta;
	}
	
	public ContaBancaria () {
		
	}
	
	
	
	public int compareTo(ContaBancaria x) {
		if (this.saldo < x.saldo) {
			return -1;
		}
		
		if (this.saldo > x.saldo) {
			return 1;
		}
		
		return 0;
		
	}
 	
	
}
