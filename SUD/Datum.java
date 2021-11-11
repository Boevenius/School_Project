package datum;

public class Datum {
	private int tag;
	private int monat;
	private int jahr;

	public void anzeigeFormat() {

	}

	public int alsTage() {
		int temp = 0;
		temp = (jahr - 1) * 365;
		for (int i = 1; i < jahr; i++) {
			if (i % 4 == 0 && i % 100 != 0) {
				temp++;
			}
			if (i % 400 == 0) {
				temp++;
			}
		}

		for (int i = 1; i < monat; i++) {
			switch (i) {
			case 2:
				if(liegtImSchaltjahr()) {
					temp += 29;
				}else {
					temp += 28;
				}
				break;
			case 1, 3, 5, 7, 8, 10, 12:
				temp += 31;
				break;
			case 4, 6, 9, 11:
				temp += 30;
				break;
			}
		}
		temp += tag;
		return temp;
	}

	public boolean liegtImSchaltjahr() {
		if (jahr % 4 == 0 && jahr % 100 != 0) {
			return true;
		} else if (jahr % 100 == 0 && jahr % 400 != 0) {
			return false;
		} else if (jahr % 400 == 0) {
			return true;
		}
		return false;
	}

	public String monatToString() {
		switch (monat) {
		case 1:
			return "Januar";
		case 2:
			return "Februar";
		case 3:
			return "Maerz";
		case 4:
			return "April";
		case 5:
			return "Mai";
		case 6:
			return "Juni";
		case 7:
			return "Juli";
		case 8:
			return "August";
		case 9:
			return "September";
		case 10:
			return "Oktober";
		case 11:
			return "November";
		case 12:
			return "Dezember";
		}

		return null;
	}

	public int monatsTage() {
		switch (monat) {
		case 2:
			if(liegtImSchaltjahr()) {
				return 29;
			}else {
				return 28;
			}
		case 1, 3, 5, 7, 8, 10, 12:
			return 31;
		case 4, 6, 9, 11:
			return 30;
		}
		return -1;
	}

	public Datum(int tag, int monat, int Jahr) {
		this.setJahr(Jahr);
		this.setMonat(monat);
		this.setTag(tag);
	}

	public int getTag() {
		return tag;
	}

	public void setTag(int tag) {
		if (tag >= 0 && tag <= monatsTage()) {
			this.tag = tag;
		}
	}

	public int getMonat() {
		return monat;
	}

	public void setMonat(int monat) {
		if (monat >= 1 && monat <= 12) {
			this.monat = monat;
		}
	}

	public int getJahr() {
		return jahr;
	}

	public void setJahr(int jahr) {
		if (jahr >= 1) {
			this.jahr = jahr;
		}
	}

}
