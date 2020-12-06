package hund;
/**
 * 
 * @author rollins
 *
 */

/**
 * 
 * @class Hund
 * speichert die Eigenschaften eines Hundes und stellt Hund-Funktionalit�t zur Verf�gung
 */
public class Hund {

	private String name = "Bob"; // Der Hund hat einen Namen mit dem er gerufen wird
	private int groesse=60; // Die Gr��e wird in cm eingetragen
	private double gewicht=20; // Das Gewicht soll in kg gespeichert werden
	private String rasse = "Promenadenmischung"; // Die Rasse wird als Text gespeichert
	
	/**
	 * Gibt den Namen des aktuellen Hund-Objekts als String zurück
	 * @return den namen des aktuellen Hund-Objekts
	 */
	
	public String getName() {
		return name;
	}

	/**
	 * 
	 * @param name 
	 * Setzt den Namen des Hundes auf den übergebenen Parameter falls der Name aus mehr als zwei Sonderzeichen besteht
	 * Name des Hunds besteht nur aus Buchstaben und am Anfang ein gro�er Buchstabe
	 */
	public void setName(String name) {
		// ruft die Methode 'entferneSonderzeichen' der eigenen Klasse auf mit dem übergebenen Parameter und deklariert den String erlaubt mit dem zurückgegebenen String
		String erlaubt = this.entferneSonderzeichen(name);
		// führt den ersten Block aus falls der String aus mindestens zwei Zeichen besteht, ansonsten wird der Zweite Block ausgeführt
		if (erlaubt.length() > 1)
			// setzt das Attribut 'name' auf den Wert der Variable 'erlaubt'
			this.name = erlaubt;
		else {
			// gibt auf der Konsole den eingefügten String aus
			System.out.println("Name ist zu kurz!");
		}
	}

	/**
	 * Gibt die 'groesse' des momentanen Hund-Objekts als int zurück
	 * @return die 'groesse' des momentanen Hund-Objekts
	 */
	public int getGroesse() {
		return groesse;
	}

	/**
	 * Setzt die als Parameter übergeben Groesse als neue groesse für das aktuelle Hund-Objekt. Falls der Parameter groesser 111 oder kleiner 10 ist, wird die groesse auf die entsprechende Grenzen gesetzt
	 * @param groesse nur im Rahmen bereits bekannter Gr��en von Hunden
	 */
	public void setGroesse(int groesse) {
		// Der kleinste Hund ist mindestens 10 cm gro� aber nie groesser als 111cm:
		if (groesse < 10) {
			// gibt auf der Konsole den eingefügten String aus
			System.out.println(
					"So klein ist kein Hund.  Der kleinste bekannt Hund war ein Chihuahua Namens Milly und war 9.65 cm hoch.");
			// Setzt die 'groesse' des momentanen Hund-Objekts auf 10
			this.groesse = 10;
		} else if (groesse > 111) {
			// gibt auf der Konsole den eingefügten String aus
			System.out.println(
					"So gro� ist kein Hund. Der gr��te bekannte Hund war ein Great Dane Namens Zeus und war 1.118 m gro�.");
			// Setzt die 'groesse' des momentanen Hund-Objekts auf 111
			this.groesse = 111;
		} else {
			// Setzt die 'groesse' des momentanen Hund-Objekts auf die uebergebene groesse
			this.groesse = groesse;
		}
	}

	/**
	 * Gibt das 'gewicht' des momentanen Hund-Objekts als double zurück
	 * @return die 'groesse' des momentanen Hund-Objekts
	 */
	public double getGewicht() {
		return gewicht;
	}

