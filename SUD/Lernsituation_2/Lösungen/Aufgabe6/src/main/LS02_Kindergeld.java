package main;

public class LS02_Kindergeld {

	public static void main(String[] args) {
		int einkommen = 0;
		int kinder = 0;
		int geld = 0;
		if(einkommen < 45000) {
			if(kinder == 1) {
				geld += 70;
			}else if(kinder == 2) {
				geld += 70;
				geld += 130;
			}else if(kinder == 3) {
				System.out.println("Wieso hab ich drei Kinder und kein Geld.");
				geld += 70;
				geld += 130;
				geld += 220;
			}else if(kinder > 3){
				geld += 70;
				geld += 130;
				geld += 220;
				geld += 240 * (kinder - 3);
			}else {
				System.out.println("Juhu endlich keine Kinder und drei Geld.");
			}
		}else {
			if(kinder == 1) {
				geld += 70;
			}else if(kinder == 2) {
				geld += 70;
				geld += 70;
			}else if(kinder == 3) {
				System.out.println("Wieso hab ich drei Kinder und kein Geld.");
				geld += 70;
				geld += 70;
				geld += 140;
			}else if(kinder > 3){
				geld += 70;
				geld += 70;
				geld += 140;
				geld += 140 * (kinder - 3);
			}else {
				System.out.println("Juhu endlich keine Kinder und drei Geld.");
			}
		}
		
		if(kinder != 0 && geld != 0) {
			System.out.println("Sie haben " + kinder + " kinder und bekommen " + geld + "€");
		}
	}

}
