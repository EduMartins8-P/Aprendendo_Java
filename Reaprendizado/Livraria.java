package reaprendendo;

import java.util.Scanner;

public class Livraria {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Livro livro = new Livro();
		
		System.out.println("nome?");
		livro.nome = scan.next();
		
		System.out.println("disponibilidade?");
		livro.disponivel = scan.nextBoolean();
		
		System.out.println("nr de paginas?");
		livro.paginas = scan.nextInt();
		
		System.out.println("preco?");
		livro.valor = scan.nextDouble();
		
		System.out.println("livro: " + livro.nome + "\nnr de paginas: " + livro.paginas + "\npreco: " + livro.valor + "\ndisponibilidade: " + livro.disponivel);

	}

}
