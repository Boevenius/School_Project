package fachliche;

import java.util.InputMismatchException;

public class Kfz {
	private int gewicht = 1000;
	private String marke = "Lamborghini";
	private String modelle = "Galardo";
	private int breite = 10;
	private int laenge = 10;
	private int hoehe = 10;
	private String name = "Wolfgang";

	/**
	 * Gibt das gewicht des aktuellen KFZ-Objektes zurueck
	 * 
	 * @return
	 */
	public int getGewicht() {
		return gewicht;
	}

	/**
	 * 
	 * @param gewicht
	 */
	public void setGewicht(int gewicht) throws InputMismatchException {
		if (gewicht < 60) {
			throw new InputMismatchException(
					"ungültiges Gewicht eingegeben, das Gewicht darf nicht kleiner als 60 kg sein");
		} else if (gewicht > 10000) {
			throw new InputMismatchException(
					"ungültiges Gewicht eingegeben, das Gewicht darf nicht groesser als 10000 kg sein");
		} else {
			this.gewicht = gewicht;
		}
	}

	/**
	 * Gibt die marke des aktuellen KFZ-Objektes zurueck
	 * 
	 * @return
	 */
	public String getMarke() {
		return marke;
	}

	/**
	 * 
	 * @param marke
	 */
	public void setMarke(String marke) throws InputMismatchException {

		String erlaubt = StringManipulator.entferneSonderzeichen(marke);

		if (erlaubt.length() < 2) {
			throw new InputMismatchException("Keine gültige Marke eingegeben, bitte noch einmal versuchen.");
		} else {
			this.marke = marke;
		}
	}

	/**
	 * Gibt das modell des aktuellen KFZ-Objektes zurueck
	 * 
	 * @return
	 */
	public String getModelle() {
		return modelle;
	}

	/**
	 * 
	 * @param modelle
	 */
	public void setModelle(String modelle) {
		String erlaubt = StringManipulator.entferneSonderzeichen(modelle);

		if (erlaubt.length() < 5) {
			throw new InputMismatchException("Keine gültiges Modell eingegeben, bitte noch einmal versuchen.");
		} else {
			this.modelle = modelle;
		}

	}

	/**
	 * Gibt die breite des aktuellen KFZ-Objektes zurueck
	 * 
	 * @return
	 */
	public int getBreite() {
		return breite;
	}

	/**
	 * 
	 * @param breite
	 */
	public void setBreite(int breite) throws InputMismatchException {

		if (breite < 991) {
			throw new InputMismatchException(
					"ungültige Breite eingegeben, die Breite darf nicht kleiner als 991 mm sein");
		} else if (breite > 2191) {
			throw new InputMismatchException(
					"ungültige Breite eingegeben, die Breite darf nicht groesser als 2191 mm sein");
		} else {
			this.breite = breite;
		}
	}

	/**
	 * Gibt die laenge des aktuellen KFZ-Objektes zurueck
	 * 
	 * @return
	 */
	public int getLaenge() {
		return laenge;
	}

	/**
	 * 
	 * @param laenge
	 */
	public void setLaenge(int laenge) {
		if (breite < 1321) {
			throw new InputMismatchException(
					"ungültige Laenge eingegeben, die Breite darf nicht kleiner als 1321 mm sein");
		} else if (breite > 6092) {
			throw new InputMismatchException(
					"ungültige Laenge eingegeben, die Breite darf nicht groesser als 6092 mm sein");
		} else {
			this.laenge = laenge;
		}
	}

	/**
	 * Gibt die hoehe des aktuellen KFZ-Objektes zurueck
	 * 
	 * @return
	 */
	public int getHoehe() {
		return hoehe;
	}

	/**
	 * 
	 * @param hoehe
	 */
	public void setHoehe(int hoehe) {
		if (breite < 1003) {
			throw new InputMismatchException(
					"ungültige Hoehe eingegeben, die Hoehe darf nicht kleiner als 1003 mm sein");
		} else if (breite > 2006) {
			throw new InputMismatchException(
					"ungültige Hoehe eingegeben, die Hoehe darf nicht groesser als 2006 mm sein");
		} else {
			this.hoehe = hoehe;
		}
	}

	/**
	 * Gibt den namen des aktuellen KFZ-Objektes zurueck
	 * 
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {

		String erlaubt = StringManipulator.entferneSonderzeichen(modelle);

		if (erlaubt.length() < 1) {
			throw new InputMismatchException("Keine gültigen Namen eingegeben, bitte noch einmal versuchen.");
		} else {
			this.name = name;
		}
	}

}
