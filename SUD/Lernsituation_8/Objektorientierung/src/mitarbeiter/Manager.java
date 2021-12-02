package mitarbeiter;

public class Manager extends BueroArbeiter {
	
	private double bonusSatz;
	
	public Manager(int id, String name, double festgehalt, double bonusSatz) {
		super(id, name, festgehalt);
		this.bonusSatz = bonusSatz;
	}
	
	@Override
	public double einkommen() {
		return super.einkommen() + berechneBonus();
	}
	
	@Override
	protected void setId(int id) {
		if(id > 4999 && id < 5100) {
			this.id = id;
		}
	}
	
	public double berechneBonus() {
		return super.einkommen() * bonusSatz;
	}
}
