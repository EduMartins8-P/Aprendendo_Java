package timeFutebol;

public class Jogador {
	PosicaoTatica posicao;
	private String nome;
	
	public Jogador(String nome, PosicaoTatica posicao) {
		this.nome = nome;
		this.posicao = posicao;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setPosicao(PosicaoTatica posicao) {
		this.posicao = posicao;
	}
	public PosicaoTatica getPosicao() {
		return posicao;
	}
}