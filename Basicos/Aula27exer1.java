package projetao;

import java.util.Scanner;

public class Aula27exer1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Lampada lampada = new Lampada();
		
		String estado;
		estado = scan.next();
		
		boolean controle = lampada.controlarLampada(estado);
		
		System.out.print(controle);

	}

}
