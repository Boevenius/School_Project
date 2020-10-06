package aufgaben;

import java.util.Scanner;

public class LS02_Bustarif_neu {

	public void bustarifRechern() {
		Scanner scanner = new Scanner(System.in);
		String weiter = "ja";
		while (!weiter.equalsIgnoreCase("nein")) {
			System.out.println("Bitte Kilometer eingeben (Integer):");
			int kilometer = scanner.nextInt();
			double kosten = 0;
			if (kilometer < 20) {
				kosten = kilometer * 0.28;
			} else if (kilometer < 50) {
				kosten = 20 * 0.28;
				kilometer -= 20;
				kosten += kilometer * 0.25;
			} else {
				kosten = 20 * 0.28;
				kilometer -= 20;
				kosten += 30 * 0.25;
				kilometer -= 30;
				kosten += kilometer * 0.20;
			}
			System.out.printf("Ihre Kosten für die Fahrt sind: %.2f", kosten);
			System.out.println("Möchten sie weiter rechnen?");
			weiter = scanner.next();
		}
		scanner.close();
	}
}
