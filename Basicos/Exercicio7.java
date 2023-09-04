package projetao;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("lado?");
		double lado = scan.nextInt();
		
		double resultado = Math.pow(lado, 2);
		
		System.out.println("resultado = " + resultado * 2);
		

	}

}
