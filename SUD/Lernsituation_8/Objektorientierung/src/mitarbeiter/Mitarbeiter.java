package mitarbeiter;

public abstract class Mitarbeiter {
	protected int id;
	private String name;
	
	public Mitarbeiter(int id, String name) {
		setId(id);
		setName(name);
	}
	
	protected abstract void setId(int id);
	
	public int getId() {
		return id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return this.id + " " + this.name;
	}
	
	public abstract double einkommen();
}
