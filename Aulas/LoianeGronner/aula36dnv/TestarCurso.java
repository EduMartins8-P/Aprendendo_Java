package aula36dnv;
import java.util.Scanner;

public class TestarCurso {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Aluno[] alunos = new Aluno[5];
		Curso curso = new Curso();
		
		for(int cont = 0; cont < alunos.length; cont++) {
			
			Aluno aluno = new Aluno();
			double[] notas = new double[4];
			
			System.out.println("nome do aluno " + (cont + 1));
			aluno.setNome(scan.next());
			
			System.out.println("matricula do aluno " + (cont + 1));
			aluno.setMatricula(scan.nextInt());
			
			System.out.println("notas do aluno " + (cont + 1));
			
			for(int cont2 = 0; cont2 < aluno.getNotas().length; cont2++) {
				System.out.println("nota " + (cont2 + 1));
				notas[cont2] = scan.nextDouble();
			}
			aluno.setNotas(notas);
			
			alunos[cont] = aluno;
		}
		curso.setAlunos(alunos);
		
		double mediaDaTurma = 0;
		
		for(int cont = 0; cont < 5; cont++) {
			double media = 0;
			
			for(int cont2 = 0; cont2 < 4; cont2++) {
				media += curso.getAlunos()[cont].getNotas()[cont2];
			}
			
			media /= 4;
			mediaDaTurma += media;
			
			if(media >= 7) {
				System.out.println("aluno " + curso.getAlunos()[cont].getNome() +  " aprovado com media " + media + " :D");
			}
			else {
				System.out.println("aluno " + curso.getAlunos()[cont].getNome() +" reprovado com media " + media + " D:");
			}
		}
		mediaDaTurma /= curso.getAlunos().length;
		
		System.out.println("media da turma = " + mediaDaTurma);

	}

}
