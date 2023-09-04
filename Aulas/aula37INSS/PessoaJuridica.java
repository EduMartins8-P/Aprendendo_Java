package aula37INSS;

public class PessoaJuridica extends Contribuinte {
	private String cpnj;
	
	public PessoaJuridica(String cpnj) {
		this.cpnj = cpnj;
	}
	public String getCpnj() {
		return cpnj;
	}
	public void setCpnj(String cpnj) {
		this.cpnj = cpnj;
	}
	
	public double calcularImposto() {
		return getRenda() / 10;
	}
	
	@Override
	public String toString() {
		return super.toString() + " " + cpnj; 
	}
}