package projetao;
import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("salario por hora e numero de horas trabalhadas");
		double salph = scan.nextDouble();
		double horas = scan.nextDouble();
		
		double salbru = salph * horas;
		double inss = salbru / 100 * 8;
		double sind = salbru / 100 * 5;
		double liq = salbru / 100 * 76;
		
		System.out.println("bruto : " + salbru + "\ninss : " + inss + "\nsindicato : " + sind + "\nliquido : " + liq);
		
	}

}
