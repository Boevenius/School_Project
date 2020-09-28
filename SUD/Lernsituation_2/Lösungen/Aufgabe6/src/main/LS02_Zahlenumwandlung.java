package main;

import java.util.Scanner;

public class LS02_Zahlenumwandlung {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String zahlS = "";
		System.out.println("Bitte Zahl zwischen 0 und 10 eingeben: ");
		int zahl = scanner.nextInt();
		switch(zahl) {
		case 0:
			zahlS = "Null";
			break;
		case 1:
			zahlS = "Eins";
			break;
		case 2:
			zahlS = "Zwei";
			break;
		case 3:
			zahlS = "Drei";
			break;
		case 4:
			zahlS = "Vier";
			break;
		case 5:
			zahlS = "Fünf";
			break;
		case 6:
			zahlS = "Sechs";
			break;
		case 7:
			zahlS = "Sieben";
			break;
		case 8:
			zahlS = "Acht";
			break;
		case 9:
			zahlS = "Neun";
			break;
		case 10:
			zahlS = "Zehn";
			break;
		default:
			System.out.println("Programm beendet!");
			scanner.close();
			System.exit(0);
		}
		System.out.printf("Eingabe: %d \nAusgabe: %s", zahl, zahlS);
		scanner.close();
	}

}
