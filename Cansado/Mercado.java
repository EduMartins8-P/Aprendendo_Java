package reaprendendo;

import java.util.Scanner;

public class Mercado {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Lampada lampada = new Lampada();
		
		System.out.println("marca?");
		lampada.marca = scan.next();
		
		System.out.println("preco?");
		lampada.preco = scan.nextDouble();
		
		System.out.println("quantidade?");
		lampada.quantidade = scan.nextInt();
		
		System.out.println("wats?");
		lampada.wats = scan.nextDouble();
		
		System.out.println("marca: " + lampada.marca + "\npreco: " + lampada.preco + "\nquantidade: " + lampada.quantidade + "\nwats: " + lampada.wats);

	}
}