package timeFutebol;

public enum PosicaoTatica {
	GOLEIRO(0), ZAGUEIRO(1), LATERAL(2), MEIA(3), ATACANTE(4);
	
	private int valor;
	
	PosicaoTatica(int valor){
		this.valor = valor;
	}
	public int getValor() {
		return this.valor;
	}
}
