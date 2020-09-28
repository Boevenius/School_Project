package main;

public class LS02_Bustarif {

	public static void main(String[] args) {
		int kilometer = 1000;
		double kosten = 0;
		if(kilometer < 20) {
		kosten = kilometer * 0.28;
		}else if(kilometer < 50) {
			kosten = 20 * 0.28;
			kilometer -= 20;
			kosten += kilometer * 0.25;
		}else {
			kosten = 20 * 0.28;
			kilometer -= 20;
			kosten += 30 * 0.25;
			kilometer -= 30;
			kosten += kilometer * 0.20;
		}
		System.out.printf("Ihre Kosten für die Fahrt sind: %.2f",kosten);
	}
}
