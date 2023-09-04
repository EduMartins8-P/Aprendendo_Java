package aula36;

import java.util.Scanner;

public class Exer1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("quantos contatos?");
		int tamanho = scan.nextInt();
		int a = 0;
		String aux;
		
		System.out.println("nome dono da agenda?");
		Agenda pessoa = new Agenda(scan.next(), tamanho);
		
		for(int cont = 0; cont < tamanho; cont++) {
			pessoa.getContato()[cont] = new Contatos();
			System.out.println("nome do contato " + (cont + 1) + "?");
			pessoa.getContato()[cont].setNome(scan.next());
			System.out.println("telefone do contato " + (cont + 1) + "?");
			pessoa.getContato()[cont].setTelefone(scan.nextInt());
			System.out.println("email do contato " + (cont + 1) + "?");
			pessoa.getContato()[cont].setEmail(scan.next());		
		}
		
		while (a == 0) {
			System.out.println("deseja checar qual contato?");
			aux = scan.next();
			
			if(aux.equals("encerrar") == true) {
				a = 1;
			}
			
			pessoa.printarContato(aux);
		}
			
			
	}
}