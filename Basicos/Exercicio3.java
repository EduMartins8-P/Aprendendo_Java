package projetao;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("digite as 4 notas");
			
		double nota1 = scan.nextDouble();
		double nota2 = scan.nextDouble();
		double nota3 = scan.nextDouble();
		double nota4 = scan.nextDouble();
		
		double nota5 = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.println("a media eh " + nota5);

	}

}
