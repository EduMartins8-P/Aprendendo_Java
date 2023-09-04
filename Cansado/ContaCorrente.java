package reaprendendo;
import java.util.Scanner;

public class ContaCorrente {
	
	Scanner scan = new Scanner(System.in);
	
	int numero;
	double saldo;
	String nome;
	boolean especial;
	double limite;
	
	void sacarDinheiro(double dinheiro) {
		if(dinheiro > saldo) {
			System.out.println("saldo insuficiente, tirar do limite?");
			if(scan.next().equals("sim") == true) {
				if((dinheiro - saldo) < limite) {
					dinheiro -= saldo;
					saldo = 0;
					limite -= dinheiro;
				}
				else {
					System.out.println("limite insuficiente");
				}
			}
		}
		else {
			saldo -= dinheiro;
		}
		System.out.println("novo saldo: " + saldo);
	}
	
	void depositarDinheiroSaldo(double dinheiro) {
		saldo += dinheiro;
		System.out.println("novo saldo: " + saldo);
	}
	
	void consultarSaldo() {
		System.out.println("saldo atual: " + saldo);
	}
	
	void consultarEspecial() {
		System.out.println(especial);
	}
}