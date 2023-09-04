package reaprendendo;
import java.util.Scanner;

public class TestLampada {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("controle");
		
		LampMel lampada = new LampMel(scan.nextBoolean());
		
		int i = 0;
		String controle;
		
		while(i == 0) {
			controle = scan.next();
			
			if(controle.equals("ligar") == true || controle.equals("desligar") == true) {
				lampada.controlarLampada(controle);
			}
			if(controle.equals("parar") == true) {
				i = 1;
			}
		}
		
		
		

		
	}

	
	
}
