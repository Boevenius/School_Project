package main;

import java.util.Scanner;

public class LS02_BMI {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bitte Gewicht eingeben: ");
		double gewicht = scanner.nextDouble();
		System.out.println("Bitte H�he eingeben: ");
		double hoehe = scanner.nextDouble()/100;
		double bmi = gewicht / (hoehe*hoehe);
		String bmiS = "";
		int kalorien = 0;
		if(bmi < 18.5) {
			bmiS = "Untergewicht";
			kalorien = 3000;
		}else if(bmi < 25) {
			bmiS = "Normalgewicht";
			kalorien = 2000;
		}else if(bmi < 30) {
			bmiS = "leichtes �bergewicht";
			kalorien = 1800;
		}else if(bmi < 40) {
			bmiS = "starkes �bergewicht";
			kalorien = 1200;
		}else {
			bmiS = "extremes �bergewicht";
			kalorien =  700;
		}
		
		System.out.println("Sie haben " + bmiS + ". \nIhr Kalorienbedarf betr�gt: " + kalorien);
		scanner.close();
	}
}
