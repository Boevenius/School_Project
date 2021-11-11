package geometry;

public class Kreis {
	private double radius;
	
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) throws NumberFormatException {
		if(radius < 0.1) {
			throw new NumberFormatException("Keine Negativen Zahlen erlaubt");
		} else {
			this.radius = radius;
		}
	}

	public double umfang() {
		return 2 * Math.PI * radius;
	}
	
	public double flaeche() {
		return Math.PI * Math.pow(radius, 2);
	}
}
