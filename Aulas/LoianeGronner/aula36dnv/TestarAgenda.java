package aula36dnv;
import java.util.Scanner;

public class TestarAgenda {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Agenda agenda = new Agenda();
		
		System.out.println("nome agenda");
		agenda.setNome(scan.next());
		
		Contato[] contatos;
		
		System.out.println("quantos contatos?");
		int nrcontatos = scan.nextInt();
		
		contatos = new Contato[nrcontatos];
		
		for(int cont = 0; cont < nrcontatos; cont++) {
			
			Contato contato = new Contato();
			
			System.out.println("nome do contato " + (cont + 1));
			contato.setNome(scan.next());
			
			System.out.println("email do contato " + (cont + 1));
			contato.setEmail(scan.next());
			
			System.out.println("telefone do contato " + (cont + 1));
			contato.setTelefone(scan.next());
			
			contatos[cont] = contato;
		}
	
		agenda.setContato(contatos);
		
		int a = 0;
		String controle;
		
		while (a == 0) {
			System.out.println("contato ou tudo");
			
			controle = scan.next();
			
			if(controle.equals("contato") == true) {
				System.out.println("id");
				System.out.println(agenda.informacoes(scan.nextInt()));
			}
			if(controle.equals("tudo") == true) {
				System.out.println(agenda.informacoes());
			}
		}
	}
}
