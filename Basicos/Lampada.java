package projetao;

public class Lampada {
	
	boolean controlarLampada(String controle ) {
		if (controle.equals("ligar")) {
            return true;
        }
        
        if (controle.equals("desligar")) {
            return false;
        }
		
		return false;
	}
}
