package main;

public class MainRichtig {
	public static void main(String[] args) {
		//Deklaration der Variablen
		int gradzahl = 0;
		String jahreszeit = "";
		int jahreszeitI = 0;

		// Umwandlung von String jahreszeit zu int jahreszeitI
		switch (jahreszeit) {
		case "Frühling":
			jahreszeitI = 1;
			break;
		case "Sommer":
			jahreszeitI = 2;
			break;
		case "Herbst":
			jahreszeitI = 3;
			break;
		case "Winter":
			jahreszeitI = 4;
			break;
		}
		// Abfrage ob die Temperaturen zu den Jahreszeiten passen
		if (jahreszeitI == 1 && gradzahl >= -3 && gradzahl <= 25) {
			System.out.println("Jahreszeit: " + jahreszeitI);
			System.out.println("Gradzahl: " + gradzahl);
			System.out.println("Die Temperaturen sind korrekt."); // ausgabe auf der Konsole
		} else if (jahreszeitI == 2 && gradzahl >= 5 && gradzahl <= 35) {
			System.out.println("Jahreszeit: " + jahreszeitI);
			System.out.println("Gradzahl: " + gradzahl);
			System.out.println("Die Temperaturen sind korrekt."); // ausgabe auf der Konsole
		} else if (jahreszeitI == 3 && gradzahl >= -5 && gradzahl <= 20) {
			System.out.println("Jahreszeit: " + jahreszeitI);
			System.out.println("Gradzahl: " + gradzahl);
			System.out.println("Die Temperaturen sind korrekt."); // ausgabe auf der Konsole
		} else if (jahreszeitI == 4 && gradzahl >= -10 && gradzahl <= 15) {
			System.out.println("Jahreszeit: " + jahreszeitI);
			System.out.println("Gradzahl: " + gradzahl);
			System.out.println("Die Temperaturen sind korrekt."); // ausgabe auf der Konsole
		} else {
			// Falls die Temperaturen nicht passen wird ein fehler ausgegeben
			System.err.println("Die Temperaturen sind ungültig für die gegebene Jahreszeit.");
		}
	}
}
