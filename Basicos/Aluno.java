package projetao;

import java.util.Scanner;

public class Aluno {
	
	Scanner scan = new Scanner(System.in);
	
	String nome;
	int matricula, cont, cont2;
	String curso;
	String[] disciplinas = new String[3];
	int[][] notas = new int[3][2];
	
	void adicionarAtributos() {
		System.out.println("nome?");
		nome = scan.next();
		
		System.out.println("matricula");
		matricula = scan.nextInt();
		
		System.out.println("curso?");
		curso = scan.next();
		
		System.out.println("materias?");
		for(cont = 0; cont < 3; cont++) {
			disciplinas[cont] = scan.next();
		}
		
		for(cont = 0; cont < 3; cont++) {
			for(cont2 = 0; cont2 < 2; cont2++) {
				System.out.println("nota " + cont2 + "na materia " + disciplinas[cont]);
				notas[cont][cont2] = scan.nextInt();
			}
		}
	}
	
	void aprovacao() {
		for(cont = 0; cont < 3; cont++) {
			System.out.println("na disciplina " + disciplinas[cont]);
			if((notas[cont][0] + notas[cont][1]) / 2 < 7) {
				System.out.println("reprovado");
			}
			else System.out.println("aprovado");
		}
	}
	
	
	
	
	
	

}
