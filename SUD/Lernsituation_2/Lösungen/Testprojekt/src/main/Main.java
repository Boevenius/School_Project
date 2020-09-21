package main;

public class Main {

	public static void main(String[] args) {
		int gradzahl = 0;
		String jahreszeit = "";
		int jahreszeitI = 0;
		switch(jahreszeit) {
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
		if(jahreszeitI == 1 && gradzahl >= -3 && gradzahl <= 25) {
			System.out.println("Jahreszeit: " + jahreszeitI);
			System.out.println("Gradzahl: " + gradzahl);
			System.out.println("Die Temperaturen sind korrekt.");
		}else if(jahreszeitI == 2 && gradzahl >= 5 && gradzahl <= 35) {
			System.out.println("Jahreszeit: " + jahreszeitI);
			System.out.println("Gradzahl: " + gradzahl);
			System.out.println("Die Temperaturen sind korrekt.");
		}else if(jahreszeitI == 3 && gradzahl >= -5 && gradzahl <= 20) {
			System.out.println("Jahreszeit: " + jahreszeitI);
			System.out.println("Gradzahl: " + gradzahl);
			System.out.println("Die Temperaturen sind korrekt.");
		}else if(jahreszeitI == 4 && gradzahl >= -10 && gradzahl <= 15) {
			System.out.println("Jahreszeit: " + jahreszeitI);
			System.out.println("Gradzahl: " + gradzahl);
			System.out.println("Die Temperaturen sind korrekt.");
		}else {
			System.out.println("Die Temperaturen sind ungültig für die gegebene Jahreszeit.");
		}

	}

}
