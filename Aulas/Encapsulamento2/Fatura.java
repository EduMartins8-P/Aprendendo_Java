package exausto;

public class Fatura {
	private	Item[] item;
	private	String nome;
	private	String cpf;
	private int aux;
	
	public Item[] getItem() {
		return item;
	}
	public void setItem(Item[] item) {
		this.item = item;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public double obtempreco() {
		aux = 0;
		for(int cont = 0; cont < item.length; cont++) {
			aux += item[cont].getPrecoUnitario() * item[cont].getQuantidade();
		}
		return aux;
	}
	public void adicionarItem(int i, Item item) {
		this.item[i] = item;
	}
	
}
