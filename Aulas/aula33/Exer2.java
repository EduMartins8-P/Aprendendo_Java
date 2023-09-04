package aula33;

import java.util.Scanner;

public class Exer2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		ContaBancaria edu = new ContaBancaria();
		int a = 0;
		
		System.out.println("vai possuir cheque especial?");
		edu.setEspecial(scan.nextBoolean());
		
		if(edu.getEspecial() == true) {
			System.out.println("digite o limite");
			edu.setLimite(scan.nextDouble());
		}
		
		System.out.println("numero da conta");
		edu.setNumero(scan.nextInt());
		
		System.out.println("saldo atual da conta");
		edu.setSaldo(scan.nextDouble());
		
		while(a == 0) {
			System.out.println("deseja sacar, depositar, consultar cheque, consultar saldo ou encerrar?");
			String controle = scan.next();
			
			if(controle.equals("sacar") == true) {
				System.out.println("qual valor?");
				edu.sacar(scan.nextDouble());
			}
			if(controle.equals("depositar") == true) {
				System.out.println("qual valor?");
					edu.depositar(scan.nextDouble());
			}
			if(controle.equals("cheque") == true) {
				edu.consultarCheque();
			}
			if(controle.equals("saldo") == true) {
				edu.consultarSaldo();
			}
			if(controle.equals("encerrar")) {
				a = 1;
			}
			
			
			
		}
		

		
		
		
		
		
		
		
		
		
		
		
	}

}
