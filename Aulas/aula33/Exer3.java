package aula33;

import java.util.Scanner;

public class Exer3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Aluno aluno = new Aluno();
		
		int qntd_materia, qntd_notas;
		
		System.out.println("nome?");
		aluno.setNome(scan.next());
		
		System.out.println("matricula?");
		aluno.setMatricula(scan.nextInt());
		
		System.out.println("curso?");
		aluno.setCurso(scan.next());
		
		System.out.println("estah matriculado?");
		aluno.setMatriculado(scan.nextBoolean());
		
		System.out.println("quantas materias?");
		qntd_materia = scan.nextInt();
		String[] materias = new String[qntd_materia];
		
		System.out.println("qual o nome das " + qntd_materia + " materias");
		for(int cont = 0; cont < qntd_materia; cont++) {
			materias[cont] = scan.next();
		}
		aluno.setMaterias(materias);
		
		System.out.println("quantas notas de cada materia?");
		qntd_notas = scan.nextInt();
		double[][] notas = new double[qntd_materia][qntd_notas];
		
		for(int cont = 0; cont < qntd_materia; cont++) {
			System.out.println("quais as notas da materia de " + materias[cont] + "?");
			for(int cont2 = 0; cont2 < qntd_notas; cont2++) {
				notas[cont][cont2] = scan.nextDouble();
			}
		}
		aluno.setNotas(notas);
		
		aluno.determinarAprovacao();
		
		
	}

}
