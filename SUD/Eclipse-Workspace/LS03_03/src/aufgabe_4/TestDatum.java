package aufgabe_4;

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
	}
}
