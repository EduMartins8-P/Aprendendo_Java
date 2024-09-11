package aula33;

public class Lampada {
	private boolean estado;
	
	public boolean getEstado() {
		return this.estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	void controlarLampada(String controle) {
		if(controle.equals("ligar") == true) {
			this.estado = true;
			System.out.println("liguei essa porra");
		}
		else if(controle.equals("desligar") == true) {
			this.estado = false;
			System.out.println("desliguei essa porra");
		}
		else {
			System.out.println("invalido, está:");
			checarLampada();
		}
	}
	void checarLampada() {
		if(this.estado == true) {
			System.out.println("lampada ligada");
		}
		else {
			System.out.println("lampada desligada");
		}
	}
	
	
	
	
}
