package mitarbeiter;

public class BueroArbeiter extends Mitarbeiter {

	private double festgehalt;
	
	public BueroArbeiter(int id, String name, double festgehalt) {
		super(id, name);
		this.festgehalt = festgehalt;
	}

	@Override
	protected void setId(int id) {
		if(id > 4999 && id < 6000) {
			this.id = id;
		}
	}

	@Override
	public double einkommen() {
		return festgehalt;
	}

}
