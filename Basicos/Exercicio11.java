package projetao;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("primeiro inteiro?");
		int inteiro1 = scan.nextInt();
		
		System.out.println("segundo inteiro?");
		int inteiro2 = scan.nextInt();
		
		System.out.println("numero real?");
		double real = scan.nextDouble();
		
		int result1 = inteiro1 * 2 * inteiro2 / 2;
		double result2 = inteiro1 * 3 + real;
		double result3 = Math.pow(real, 3);
		
		System.out.println("resultado 1 = " + result1 + "\nresultado 2 = " + result2 + "\nresultado 3 = " + result3);

	}

}
