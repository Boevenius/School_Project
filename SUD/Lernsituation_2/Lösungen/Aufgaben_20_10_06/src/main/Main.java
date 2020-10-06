package main;

import java.util.Scanner;

import aufgaben.LS02_Bustarif_neu;
import aufgaben.LS02_Quadrat;
import aufgaben.LS02_Taschenrechner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bitte Aufgabennummer eingeben.");
		int eingabe = scanner.nextInt();
		switch (eingabe) {
		case 1:
			LS02_Taschenrechner a1 = new LS02_Taschenrechner();
			a1.taschenrechner();
			break;
		case 2:
			LS02_Bustarif_neu a2 = new LS02_Bustarif_neu();
			a2.bustarifRechern();
			break;
		case 3:

			break;
		case 4:

			break;
		case 5:

			break;
		case 6:

			break;
		case 7:

			break;
		case 8:
			LS02_Quadrat a7 = new LS02_Quadrat();
			a7.quadrat();
			break;
		case 9:

			break;
		default:
			System.out.println("Keine gültige Aufgabennummer, Programm beendet.");
			break;
		}
		scanner.close();
	}
}
