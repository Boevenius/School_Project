package aufgaben;

import java.util.Scanner;

public class LS02_Taschenrechner {
	
	public void taschenrechner() {
		try {
			Scanner scanner = new Scanner(System.in);
			String eingabe = "";
			while(!eingabe.equalsIgnoreCase("Ende")) {
				System.out.println("Bitte gebe zwei Zahlen ein oder Ende zum beenden:");
				eingabe = scanner.nextLine();
				if(!eingabe.equalsIgnoreCase("Ende")) {
					String[] zahlen = eingabe.split(" ");
						System.out.println("Ihr Ergebenis ist: " + (Integer.parseInt(zahlen[0]) + Integer.parseInt(zahlen[1])));
				}
			}
			scanner.close();
		} catch (Exception e) {
			System.out.println("Fehler erkannt, Programm beendet.");
		}
	}
	
}
