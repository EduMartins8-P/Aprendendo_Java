package projetao;
import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("altura?");
		double altura = scan.nextDouble();
		
		double ideal = 72.7 * altura - 58;
		
		System.out.println("peso ideal : " + ideal);

	}

}
