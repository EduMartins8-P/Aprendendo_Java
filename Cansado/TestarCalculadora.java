package reaprendendo;
import java.util.Scanner;

public class TestarCalculadora {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = 0;
		String controle;
		
		while(a == 0) {
			
			System.out.println("somar, multiplicar, dividir, potencia, fatorial, encerrar");
			controle = scan.next();
			
			if(controle.equals("somar") ==  true) {
				Calculadora.somar(scan.nextDouble(), scan.nextDouble());
			}
			else if(controle.equals("multiplicar") == true) {
				Calculadora.multiplicar(scan.nextDouble(), scan.nextDouble());
			}
			else if(controle.equals("dividir") == true) {
				Calculadora.dividir(scan.nextDouble(), scan.nextDouble());
			}
			else if(controle.equals("potencia") == true) {
				Calculadora.potencia(scan.nextInt(), scan.nextInt());
			}
			else if(controle.equals("encerrar") == true) {
				a = 2;
			}
			else if(controle.equals("fatorial") == true) {
				Calculadora.fatorial(scan.nextInt());
			}
			
			
		}
		
		
		
	}

}
