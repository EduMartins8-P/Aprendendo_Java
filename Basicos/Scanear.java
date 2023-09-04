package projetao;

import java.util.Scanner;

public class Scanear {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("parcela 1");
		int parcela = scan.nextInt();
		
		System.out.println("parcela 2");
		int parcela2 = scan.nextInt();
		
		int total = parcela + parcela2;
		
		System.out.println(total);
		
	}

}
