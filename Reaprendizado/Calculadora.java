package reaprendendo;

public class Calculadora {
	public static void somar(double parc1, double parc2) {
		System.out.println((parc1 + parc2));
	}
	public static void multiplicar(double parc1, double parc2) {
		System.out.println((parc1 * parc2));
	}
	public static void dividir(double numerador, double denominador) {
		System.out.println(numerador / denominador);
	}
	public static void potencia(int base, int elevado) {
		int aux = base;
		
		for(int cont = 1; cont < elevado; cont++) {
			aux *= base;
		}
		System.out.println(aux);
	}
	public static void fatorial(int numero) {
		int aux = 1;
		for(int cont = 1; cont < numero; cont++) {
			aux *= cont;
		}
		System.out.println(aux);
	}
}