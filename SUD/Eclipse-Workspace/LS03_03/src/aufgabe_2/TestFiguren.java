package aufgabe_2;

public class TestFiguren {
	
	public static void main(String[] args) {
		Kreis kreis = new Kreis(10.0);
		Rechteck rechteck = new Rechteck(10.0,15.0);
		System.out.println("Radius:" + kreis.getRadius());
		System.out.println("Breite:" + rechteck.getBreite());
		System.out.println("Laenge:" + rechteck.getLaenge());
		System.out.println("Flaeche Kreis:" + kreis.flaeche());
		System.out.println("Umfang Kreis:" + kreis.umfang());
		System.out.println("Umfang Rechteck:" + rechteck.umfang());
		System.out.println("Flaeche Rechteck:" + rechteck.flaeche());
	}
	
}
