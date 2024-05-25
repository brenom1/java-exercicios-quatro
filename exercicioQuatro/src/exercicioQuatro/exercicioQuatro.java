package exercicioQuatro;
import java.util.Locale;
import java.util.Scanner;

public class exercicioQuatro {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);

		int codicoPeca = sc.nextInt();
		int numeroPeca = sc.nextInt();
		double valorUnitario = sc.nextDouble();
		
		int codicoPecaDois = sc.nextInt();
		int numeroPecaDois = sc.nextInt();
		double valorUnitarioDois = sc.nextDouble();

		System.out.printf("VALOR A PAGAR %.2f", numeroPeca * valorUnitario + numeroPecaDois * valorUnitarioDois);
		
		sc.close();
	}
}