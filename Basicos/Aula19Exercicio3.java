package projetao;

public class Aula19Exercicio3 {

	public static void main(String[] args) {
		int[] a = new int[15];
		int[] b = new int[15];
		
		for(int cont = 0; cont < 15; cont++) {
			a[cont] = cont + 2;
		}
		for(int cont = 0; cont < 15; cont++) {
			b[cont] = a[cont] * a[cont];
		}
		for(int cont = 0; cont < 15; cont++) {
			System.out.println(b[cont]);
		
		}
		
	}

}
