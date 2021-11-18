package abteilung;

import java.util.List;

import mitarbeiter.Mitarbeiter;

public class Abteilung {
	
	private String name;
	private List<Mitarbeiter> mitarbeiter;
	
	public Abteilung(String name, String leiter ) {
		setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Mitarbeiter> getMitarbeiter() {
		return mitarbeiter;
	}
	
	public void add(Mitarbeiter neuer) throws Exception{
		for(int i = 0; i < mitarbeiter.size(); i++) {
			if(mitarbeiter.get(i).getId() == neuer.getId()) {
				throw new Exception("Mitarbeiter bereits vorhanden");
			}
		}
		mitarbeiter.add(neuer);
	}
	
	public void remove(Mitarbeiter welcher) throws Exception{
		if(!mitarbeiter.remove(welcher)) {
			throw new Exception("Mitarbeiter ist nicht vorhanden.");
		}
	}
}
