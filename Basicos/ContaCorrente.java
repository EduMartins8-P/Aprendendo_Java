package projetao;

public class ContaCorrente {
	
	int numero = 1234;
	double saldo = 1500;
	boolean especial = false;
	double limite = 5000;
	
	void saque (double valor) {
		if (valor > saldo) {
			System.out.println("nao pode corno");
		}
		else {
			saldo -= valor;
			System.out.println("novo saldo = " + saldo);
		}
	}
	
	void depositar (double valor) {
		saldo += valor;
		System.out.println("novo saldo = " + saldo);
	}
	
	void consultar() {
		System.out.println("seu saldo eh = " + saldo);
	}
	void usandoCheque() {
		if(especial == false) {
			System.out.println("ta nao");
		}
		else System.out.println("elu ta");
	}

}
