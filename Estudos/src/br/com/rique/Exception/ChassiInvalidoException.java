package br.com.rique.Exception;

public class ChassiInvalidoException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 771299654048428920L;

	public ChassiInvalidoException(String chassi) {
		super(String.format("Este chassi %s não é válido", chassi));
	}

}
