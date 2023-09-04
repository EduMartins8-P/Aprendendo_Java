package aula34;

import java.util.Scanner;

public class Exer3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = 0, numero = 0;
		double parte1, parte2;
		String controle;
		
		while(a == 0) {
			controle = scan.next();
			
			if(controle.equals("soma") == true) {
				parte1 = scan.nextDouble();
				parte2 = scan.nextDouble();
				System.out.println(Calculadora.soma(parte1, parte2));
			}
			if(controle.equals("subtracao") == true) {
				parte1 = scan.nextDouble();
				parte2 = scan.nextDouble();
				System.out.println(Calculadora.subtrair(parte1, parte2));
			}
			if(controle.equals("multiplicar") == true) {
				parte1 = scan.nextDouble();
				parte2 = scan.nextDouble();
				System.out.println(Calculadora.multiplicar(parte1, parte2));
			}
			if(controle.equals("dividir") == true) {
				parte1 = scan.nextDouble();
				parte2 = scan.nextDouble();
				System.out.println(Calculadora.dividir(parte1, parte2));
			}
			if(controle.equals("potencia") == true) {
				parte1 = scan.nextDouble();
				parte2 = scan.nextDouble();
				System.out.println(Calculadora.potencia(parte1, parte2));
			}
			if(controle.equals("fatorial") == true) {
				numero = scan.nextInt();
				System.out.println(CalculadoraFatorial.fatorial(numero));
			}
			if(controle.equals("encerrar") == true) {
				a = 1;
			}
		}
	}
}