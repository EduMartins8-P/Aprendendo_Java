package reaprendendo;

public class LampMel {
	
	private boolean ligdesl; 
	
	public LampMel(boolean ligdesl){
		
		this.ligdesl = ligdesl; 
	}
	public LampMel() {
		
	}
	
	
	public boolean isLigdesl() {
		return ligdesl;
	}
	public void setLigdesl(boolean ligdesl) {
		this.ligdesl = ligdesl;
	}
	public void controlarLampada(String controle) {
		if(controle.equals("ligar") == true) {
			if(ligdesl == true) {
				System.out.println("já está ligada");
			}
			else
				System.out.println("lampada foi ligada");
				ligdesl = true;
		}
		if(controle.equals("desligar") == true) {
			if(ligdesl == false) {
				System.out.println("já está desligada");
			}
			else
				System.out.println("lampada foi desligada");
				ligdesl = false;
		}
	}
	
	
	
	
	
}