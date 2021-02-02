package aufgabe_3;

public class Punkt {
	private double x = 0;
	private double y = 0;
	
	public void verschieben(double plusX, double plusY) {
		if(x + plusX <= 100.0 && x + plusX >= -100.0) {
			this.x += plusX;
		}
		if(y + plusY <= 100.0 && y + plusY >= -100.0) {
			this.y += plusY;
		}
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}
	
	public Punkt(double x, double y) {
		verschieben(x,y);
	}
}
