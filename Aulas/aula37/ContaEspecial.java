package aula37;
import java.util.Scanner;

public class ContaEspecial extends ContaBancaria{
	private double limite;
	
	Scanner scan = new Scanner(System.in);

	public ContaEspecial(String nomeCliente, int numConta, double saldo, double limite) {
		super(nomeCliente, numConta, saldo);
		this.limite = limite;
	}
	
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}	
	
	public void sacar(double valor) {
		
		if(valor > getSaldo()) {
			System.out.println("saldo insuficiente, deseja usar credito?");
			String controle = scan.next();
			
			if(controle.equals("sim")) {
				valor -= getSaldo();
				setSaldo(0);
				limite -= valor;
				System.out.println("saldo zerado, novo limite : " + limite);
			}
			else {
				System.out.println("saque nao efetuado");
			}
		}
		else {
			super.sacar(valor);
		}
	}

	@Override
	public String toString() {
		return "\n\nContaEspecial [limite=" + limite+ "]" + "\n" + super.toString();
	}
	
	public void depositar(double valor) {
		System.out.println("no limite ou no saldo?");
		String controle = scan.next();
		
		if(controle.equals("limite")) {
			limite += valor;
			System.out.println("novo limite : " + limite + " || saldo atual : " + getSaldo());
		}
		else {
			super.depositar(valor);
			System.out.println("limite atual : " + limite);
		}
	}
	
}