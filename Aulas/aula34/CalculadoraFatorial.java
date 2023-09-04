package aula34;

public class CalculadoraFatorial {
	public static double soma(double parcela, double parcela2) {
		return parcela + parcela2;
	}
	public static double subtrair(double minuendo, double subtraendo) {
		return minuendo - subtraendo;
	}
	public static double multiplicar(double fator, double fator2) {
		return fator * fator2;
	}
	public static double dividir(double numerador, double denominador) {
		return numerador / denominador;
	}
	public static double potencia(double base, double elevado) {
		double aux = base;
		for(int cont = 0; cont < elevado; cont++) {
			aux *= base;
		}
		return aux;
	}
	public static double fatorial(int valor) {
		int aux = valor;
		
		for(int cont = 1; cont < valor; cont++) {
			aux *= cont;
		}
		return aux;
	}
}
