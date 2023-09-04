package projetao;
import java.util.Scanner;

public class ExercicioCaio {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] a = new int[5];
		
		for(int cont = 0; cont < 5; cont++) {
			a[cont] = scan.nextInt();
		}
		
		for(int cont = 0; cont < 5; cont++) {
			System.out.println(a[cont]);
		}

	}

}
