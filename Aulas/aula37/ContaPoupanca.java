package aula37;

public class ContaPoupanca extends ContaBancaria{

	private double RENDIMENTO = 0.05;
	
	public ContaPoupanca(String nomeCliente, int numConta, double saldo) {
		super(nomeCliente, numConta, saldo);
	}

	@Override
	public String toString() {
		return "\n\nContaPoupança [RENDIMENTO = " + RENDIMENTO + "]\n" + super.toString();
	}

	public double getRENDIMENTO() {
		return RENDIMENTO;
	}
	public void setRENDIMENTO(double rENDIMENTO) {
		RENDIMENTO = rENDIMENTO;
	}

	public void calcularNovoSaldo() {
		setSaldo((getSaldo() * RENDIMENTO) + getSaldo()); 
		
		System.out.println("novo saldo: " + getSaldo());
	}
	
}