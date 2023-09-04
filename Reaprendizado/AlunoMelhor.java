package reaprendendo;

public class AlunoMelhor {
	
	private String nome;
	private int matricula;
	private String curso;
	private String[] disciplinas = new String[3];
	private double[][] notas = new double[3][2];
	
	public AlunoMelhor(String nome, int matricula, String curso, String[] disciplinas, double[][] notas) {
		this.nome = nome;
		this.matricula = matricula;
		this.curso = curso;
		this.disciplinas = disciplinas;
		this.notas = notas;
	}
	public AlunoMelhor() {
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public String[] getDisciplinas() {
		return disciplinas;
	}
	public void setDisciplinas(String[] disciplinas) {
		this.disciplinas = disciplinas;
	}
	public double[][] getNotas() {
		return notas;
	}
	public void setNotas(double[][] notas) {
		this.notas = notas;
	}
	
	public void aprovacao() {
		double soma = 0;
		for(int cont = 0; cont < 3; cont++, soma = 0) {
			soma = notas[cont][0] + notas[cont][1] + soma;
			
			if(soma/2 >= 7) {
				System.out.println("aprovado em " + disciplinas[cont]);
			}
			else
				System.out.println("reprovado em " + disciplinas[cont]);
		}
		
	}
	
}