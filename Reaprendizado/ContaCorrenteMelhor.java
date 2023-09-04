package reaprendendo;
import java.util.Scanner;

public class ContaCorrenteMelhor {
	
	Scanner scan = new Scanner(System.in);
	
	private int numero;
	private double saldo;
	private boolean especial;
	private double limite;
	private String nome;
	
	public ContaCorrenteMelhor(int numero, double saldo, boolean especial, double limite, String nome) {
		this.numero = numero;
		this.saldo = saldo;
		this.especial = especial;
		this.limite = limite;
		this.nome = nome;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public boolean isEspecial() {
		return especial;
	}
	public void setEspecial(boolean especial) {
		this.especial = especial;
	}
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void sacar(double valor) {
		if(saldo >= valor) {
			saldo -= valor;
			System.out.println("saque realizado, novo saldo: " + saldo);
		}
		else
		{
			System.out.println("saldo insuficiente");
			if(especial == true){
				System.out.println("deseja utilizar credito?");
				String controle = scan.next();
				
				if(controle.equals("sim") == true) {
					if(valor - saldo > limite) {
						System.out.println("limite insuficiente");
					}
					else {
						valor -= saldo;
						saldo = 0;
						limite -= valor;
						
						System.out.println("novo limite: " + limite);
					}
			
				}
			}
		}
	}
	public void depositar(double valor) {
		saldo += valor;
		System.out.println("novo saldo: " + saldo);
	}
	public void consultarSaldo() {
		System.out.println("seu saldo é: " + saldo);
	}
	public void especial() {
		if(especial == true) {
			System.out.println("possui");
		}
		else
			System.out.println("nao possui");
	}
	
}