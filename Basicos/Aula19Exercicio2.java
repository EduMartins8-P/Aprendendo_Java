package projetao;

public class Aula19Exercicio2 {

	public static void main(String[] args) {
		int[] a = new int[8];
		int[] b = new int[8];
		
		a[0] = 2;
		a[1] = 3;
		a[2] = 4;
		a[3] = 5;
		a[4] = 6;
		a[5] = 7;
		a[6] = 8;
		a[7] = 9;
		
		b[0] = a[0] * 2;
		b[1] = a[1] * 2;
		b[2] = a[2] * 2;
		b[3] = a[3] * 2;
		b[4] = a[4] * 2;
		b[5] = a[5] * 2;
		b[6] = a[6] * 2;
		b[7] = a[7] * 2;
		
		for(int cont = 0; cont < 8; cont++) {
			System.out.println(b[cont]);
		}
		

	}

}
