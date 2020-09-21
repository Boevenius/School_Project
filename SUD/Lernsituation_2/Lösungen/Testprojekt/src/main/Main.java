package main;

public class Main {
	//Initiallisierung der Instanzvariablen
	private int gradzahl;
	private String jahreszeit;
	private int jahreszeitI;

	public Main(int gradzahl, String jahreszeit) {
		//Deklaration der Instanzvariablen
		this.gradzahl = gradzahl;
		this.jahreszeit = jahreszeit;
		jahreszeitI = 0;
	}

	private void temperaturen() {
		//Umwandlung von String jahreszeit zu int jahreszeitI
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
		//Abfrage ob die Temperaturen zu den Jahreszeiten passen
		if (jahreszeitI == 1 && gradzahl >= -3 && gradzahl <= 25) {
			ausgabe(gradzahl, jahreszeitI); //ausgabe auf der Konsole
		} else if (jahreszeitI == 2 && gradzahl >= 5 && gradzahl <= 35) {
			ausgabe(gradzahl, jahreszeitI);	//ausgabe auf der Konsole
		} else if (jahreszeitI == 3 && gradzahl >= -5 && gradzahl <= 20) {
			ausgabe(gradzahl, jahreszeitI);	//ausgabe auf der Konsole
		} else if (jahreszeitI == 4 && gradzahl >= -10 && gradzahl <= 15) {
			ausgabe(gradzahl, jahreszeitI);	//ausgabe auf der Konsole
		} else {
			//Falls die Temperaturen nicht passen wird ein fehler ausgegeben
			System.err.println("Die Temperaturen sind ungültig für die gegebene Jahreszeit.");
		}
	}
	//Methode zur Ausgabe auf der konsole
	private static void ausgabe(int gradzahl, int jahreszeitI) {
		System.out.println("Jahreszeit: " + jahreszeitI);
		System.out.println("Gradzahl: " + gradzahl);
		System.out.println("Die Temperaturen sind korrekt.");
	}
	//eigentliche ausführung der Methoden
	public static void main(String[] args) {
		Main main = new Main(10, "Frühling");
		main.temperaturen();
	}
}
