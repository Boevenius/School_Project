package main;

import java.util.List;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import fachliche.Kfz;

public class Main {

	public static void main(String[] args) {

	}

	private static void mainmenu() {
		int eingabe = 0;
		Scanner scanner = new Scanner(System.in);
		List<Kfz> autos = new ArrayList();
		while (eingabe != 4) {
			System.out.println("Willkommen im Hauptmenue!");
			System.out.println("1. neues Auto erstellen");
			System.out.println("2. Werte setzen");
			System.out.println("3. Werte anzeigen");
			System.out.println("4. Beenden");
			System.out.println("Bitte geben sie die gewünschte Zahl ein");

			switch (eingabe) {
			case 1:
				
				break;
			case 2:
				if(autos.isEmpty()) {
					System.out.println();
					System.out.println("Es wurde noch kein auto erstellt, bitte erstelllen sie zuerst ein Auto ueber das Hauptmenue");
					System.out.println();
				}else {
					System.out.println();
					System.out.println("Die folgenden Autos stehen zur verfuegung:");
					for(int i = 0;i < autos.size();i++) {
						System.out.println((i+1) + ". " + autos.get(i).getName());
					}
				}
				break;
			case 3:
				if(autos.isEmpty()) {
					System.out.println();
					System.out.println("Es wurde noch kein auto erstellt, bitte erstelllen sie zuerst ein Auto ueber das Hauptmenue");
					System.out.println();
				}else {
					System.out.println();
					System.out.println("Die folgenden Autos stehen zur verfuegung:");
					for(int i = 0;i < autos.size();i++) {
						System.out.println((i+1) + ". " + autos.get(i).getName());
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
				System.out.println("Ungültige Eingabe!");
				System.out.println();
			}

		}

		try {

		} catch (InputMismatchException e) {

		}

	}
}
