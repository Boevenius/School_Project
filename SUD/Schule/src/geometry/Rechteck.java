package geometry;

public class Rechteck {
	private double laenge;
	private double breite;
	
	public double getLaenge() {
		return laenge;
	}

	public void setLaenge(double laenge) {
		if(laenge < 0.1) {
			throw new NumberFormatException("Keine negativen Zahlen erlaubt");
		} else {
			this.laenge = laenge;
		}
	}

	public double getBreite() {
		return breite;
	}

	public void setBreite(double breite) {
		if(breite < 0.1) {
			throw new NumberFormatException("Keine negativen Zahlen erlaubt");
		} else {
			this.breite = breite;
		}
	}

	public double umfang() {
		return (2 * laenge) + (2 * breite);
	}
	
	public double flaeche() {
		return laenge * breite;
	}
}
