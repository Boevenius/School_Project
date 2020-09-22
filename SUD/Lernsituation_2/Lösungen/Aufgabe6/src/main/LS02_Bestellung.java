package main;

import java.util.Scanner;

public class LS02_Bestellung {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double versandkosten;
		System.out.println("Bitte Menge eingeben: ");
		int menge = scanner.nextInt();
		System.out.println("Bitte Preis eingeben: ");
		double preis = scanner.nextDouble();
		if (menge * preis < 100) {
			versandkosten = 5.5;
		} else if (menge * preis < 200) {
			versandkosten = 3;
		} else {
			versandkosten = 0;
		}
		System.out.printf(
				"Ihr Bestellwert beträgt %.2f \nIhre Versandkosten betragen %.2f \nIhr Rechnungsbetrag ist %.2f",
				(double)(menge * preis), (double)versandkosten, (double)(menge * preis + versandkosten));
		scanner.close();
	}

}
