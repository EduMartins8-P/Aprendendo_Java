package aula33;

import java.util.Scanner;

public class ContaBancaria {
	
	Scanner scan = new Scanner(System.in);
	
	
	private int numero;
	private double saldo;
	private boolean especial;
	private double limite;
	
	
	//gets e sets
	
	public int getNumero() {
		return this.numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public double getSaldo() {
		return this.saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public boolean getEspecial() {
		return this.especial;
	}
	public void setEspecial(boolean especial) {
		this.especial = especial;
	}
	public double getLimite() {
		return this.limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	//metodos
	
	public void sacar(double valor) {
		if(valor > saldo) {
			System.out.println("saldo insuficiente, deseja utilizar cheque especial?");
			String questao = scan.next();
			if(questao.equals("sim") ==  true) {
				if(limite < valor - saldo) {
					System.out.println("vai da nao, ta pobre");
				}
				else {
					valor -= saldo;
					saldo = 0;
					limite -= valor;
					System.out.println("saque realizado, limite atual : " + limite);
				}
			}
		}
		else {
			saldo -= valor;
			System.out.println("saque realizado, saldo atual : " + saldo);
		}
	}
	public void depositar(double valor) {
		saldo += valor;
		System.out.println("deposito realizado, saldo atual : " + saldo);
	}
	public void consultarCheque() {
		if(especial == true) {
			System.out.println("possui cheque especial, o credito atual eh : " + limite);
		}
		else {
			System.out.println("nao possui cheque especial");
		}
	}
	public void consultarSaldo() {
		System.out.println("seu saldo eh de :" +  saldo);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
