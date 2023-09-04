package reaprendendo;
import java.util.Scanner;

public class TestandoConta {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ContaCorrente conta = new ContaCorrente();
		
		int i = 0;
		String controle;
		
		System.out.println("nome");
		conta.nome = scan.next();

		System.out.println("tem especial?");
		conta.especial = scan.nextBoolean();
		
		if(conta.especial == true) {
			System.out.println("limite?");
			conta.limite = scan.nextDouble();
		}
		
		System.out.println("numero da conta?");
		conta.numero = scan.nextInt();
		
		System.out.println("saldo?");
		conta.saldo = scan.nextDouble();
		
		while(i == 0) {
			System.out.println("o que deseja fazer? sacar, depositar, consultar, consultarcredito, encerrar");
			controle = scan.next();
			
			if(controle.equals("sacar") == true) {
				System.out.println("quanto?");
				conta.sacarDinheiro(scan.nextDouble());
			}
			if(controle.equals("depositar") == true) {
				System.out.println("quanto?");
				conta.depositarDinheiroSaldo(scan.nextDouble());
			}
			if(controle.equals("consultar") == true) {
				conta.consultarSaldo();
			}
			if(controle.equals("consultarcredito") == true) {
				conta.consultarEspecial();
			}
			if(controle.equals("encerrar") == true) {
				i = 1;
			}
			
		}
			
	}
		
		

}
