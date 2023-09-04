package projetao;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("quantos metros?");
		
		double metros = scan.nextDouble();
		
		double centimetros = metros * 100;
		
		System.out.println(centimetros + " centimetros");

	}

}
