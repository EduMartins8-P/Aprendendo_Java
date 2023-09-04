package aula36;

public class Agenda {
	private Contatos[] contato;
	private String nome;
	private int tamanho;
	
	public Contatos[] getContato() {
		return contato;
	}
	public void setContato(Contatos[] contato) {
		this.contato = contato;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getTamanho() {
		return tamanho;
	}
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	

	Agenda(String nome, int tamanho){
		this.tamanho = tamanho;
		this.nome = nome;
		contato = new Contatos[tamanho];
	}
	
	public void printarContato(String nome) {
		for(int cont = 0; cont < tamanho; cont++) {
			if(contato[cont].nome.equals(nome) == true) {
				System.out.println(contato[cont].nome + "\n" + contato[cont].telefone + "\n" + contato[cont].email);
			}
		}
	}
	
	
}
