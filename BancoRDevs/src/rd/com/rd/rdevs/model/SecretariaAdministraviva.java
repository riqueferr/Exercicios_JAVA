package rd.com.rd.rdevs.model;

public class SecretariaAdministraviva extends Secretaria{

	public SecretariaAdministraviva(String nome, String cpf, double salario) {
		super(nome, cpf, salario);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getBonificacao() {
		// TODO Auto-generated method stub
		return 0;
	}

}
