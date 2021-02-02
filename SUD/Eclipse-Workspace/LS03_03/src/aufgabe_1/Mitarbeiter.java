package aufgabe_1;

public class Mitarbeiter {
	private int id;
	private String name;
	
	public Mitarbeiter() {
		
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return getId() + " " +  getName();
	}
	
	
	public static void main(String[] args) {
		Mitarbeiter mitarbeiter = new Mitarbeiter();
		mitarbeiter.setName("Boeven");
		System.out.println(mitarbeiter.getName());
		mitarbeiter.setName("Stefan Boeven");
		System.out.println(mitarbeiter.getName());
		mitarbeiter.setId(712);
		System.out.println(mitarbeiter.getId());
		mitarbeiter.setId(71299);
		System.out.println(mitarbeiter.getId());
		System.out.println(mitarbeiter.toString());
	}
}
