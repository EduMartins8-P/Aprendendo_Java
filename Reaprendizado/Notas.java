package reaprendendo;
import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Aluno caralho = new Aluno();
		
		caralho.determinarNotas();
		caralho.aprovacao();
		
	}
}
