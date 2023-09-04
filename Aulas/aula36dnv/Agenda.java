package aula36dnv;

public class Agenda {
	private Contato[] contato;
	private String nome;
	
	public Contato[] getContato() {
		return contato;
	}
	public void setContato(Contato[] contato) {
		this.contato = contato;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public String informacoes(int id) {
	
		return contato[id].obterinfo();
	}
	
	public String informacoes() {
		String controle = "\n" + nome + "\n\n";
		
		for(int cont = 0; cont < contato.length; cont++) {
			controle += contato[cont].obterinfo();
		}
		return controle;
	}
}
