package aula33;

import java.util.Scanner;

public class Exer1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = 0;
		String estado;
		String controle;
		Lampada lampada = new Lampada();
		
		
		while(a == 0) {
			estado = scan.next();
			
			if(estado.equals("controlar") == true) {
				controle = scan.next();
				lampada.controlarLampada(controle);
			}
			else if(estado.equals("checar") == true) {
				lampada.checarLampada();
			}
			else if(estado.equals("encerrar") == true) {
				a = 1;
			}
			else {
				System.out.println("comando invalido seu demente");
			}
		}
	}	
}