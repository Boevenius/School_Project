package fachliche;

public class StringManipulator {
	
	// Diese Methode ist nur eine Hilfsmethode und keine Methode, welche
	// Hunde-Funktionalit�t anbietet.
	// Daher ist sie nicht public, sondern wird mit private versteckt
	static String entferneSonderzeichen(String text) {
		// Deklariert den String 'erlaubt' mit einem leeren String
		String erlaubt = "";
		// erstellt eine Variable die Hochzählt bis der komplette Text durchgearbeitet
		// wurde
		for (int i = 0, j = 0; i < text.length(); i++)
			if (text.charAt(i) >= 'a' && text.charAt(i) <= 'z') {
				if (j == 0)
					erlaubt += (char) (text.charAt(i) + ('A' - 'a'));// Abstand zwischen A und a als int
				else
					erlaubt += text.charAt(i);
				j++;
			} else if (text.charAt(i) >= 'A' && text.charAt(i) <= 'Z') {
				if (j > 0)
					erlaubt += (char) (text.charAt(i) - ('A' - 'a'));// Abstand zwischen A und a als int
				else
					erlaubt += text.charAt(i);
				j++;
			}
		return erlaubt;
	}
}
