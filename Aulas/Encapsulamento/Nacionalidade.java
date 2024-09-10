package cansado;

public enum Nacionalidade {
	BR(0), PT(1), EN(2), OUTRAS(3);
	
	private int valor;
	
	Nacionalidade(int valor){
		this.valor = valor;
	}
	
	public int getValor() {
		return this.valor;
	}
}
