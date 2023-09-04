package aula37;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = 0;
		
		System.out.println("nome, numero da conta e saldo");
		
		ContaPoupanca contaPoupanca = new ContaPoupanca(scan.next(), scan.nextInt(), scan.nextDouble());
		
		while (a == 0) {
			String controle;
			System.out.println("\n\n*************** CONTA POUPANÇA *******************");
			System.out.println("sacar, depositar, rendimento, saldo, dados ou encerrar");
			controle = scan.next();
			
			if(controle.equals("sacar") == true) {
				contaPoupanca.sacar(scan.nextDouble());
			}
			else if(controle.equals("depositar") == true) {
				contaPoupanca.depositar(scan.nextDouble());
			}
			else if(controle.equals("rendimento")) {
				contaPoupanca.calcularNovoSaldo();
				
			}
			else if(controle.equals("saldo") == true) {
				System.out.println(contaPoupanca.getSaldo());
			}
			else if(controle.equals("dados") == true) {
				System.out.println(contaPoupanca.toString());
			}
			else if(controle.equals("encerrar") == true ) {
				a = 1;
			}
		}
		
		System.out.println("limite?");
		ContaEspecial contaEspecial = new ContaEspecial(contaPoupanca.getNomeCliente(), contaPoupanca.getNumConta(), contaPoupanca.getSaldo(), scan.nextDouble());
		
		while (a == 1) {
			
			System.out.println("\n\n*************** CONTA ESPECIAL *******************");
			System.out.println("sacar, depositar, saldo, dados ou encerrar");
			
			String controle = scan.next();
			
			if(controle.equals("sacar")) {
				contaEspecial.sacar(scan.nextDouble());
			}
			else if(controle.equals("depositar")) {
				contaEspecial.depositar(scan.nextDouble());
			}
			else if(controle.equals("saldo")) {
				contaEspecial.getSaldo();
			}
			else if(controle.equals("dados")) {
				System.out.println(contaEspecial.toString());
			}
			else if(controle.equals("encerrar")) {
				a = 0;
			}	
		}
	}
}