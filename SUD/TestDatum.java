package datum;

public class TestDatum {

	public static void main(String[] args) {
		Datum datum = new Datum(1,1,1);
		System.out.println(datum.alsTage());
		datum = new Datum(1,1,1970);
		System.out.println(datum.alsTage());
		datum = new Datum(29,11,1967);
		System.out.println(datum.alsTage());
		datum = new Datum(15,2,2000);
		System.out.println(datum.alsTage());
		datum = new Datum(1,1,1900);
		System.out.println(datum.alsTage());
		datum = new Datum(15,2,2012);
		System.out.println(datum.alsTage());
		if(datumFuntzt()) {
			System.out.println("Funktioniert!");
		}else {
			System.out.println("Funktioniert nicht...");
		}
	}
	
	private static boolean datumFuntzt() {
		int zahl1 = 0;
		int zahl2 = 0;
		int monatsEnde;
		Datum datum = new Datum(1,1,1);
		for(int c = 1;c <= 9999;c++) {
			datum.setJahr(c);
			for(int b = 1;b <= 12;b++) {
				datum.setMonat(b);
				monatsEnde = datum.monatsTage();
				for(int a = 1;a <= monatsEnde;a++) {
					datum.setTag(a);
					zahl1 = zahl2;
					zahl2 = datum.alsTage();
					System.out.println(a + "." + b + "." + c + " = " + zahl2);
					if(zahl2 - 1 != zahl1) {
						return false;
					}
				}
			}
		}
		return true;
	}
}
