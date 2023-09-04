package projetao;

import java.util.Scanner;

public class Aula27exer2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ContaCorrente eduardo = new ContaCorrente();
		
		int a = 0;
		double valor;
		String comando;
		
		while(a == 0) {
			comando = scan.next();
			
			if(comando.equals("sacar")) {
				valor = scan.nextDouble();
				eduardo.saque(valor);
			}
			if(comando.equals("depositar")) {
				valor = scan.nextDouble();
				eduardo.depositar(valor);
			}
			if(comando.equals("saldo")) {
				eduardo.consultar();
			}
			if(comando.equals("cheque")) {
				eduardo.usandoCheque();
			}
			if(comando.equals("encerrar")) {
				a = 1;
			}
	
		}

	}

}
