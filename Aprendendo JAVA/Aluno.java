package reaprendendo;
import java.util.Scanner;

public class Aluno {
	
	Scanner scan = new Scanner(System.in);
	
	String nome;
	int matricula;
	String curso;
	String[] disciplinas = new String [3];
	double[][] notas = new double[3][3];
	int soma;
	
	void aprovacao() {
		for(int cont = 0; cont < 3; cont++) {
			for(int cont2 = 0; cont2 < 3; cont2++) {
				soma += notas[cont][cont2];
			}
			if((soma / 3) >= 5) {
				System.out.println("Na materia " + disciplinas[cont] + " voce foi aprovado :D");
			}
			else
				System.out.println("Na materia " + disciplinas[cont] + " voce foi reprovado D:");
		}
	}
	void determinarNotas() {
		for(int cont = 0; cont < 3; cont++) {
			System.out.println("qual nome da materia " + (cont + 1) + "?");
			disciplinas[cont] = scan.next();
			for(int cont2 = 0; cont2 < 3; cont2++) {
				System.out.println("nota " + (cont2 + 1) + "?");
				notas[cont][cont2] = scan.nextDouble();
			}
		}
	}
}
