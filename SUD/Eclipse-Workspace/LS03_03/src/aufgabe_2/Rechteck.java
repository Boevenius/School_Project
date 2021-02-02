package aufgabe_2;


public class Rechteck {
	private double laenge;
	private double breite;
	
	public double umfang() {
		return 2 * laenge + 2 * breite;
	}
	
	public double flaeche() {
		return laenge * breite;
	}

	public double getLaenge() {
		return laenge;
	}

	public void setLaenge(double laenge) {
		if (laenge >= 0.0) {
			this.laenge = laenge;
		}
	}

	public double getBreite() {
		return breite;
	}

	public void setBreite(double breite) {
		if (breite >= 0.0) {
			this.breite = breite;
		}
	}
	
	public Rechteck(double breite, double laenge) {
		this.setBreite(breite);
		this.setLaenge(laenge);
	}
}
