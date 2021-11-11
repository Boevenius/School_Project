package geometry;

public class Punkt {
	private double x = 0;
	private double y = 0;
	
	public void verschiebe(double plusX, double plusY) {
		if(plusX + x > 100 || plusX + x < -100 || plusY + y > 100 || plusY + y < -100) {
			throw new NumberFormatException("Punkt liegt ausserhalb des Koordinatensystem");
		} else {
			x += plusX;
			y += plusY;
		}
	}
}
