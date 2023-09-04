package projetao;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("temperatura em Cel?");
		double cel = scan.nextDouble();
		
		double fah = cel * 1.8 + 32;
		
		System.out.println("fah: " + fah);
		

	}

}
