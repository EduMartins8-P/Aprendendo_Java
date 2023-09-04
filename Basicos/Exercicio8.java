package projetao;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("horas?");
		int horas = scan.nextInt();
		
		System.out.println("salario p/h?");
		int salario = scan.nextInt();
		
		int resultado = salario * horas;
		
		System.out.println("salario total: " + resultado);
		
		

	}

}
