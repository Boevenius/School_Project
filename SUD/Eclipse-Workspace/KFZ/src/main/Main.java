package main;

import java.util.List;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import fachliche.Fahrzeug;
import fachliche.Kfz;

public class Main {

	public static void main(String[] args) {

	}

	private static void mainmenu() {
		int eingabe = 0;
		Scanner scanner = new Scanner(System.in);
		List<Fahrzeug> autos = new ArrayList();
		while (eingabe != 4) {
			System.out.println("Willkommen im Hauptmenue!");
			System.out.println("1. neues Auto erstellen");
			System.out.println("2. Werte setzen");
			System.out.println("3. Werte anzeigen");
			System.out.println("4. Beenden");
			System.out.println("Bitte geben sie die gewuenschte Zahl ein");

			switch (eingabe) {
			case 1:
				System.out.println();
				System.out.println("Bitte geben sie die anzahl an Sitzen ein:");
				System.out.println();
				int sitze = scanner.nextInt();
				System.out.println();
				System.out.println("Bitte geben sie die Anschaffungskosten an:");
				System.out.println();
				double anschaffungskosten = scanner.nextDouble();
				System.out.println();
				System.out.println("Bitte geben sie die Maxgeschwindigkeit ein:");
				System.out.println();
				double maxgeschwindigkeit = scanner.nextDouble();
				System.out.println();
				System.out.println("Bitte geben sie die maximale Tankgroesse ein:");
				System.out.println();
				double maxtankgroesse = scanner.nextDouble();
				autos.add(new Fahrzeug(sitze, anschaffungskosten, maxgeschwindigkeit, maxtankgroesse));
				break;
			case 2:
				if (autos.isEmpty()) {
					System.out.println();
					System.out.println(
							"Es wurde noch kein auto erstellt, bitte erstelllen sie zuerst ein Auto ueber das Hauptmenue");
					System.out.println();
				} else {
					System.out.println();
					System.out.println("Die folgenden Autos stehen zur verfuegung:");
					for (int i = 0; i < autos.size(); i++) {
						System.out.println((i + 1) + ". " + autos.get(i).getId());
					}
					System.out.println();
					System.out.println("Bitte wählen sie eines mit der entsprechenden ID aus:");
					System.out.println();
					int id = scanner.nextInt();
					boolean idgefunden = false;
					for (int i = 0; i < autos.size(); i++) {
						if (autos.get(i).getId() == id) {
							idgefunden = true;
						}
					}
					if (idgefunden) {
						System.out.println();
						System.out.println("Bitte wählen sie aus:");
						System.out.println("1. Sitze ein-/ausbauen");
						System.out.println("2. Neue Anschaffungskosten setzen");
						System.out.println("3. Bremsen");
						System.out.println("4. Beschleunigen");
						System.out.println("5. Tanken");
						System.out.println("6. Einsteigen");
						System.out.println("7. Aussteigen");
						System.out.println("8. Zurueck zum Hauptmenue");
						System.out.println();
						try {
							int auswahl = scanner.nextInt();
							switch (auswahl) {
							case 1:
								System.out.println("Bitte neue anzahl Sitze eingeben");
								autos.get(id).setSitze(scanner.nextInt());
								break;
							case 2:
								System.out.println("Bitte neue Anschaffungskosten eingeben");
								autos.get(id).setAnschaffungsKosten(scanner.nextDouble());
								break;
							case 3:
								System.out.println("Bitte Bremskraft eingeben");
								autos.get(id).bremsen(scanner.nextDouble());
								break;
							case 4:
								System.out.println("Bitte Beschleunigungskraft eingeben");
								autos.get(id).beschleunigen(scanner.nextDouble());
								break;
							case 5:
								System.out.println("Bitte Tankmenge eingeben");
								autos.get(id).tanken(scanner.nextInt());
								break;
							case 6:
								System.out.println("Bitte neue anzahl Sitze");
								autos.get(id).setSitze(scanner.nextInt());
								break;
							case 7:
								System.out.println("Bitte neue anzahl Sitze");
								autos.get(id).setSitze(scanner.nextInt());
								break;
							case 8:
								System.out.println();
								System.out.println("Programm beendet");
								System.out.println();
								break;
							default:
								System.out.println();
								System.out.println("Ungueltige Eingabe!");
								System.out.println();
							}
						} catch (Exception e) {
							System.out.println(e.getMessage() + "\n Zurueck zum Haupmenue");
						}
					} else {
						System.out.println();
						System.out.println("ungültige ID eingegeben!");
						System.out.println();
					}
				}
				break;
			case 3:
				if (autos.isEmpty()) {
					System.out.println();
					System.out.println(
							"Es wurde noch kein auto erstellt, bitte erstellen sie zuerst ein Auto ueber das Hauptmenue");
					System.out.println();
				} else {
					System.out.println();
					System.out.println("Die folgenden Autos stehen zur verfuegung:");
					System.out.println();
					for (int i = 0; i < autos.size(); i++) {
						System.out.println((i + 1) + ". " + autos.get(i).getId());
					}
				}
				break;
			case 4:
				System.out.println();
				System.out.println("Programm beendet");
				System.out.println();
				break;
			default:
				System.out.println();
				System.out.println("Ungueltige Eingabe!");
				System.out.println();
			}

		}

		try {

		} catch (InputMismatchException e) {

		}

	}
}
