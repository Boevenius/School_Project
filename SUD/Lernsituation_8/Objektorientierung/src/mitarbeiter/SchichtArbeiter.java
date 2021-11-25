package mitarbeiter;

public class SchichtArbeiter extends Mitarbeiter{
	
	private double stundenSatz;
	private int anzahlStunden;
	
	public SchichtArbeiter(int id, String name, double stundenSatz) {
		super(id, name);
		setStundenSatz(stundenSatz);
	}

	public int getAnzahlStunden() {
		return anzahlStunden;
	}

	public void setAnzahlStunden(int anzahlStunden) {
		if(anzahlStunden > 0) {
			this.anzahlStunden = anzahlStunden;
		}
	}

	public double getStundenSatz() {
		return stundenSatz;
	}

	public void setStundenSatz(double stundenSatz) {
		if(stundenSatz > 0) {
			this.stundenSatz = stundenSatz;
		}
	}
	
	@Override
	public double einkommen() {
		return getStundenSatz() * getAnzahlStunden();
	}
	
	@Override
	public void setId(int id) {
		if(id >= 3000 && id < 4000) {
			this.id = id;
		}
	}
}
