package cansado;

public class Encapsulamento {
	private String nome;
	private String nPai;
	private String nMae;
	private int dia;
	private int mes;
	private int ano;
	private Nacionalidade nacionalidade;
	private double altura;
	private double peso;
	private Sexo sexo;
	private EstadoCivil estadoCivil;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getnPai() {
		return nPai;
	}
	public void setnPai(String nPai) {
		this.nPai = nPai;
	}
	public String getnMae() {
		return nMae;
	}
	public void setnMae(String nMae) {
		this.nMae = nMae;
	}
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public Nacionalidade getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(Nacionalidade nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public Sexo getSexo() {
		return sexo;
	}
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	
	
}
