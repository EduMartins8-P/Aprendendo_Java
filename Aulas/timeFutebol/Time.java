package timeFutebol;

public class Time {
	public int posicoesTaticas[];
	
	public void defineQntPosicoes(int n, PosicaoTatica posTat) {
		posicoesTaticas[posTat.getValor()] = n;
	}
	
	public void adicionarJogador(Jogador jogo) {
		if(posicoesTaticas[jogo.getPosicao().getValor()] > 0) {
			System.out.println("Bem vindo ao time jogador " + jogo.getNome() + " :)");
			posicoesTaticas[jogo.getPosicao().getValor()] -= 1;
		}
		else {
			System.out.println("Todas as vagas para a posicao estao ocupadas :(\nTenta no vasco" );
		}
	}
}
