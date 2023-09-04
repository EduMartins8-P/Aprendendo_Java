package reaprendendo;

import java.util.Scanner;

public class TestarLampada {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		OtaLampada lampadinha = new OtaLampada();
		String controle;
		
		System.out.println("estado?");
		lampadinha.estado = scan.nextBoolean();
		
		for(int cont = 1; cont != 0;) {
			controle = scan.next();
			
			if(controle.equals("controlar") == true) {
				lampadinha.controlarLampada(scan.next());
			}
			if(controle.equals("verificar") == true) {
				lampadinha.verificarLampada();
			}
			
		}
		
		
		
	}

}
