package reaprendendo;
import java.util.Scanner;

public class TestarContaMelhor {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("numero saldo especial limite nome");
		ContaCorrenteMelhor joao = new ContaCorrenteMelhor(scan.nextInt(), scan.nextDouble(), scan.nextBoolean(), scan.nextDouble(), scan.next());
		
		String controle;
		int i = 0;
		
		while(i == 0) {
			System.out.println("deseja sacar, depositar, consultar saldo, consultar se tem especial ou encerrar?");
			controle = scan.next();
			if(controle.equals("sacar") == true) {
				joao.sacar(scan.nextDouble());
			}
			else if (controle.equals("depositar") == true) {
				joao.depositar(scan.nextDouble());
			}
			else if(controle.equals("saldo") == true) {
				joao.consultarSaldo();
			}
			else if(controle.equals("especial") == true) {
				joao.especial();
			}
			else if(controle.equals("encerrar") == true) {
				i = 1;
			}	
		}
	}
}