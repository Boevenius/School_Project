package main;

public class LS02_Zahnb�rsten {
	public static void main(String[] args) {
		int menge = 35000;
		String h�rte = "w";
		String grip = "k";
		double summe = 0.0;
		if(menge >= 500 && menge < 20000) {
			if(h�rte == "w" && grip == "k") {
				summe = menge * 2.50 * 0.90;
			}else if(grip == "k") {
				summe = menge * 2.50 * 0.93;
			}else if(h�rte == "w" && (grip == "n" || grip == "g")) {
				summe = menge * 2.50 * 0.94;
			}else if(h�rte == "h" && grip == "n") {
				summe = menge * 2.50 * 0.975;
			}else if(h�rte == "h" && grip == "g") {
				summe = menge * 2.50;
			}else {
				summe = menge *2.50;
			}
		}else if(menge >= 20000) {
			if(h�rte == "w" && grip == "k") {
				summe = menge * 2.50 * 0.85;
			}else if(grip == "k") {
				summe = menge * 2.50 * 0.88;
			}else if(h�rte == "w" && (grip == "n" || grip == "g")) {
				summe = menge * 2.50 * 0.89;
			}else if(h�rte == "h" && grip == "n") {
				summe = menge * 2.50 * 9.025;
			}else if(h�rte == "h" && grip == "g") {
				summe = menge * 2.50 * 9.05;
			}else {
				summe = menge *2.50;
			}
		}else {
			if(h�rte == "w" && grip == "k") {
				summe = menge * 2.50 * 0.95;
			}else if(grip == "k") {
				summe = menge * 2.50 * 0.98;
			}else if(h�rte == "w" && (grip == "n" || grip == "g")) {
				summe = menge * 2.50 * 0.99;
			}else if(h�rte == "h" && grip == "n") {
				summe = menge * 2.50 * 1.025;
			}else if(h�rte == "h" && grip == "g") {
				summe = menge * 2.50 * 1.05;
			}else {
				summe = menge *2.50;
			}
		}
		System.out.println(summe);
	}
}
