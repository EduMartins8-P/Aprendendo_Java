package aula33;

public class Aluno {
	private String nome;
	private int matricula;
	private String curso;
	private boolean matriculado;
	private String[] materias;
	private double[][] notas;
	
	
	//gets e sets
	
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
	public boolean getMatriculado() {
		return matriculado;
	}
	public void setMatriculado(boolean matriculado) {
		this.matriculado = matriculado;
	}
	public String[] getMaterias() {
		return materias;
	}
	public void setMaterias(String[] materias) {
		this.materias = materias;
	}
	public double[][] getNotas() {
		return notas;
	}
	public void setNotas(double[][] notas) {
		this.notas = notas;
	}
	
	// metodos
	
	public void determinarAprovacao() {
		for(int cont = 0; cont < notas.length; cont++) {
			double aux = 0;
			for(int cont2 = 0; cont2 < notas[cont].length; cont2++) {
				aux += notas[cont][cont2];
			}
			aux /= notas[cont].length;
			
			System.out.println("na materia " + materias[cont]+ ":");
			
			if(aux >= 7) {
				System.out.println("aprovado com a nota " + aux);
			}
			else {
				System.out.println("reprovado com a nota " + aux);
			}
		}
	}
}
