package rd.com.rd.rdevs.model;

public class SeguroDeVida implements Tributavel{
	private int numeroApolice;
	private String titular;
	private double valor;
	
	

	public int getNumeroApolice() {
		return numeroApolice;
	}

	public void setNumeroApolice(int numeroApolice) {
		this.numeroApolice = numeroApolice;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public SeguroDeVida(int numeroApolice, String titular, double valor) {
		this.numeroApolice = numeroApolice;
		this.titular = titular;
		this.valor = valor;
	}

	@Override
	public double getValorImposto() {
		return 42 + (this.valor * 0.02);
	}
	
	
	public void recuperaDados() {
		System.out.println(String.format("Nº Apolice: %s", this.numeroApolice));
		System.out.println(String.format("Nome Titular: %s", this.titular));
		System.out.println(String.format("Valor: %s", this.valor));
	}
}
