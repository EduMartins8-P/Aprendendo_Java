package reaprendendo;

public class OtaLampada {
	boolean estado;
	
	void controlarLampada(String controle) {
		
		if(controle.equals("ligar")) {
			estado = true;
		}
		else
			estado = false;
	}
	
	void verificarLampada() {
		if(estado == true) {
			System.out.println("ligada");
		}
		else {
			System.out.println("desligada");
		}
		
	}
	
	
	
	
}