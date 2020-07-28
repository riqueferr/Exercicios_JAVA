package rd.com.rd.rdevs.model;

public abstract class Funcionario {

	private String nome;
	private String cpf;
    protected double salario;
	/* private int senha; */
    // private int numeroDeFuncionariosGerenciados;
    
    
/*    public void baterPontoEntrada(){

    }

    public void baterPontoSaida(){
        
    }
*/    
    
    
    public abstract double getBonificacao();


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}


	public Funcionario(String nome, String cpf, double salario) {
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
	}
    
	
    
}
