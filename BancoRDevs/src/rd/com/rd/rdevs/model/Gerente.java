package rd.com.rd.rdevs.model;

public class Gerente extends Funcionario {

    public Gerente(String nome, String cpf, double salario) {
		super(nome, cpf, salario);
		// TODO Auto-generated constructor stub
	}

	private int numeroDeFuncionariosGerenciados;
    private int senha;

	/*
	 * void gerenciarFuncionarios(){
	 * 
	 * }
	 */
    
    @Override 
    public double getBonificacao() {
    	return this.getSalario() * 1.15;
    }
    
    public boolean autentica(int senha) {
        if (this.senha == senha) {
            System.out.println("Permitido!");
            return true;
        }else{
            System.out.println("Negado!");
            return false;
        }
    }
    
    public int setNumeroDeFuncionariosGerenciados(int numeroDeFuncionariosGerenciados) {
    	return this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;
    }
}

