package reaprendendo;
import java.util.Scanner;

public class TestarAlunoMelhor {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		AlunoMelhor aluno = new AlunoMelhor();
		
		String[] disciplinas = new String[3];
		double[][] notas = new double[3][2];
		
		System.out.println("nome");
		aluno.setNome(scan.next());
		
		System.out.println("matricula");
		aluno.setMatricula(scan.nextInt());
		
		System.out.println("curso");
		aluno.setCurso(scan.next());
		
		for(int cont = 0; cont < 3; cont++) {
			System.out.println("disciplina " + (cont+1));
			disciplinas[cont] = scan.next();
			
			for(int cont2 = 0; cont2 < 2; cont2++) {
				System.out.println("nota " + (cont2 + 1));
				notas[cont][cont2] = scan.nextDouble();
			}
		}
		
		aluno.setDisciplinas(disciplinas);
		aluno.setNotas(notas);
		
		aluno.aprovacao();
		
	}
}