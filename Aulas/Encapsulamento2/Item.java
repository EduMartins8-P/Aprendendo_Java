package exausto;

public class Item {
	private int quantidade;
	private double precoUnitario;
	private String nome;
	
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public double getPrecoUnitario() {
		return precoUnitario;
	}
	public void setPrecoUnitario(double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void aumentarQuantidade(){
		quantidade++;
	}
	public void aumentarMaisQuantidade(){
		quantidade++;
		quantidade++;
	}
	
	
}
