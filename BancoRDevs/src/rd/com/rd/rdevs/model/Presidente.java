package rd.com.rd.rdevs.model;

public class Presidente extends Diretor {

    public Presidente(String nome, String cpf, double salario) {
		super(nome, cpf, salario);
		// TODO Auto-generated constructor stub
	}

	@Override 
    public double getBonificacao() {
    	return this.getSalario() * 1.1;
    }
}
