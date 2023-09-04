package projetao;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("temperatura em F");
		double fah = scan.nextDouble();
		
		double cel = (5 * (fah - 32) / 9);
		
		System.out.println("celsius :" + cel);
		

	}

}
