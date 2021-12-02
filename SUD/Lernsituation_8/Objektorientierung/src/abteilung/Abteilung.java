package abteilung;

import java.util.List;

import mitarbeiter.Manager;
import mitarbeiter.Mitarbeiter;

public class Abteilung {
	
	private String name;
	private List<Mitarbeiter> mitarbeiter;
	private Manager leiter;
	
	public Abteilung(String name, Manager leiter) {
		setName(name);
		setLeiter(leiter);
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
	
	
	public void setLeiter(Manager leiter) {
		this.leiter = leiter;
	}
	
	public Manager changeLeiter(Manager neuer) {
		this.leiter = neuer;
		return leiter;
	}
	
	public String gehaltsliste() {
		String gehaltsliste = "";
		for(Mitarbeiter mitarbeiter:mitarbeiter) {
			gehaltsliste = gehaltsliste + mitarbeiter.getId() + " " + mitarbeiter.getName() + " " + mitarbeiter.einkommen() + "\n";
		}
		return gehaltsliste;
	}
}
