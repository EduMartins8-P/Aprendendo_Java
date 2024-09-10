package cansado;

public enum EstadoCivil {
	SOLTEIRO(0), CASADO(1), DIVORCIADO(2), VIUVO(3);
	
	private int valor;
	
	EstadoCivil(int valor){
		this.valor = valor;
	}
	
	public int getValor() {
		return this.valor;
	}
}
