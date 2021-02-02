package aufgabe_2;

public class Kreis {
	private double radius;
	
	public double umfang() {
		return 2 * Math.PI * Math.pow(radius, 2);
	}
	
	public double flaeche() {
		return 2 * Math.PI * radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		if (radius >= 0.0) {
			this.radius = radius;
		}
	}
	
	public Kreis(double radius) {
		this.setRadius(radius);
	}
}
