package aula34;

public class Contador {
	static int contando;
	
	Contador(){
		contando++;
	}
	
	public static void zerarContador() {
		contando = 0;
		System.out.println(contando);
	}
	public static void incrementarContador() {
		contando++;
		System.out.println(contando);
	}
	public static int retornarContador() {
		System.out.println(contando);
		return contando;
	}
	
	
	
	
}