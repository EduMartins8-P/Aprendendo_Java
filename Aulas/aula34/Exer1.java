package aula34;

import java.util.Scanner;

public class Exer1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = 0;
		String controle;
		
		while(a == 0) {
			controle = scan.next();
			
			if(controle.equals("zerar") == true) {
				Contador.zerarContador();
			}
			
			if(controle.equals("incrementar") == true) {
				Contador.incrementarContador();
			}
			if(controle.equals("retornar") == true) {
				Contador.retornarContador();
			}
			if(controle.equals("encerrar") == true) {
				a = 1;
			}	
		}
	}
}
