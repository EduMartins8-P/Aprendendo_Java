package aula37INSS;

public class Contribuinte {
	
	private String nome;
	private double renda;
	
	public double getRenda() {
		return renda;
	}
	public void setRenda(double renda) {
		this.renda = renda;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Override
	public String toString() {
		return "Contribuinte [nome=" + nome + ", renda=" + renda + "]";
	}
	
	
}