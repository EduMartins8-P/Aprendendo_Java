package timeFutebol;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Time time;
		Jogador jogador = null;
		Scanner scan = new Scanner(System.in);
		String nomeJogador;
		String controle = "a";
		
		System.out.println("Quantos jogadores?");
		time = new Time(scan.nextInt());
		
		System.out.println("Quantos goleiros?");
		time.defineQntPosicoes(scan.nextInt(), PosicaoTatica.GOLEIRO);

		System.out.println("Quantos zagueiros?");
		time.defineQntPosicoes(scan.nextInt(), PosicaoTatica.ZAGUEIRO);
		
		System.out.println("Quantos laterais?");
		time.defineQntPosicoes(scan.nextInt(), PosicaoTatica.LATERAL);
		
		System.out.println("Quantos meias?");
		time.defineQntPosicoes(scan.nextInt(), PosicaoTatica.MEIA);
		
		System.out.println("Quantos atacantes?");
		time.defineQntPosicoes(scan.nextInt(), PosicaoTatica.ATACANTE);
		
		while(!controle.equals("encerrar")) {
			System.out.println("\n\n\n\nadicionarJogador ou encerrar");
			controle = scan.next();
		
			if(controle.equals("adicionarJogador")) {
				System.out.println("Qual nome do novo jogador?");
				nomeJogador = scan.next();
				System.out.println("qual posicao do jogador " + nomeJogador + "?");
				
				if(jogador == null) {
					jogador = new Jogador(nomeJogador, PosicaoTatica.valueOf(scan.next()));
				}
				else {
					jogador.setNome(nomeJogador);
					jogador.setPosicao(PosicaoTatica.valueOf(scan.next()));
				}
				time.adicionarJogador(jogador);
			}
		}
		
		
		
		
		
		
		
		
		
	}
}