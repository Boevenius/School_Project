package fachliche;

import java.util.InputMismatchException;

public class Fahrzeug {

	private int sitze = 1;
	private int aktuellePersonen = 0;
	private final double MAXTANKGROESSE;
	private double tankinhalt = 0;
	private double aktuelleGeschwindigkeit = 0.0;
	private final double MAXGESCHWINDIGKEIT;
	private double anschaffungsKosten;
	private static int ids = 0;
	private int id;

	public Fahrzeug(int sitze, double anschaffungsKosten, double MAXGESCHWINDIGKEIT, double MAXTANKGROESSE) {
		super();
		if (sitze < 1) {
			throw new InputMismatchException("Es muss mindestens ein Sitz vorhanden sein!");
		} else {
			this.sitze = sitze;
		}
		if (anschaffungsKosten < 1.0) {
			throw new InputMismatchException("Der minimale Kaufpreis ist 1€");
		} else {
			this.anschaffungsKosten = anschaffungsKosten;
		}
		if (MAXGESCHWINDIGKEIT < 1.0) {
			throw new InputMismatchException("Die minimale Maxgeschwindigkeit ist 1 km/h");
		} else {
			this.MAXGESCHWINDIGKEIT = MAXGESCHWINDIGKEIT;
		}
		if (MAXTANKGROESSE < 1.0) {
			throw new InputMismatchException("Der Tank muss mindestens 1 Liter fassen");
		} else {
			this.MAXTANKGROESSE = MAXTANKGROESSE;
		}
		id = ids++;
	}

	public int getSitze() {
		return sitze;
	}

	public void setSitze(int sitze)  throws InputMismatchException{
		if (sitze < 1) {
			throw new InputMismatchException("Es muss mindestens ein Sitz vorhanden sein!");
		} else if(aktuellePersonen != 0){
			throw new InputMismatchException("Es müssen zuerst alle Personen aussteigen!");
		}else {
			this.sitze = sitze;
		}
	}

	public double getAnschaffungsKosten() {
		return anschaffungsKosten;
	}

	public void setAnschaffungsKosten(double anschaffungsKosten) throws InputMismatchException{
		if (anschaffungsKosten < 1.0) {
			throw new InputMismatchException("Der minimale Kaufpreis ist 1€");
		} else {
			this.anschaffungsKosten = anschaffungsKosten;
		}
	}

	public int getAktuellePersonen() {
		return aktuellePersonen;
	}

	public double getMAXTANKGROESSE() {
		return MAXTANKGROESSE;
	}

	public double getTankinhalt() {
		return tankinhalt;
	}

	public double getAktuelleGeschwindigkeit() {
		return aktuelleGeschwindigkeit;
	}

	public double getMAXGESCHWINDIGKEIT() {
		return MAXGESCHWINDIGKEIT;
	}

	public void bremsen(double bremsabzug) {
		if (bremsabzug > aktuelleGeschwindigkeit) {
			aktuelleGeschwindigkeit = 0.0;
		} else if (aktuelleGeschwindigkeit - bremsabzug <= 0.0) {
			aktuelleGeschwindigkeit = 0.0;
		} else {
			aktuelleGeschwindigkeit -= bremsabzug;
		}
	}

	public void beschleunigen(double beschleunigung) throws InputMismatchException{
		if((tankinhalt - (beschleunigung/10.0)) >= 0) {
		if (beschleunigung + aktuelleGeschwindigkeit >= MAXGESCHWINDIGKEIT) {
			aktuelleGeschwindigkeit = MAXGESCHWINDIGKEIT;
		} else {
			aktuelleGeschwindigkeit += beschleunigung;
		}
		}else {
			throw new InputMismatchException("Nicht genug sprit vorhanden");
		}
	}

	public void tanken(int tankmenge) {
		if (tankinhalt + tankmenge > MAXTANKGROESSE) {
			tankinhalt = MAXTANKGROESSE;
		} else {
			tankinhalt += tankmenge;
		}
	}

	public void einsteigen() throws Exception{
		if (aktuellePersonen < sitze) {
			this.aktuellePersonen++;
		}else {
			throw new Exception("Auto ist schon voll");
		}
	}
	
	public void aussteigen() throws Exception{
		if(aktuellePersonen > 0) {
			aktuellePersonen--;
		}else {
			throw new Exception("Keine Personen im Auto");
		}
	}
	
	public int getId() {
		return id;
	}
}
