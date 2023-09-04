package aula37;

public class ContaBancaria {
	private String nomeCliente;
	private int numConta;
	private double saldo;
	
	
	
	public ContaBancaria(String nomeCliente, int numConta, double saldo) {
		this.nomeCliente = nomeCliente;
		this.numConta = numConta;
		this.saldo = saldo;
	}
	
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public int getNumConta() {
		return numConta;
	}
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	@Override
	public String toString() {
		return "ContaBancaria [nomeCliente = " + nomeCliente + ", numConta = " + numConta + ", saldo = " + saldo + "]";
	}

	public void sacar(double valor) {
		
		if(valor > saldo) {
			System.out.println("saldo insuficiente");
		}
		else {
			saldo -= valor;
			System.out.println("saque realizado, novo saldo: " + saldo);
		}
	}
	
	public void depositar(double valor) {
		saldo += valor;
		System.out.println("novo saldo: " + saldo);
	}
}