package cansado;

public enum Sexo {
	MASCULINO(0), FEMININO(1);
	
	private int valor;
	
	Sexo(int valor){
		this.valor = valor;
	}
	
	public int getValor() {
		return this.valor;
	}
}
