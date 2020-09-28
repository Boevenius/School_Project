package main;

public class LS02_Monatsumwandlung {

	public static void main(String[] args) {
		int monat = 3;
		String sMonat = "";
		switch(monat) {
			case 1:
				sMonat = "Januar";
				break;
			case 2:
				sMonat = "Februar";
				break;
			case 3:
				sMonat = "März";
				break;
			case 4:
				sMonat = "April";
				break;
			case 5:
				sMonat = "Mai";
				break;
			case 6:
				sMonat = "Juni";
				break;
			case 7:
				sMonat = "Juli";
				break;
			case 8:
				sMonat = "August";
				break;
			case 9:
				sMonat = "September";
				break;
			case 10:
				sMonat = "Oktober";
				break;
			case 11:
				sMonat = "November";
				break;
			case 12:
				sMonat = "Dezember";
				break;
			default:
				System.out.println("Fehler, Monat existiert nicht. OutOfBoundException!");
				break;
		}
		if(!sMonat.equals("")) {
			System.out.println("Wechsle zu " + sMonat);
		}
	}

}