	/**
	 * Setzt das als Parameter übergeben Gewicht als neues gewicht für das aktuelle Hund-Objekt. Falls der Parameter groesser 143 oder kleiner 0.5 ist, wird das gewicht auf die entsprechende Grenzen gesetzt
	 * Hunde wiegen mindestens 500g und maximal 143kg 
	 * @param gewicht
	 */
	public void setGewicht(double gewicht) {
		 
		if (gewicht < 0.5) {
			// Setzt das 'gewicht' des momentanen Hund-Objekts auf 0.5
			this.gewicht = 0.5;
			// gibt auf der Konsole den eingefügten String aus
			System.out.println(
					"So wenig wiegt kein erwachsener Hund. Der leichteste Hund hie� Miracle Milly und wo ca. 1 Pfund.");
		} else if (gewicht > 143) {
			// Setzt das 'gewicht' des momentanen Hund-Objekts auf 143
			this.gewicht = 143;
			// gibt auf der Konsole den eingefügten String aus
			System.out.println("So schwer ist kein Hund. Der schwerste bekannte Hund hie� Zorbas und wog 143kg.");
		} else {
			// Setzt das 'gewicht' des momentanen Hund-Objekts auf das uebergebene gewicht
			this.gewicht = gewicht;
		}
	}
	
	/**
	 * Gibt die 'rasse' des momentanen Hund-Objekts als String zurück
	 * @return	die 'rasse' des momentanen Hund-Objekts
	 */
	public String getRasse() {
		return rasse;
	}
	
	/**
	 * Setzt die Rasse des Hundes auf den übergebenen Parameter falls die Rasse aus mehr als vier Sonderzeichen besteht
	 * @param rasse
	 */
	public void setRasse(String rasse) {
		// ruft die Methode 'entferneSonderzeichen' der eigenen Klasse auf mit dem übergebenen Parameter und deklariert den String erlaubt mit dem zurückgegebenen String
		String erlaubt = this.entferneSonderzeichen(rasse);
		// führt den ersten Block aus falls der String aus mindestens fünf Zeichen besteht, ansonsten wird der Zweite Block ausgeführt
		if (erlaubt.length() > 4)
			// setzt das Attribut 'rasse' auf den Wert der Variable 'erlaubt'
			this.rasse = erlaubt;
		else {
			// gibt auf der Konsole den eingefügten String aus
			System.out.println("Die Rasse ist falsch geschrieben!");
		}
	}
	
	/**
	 * Gibt eine Reihe von Strings auf der Konsole aus die das aktuelle Hund-Objekt repräsentieren
	 */
	public void ausgabe() {
		// gibt auf der Konsole den eingefügten String aus
		System.out.println(this.name + " ist ein Hund der Rasse " + this.rasse + ".");
		// gibt auf der Konsole den eingefügten String aus
		System.out.println("Er ist " + this.groesse + " cm gro� und wiegt " + this.gewicht + " kg.");
	}
	
	/**
	 * Gibt auf der Konsole einen String aus der ein Bellen repräsentieren
	 */
	public void bellen() {
		System.out.println("Wuff wuff");
	}

	/**
	 * Gibt auf der Konsole einen String aus der ein Gnurren repräsentiert 
	 */
	public void knurren() {
		System.out.println("GRRRRRR");
	}
	//Diese Methode ist nur eine Hilfsmethode und keine Methode, welche Hunde-Funktionalit�t anbietet.
	//Daher ist sie nicht public, sondern wird mit private versteckt
	private String entferneSonderzeichen(String text) {
		// Deklariert den String 'erlaubt' mit einem leeren String 
		String erlaubt = "";
		// erstellt eine Variable die Hochzählt bis der komplette Text durchgearbeitet wurde
		for (int i = 0, j = 0; i < text.length(); i++)
			if (text.charAt(i) >= 'a' && text.charAt(i) <= 'z') {
				if (j == 0)
					erlaubt += (char) (text.charAt(i) + ('A' - 'a'));//Abstand zwischen A und a als int
				else
					erlaubt += text.charAt(i);
				j++;
			} else if (text.charAt(i) >= 'A' && text.charAt(i) <= 'Z') {
				if (j > 0)
					erlaubt += (char) (text.charAt(i) - ('A' - 'a'));//Abstand zwischen A und a als int
				else
					erlaubt += text.charAt(i);
				j++;
			}
		return erlaubt;
	}
}
