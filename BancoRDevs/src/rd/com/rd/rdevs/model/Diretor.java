package rd.com.rd.rdevs.model;

public class Diretor extends Gerente {

    public Diretor(String nome, String cpf, double salario) {
		super(nome, cpf, salario);
		// TODO Auto-generated constructor stub
	}

	@Override 
    public double getBonificacao() {
    	return this.getSalario() * 1.1;
    }
}
