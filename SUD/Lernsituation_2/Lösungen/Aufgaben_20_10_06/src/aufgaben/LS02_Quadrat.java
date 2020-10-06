package aufgaben;

import java.util.Scanner;

public class LS02_Quadrat {

	public void quadrat() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Wie Groﬂ soll das Quadrat werden?");
		int groesse = scanner.nextInt();
		for (int i = 0; i < groesse; i++) {
			for (int a = 0; a < groesse; a++) {
				if ((i != 0 && i != groesse - 1) && (a != 0 && a != groesse - 1)) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		scanner.close();
	}
}
