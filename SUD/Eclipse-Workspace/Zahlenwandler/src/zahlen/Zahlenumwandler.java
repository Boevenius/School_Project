package zahlen;

public class Zahlenumwandler {
	
	private int decZahl;
	private String binZahl;
	private String octZahl;
	private String hexZahl;
	
	public Zahlenumwandler(){
		
	}
	
	public int getDecimal() {
		return decZahl;
	}
	
	public String getBinary() {
		return binZahl;
	}
	
	public String getOctal() {
		return octZahl;
	}
	
	public String getHexal() {
		return hexZahl;
	}
	
	public void setDecimal(int zahl) {
		decZahl = zahl;
		convertFromDecimal();
	}
	
	public void setBinary(String zahl) {
		binZahl = zahl;
		convertFromBinary();
	}
	
	public void setOctal(String zahl) {
		octZahl = zahl;
		convertFromOctal();
	}
	
	public void setHexal(String zahl) {
		hexZahl = zahl;
		convertFromHexal();
	}
	
	private void convertFromDecimal() {
		int temp = decZahl;
		StringBuilder ausgabe = new StringBuilder();
		while(temp!=0){
			ausgabe.append(temp%2);
			temp = temp/2;
		}
		binZahl = ausgabe.reverse().toString();
		temp = decZahl;
		ausgabe.delete(0,ausgabe.length());
		while(temp!=0){
			ausgabe.append(temp%8);
			temp = temp/8;
		}
		octZahl = ausgabe.reverse().toString();
		temp = decZahl;
		ausgabe.delete(0,ausgabe.length());
		while(temp!=0){
			if(temp%16 < 10) {
			ausgabe.append(temp%16);
			}else if(temp%16 == 10){
				ausgabe.append("A");
			}else if(temp%16 == 11){
				ausgabe.append("B");
			}else if(temp%16 == 12){
				ausgabe.append("C");
			}else if(temp%16 == 13){
				ausgabe.append("D");
			}else if(temp%16 == 14){
				ausgabe.append("E");
			}else if(temp%16 == 15){
				ausgabe.append("F");
			}
			temp = temp/16;
		}
		hexZahl = ausgabe.reverse().toString();
	}

	private void convertFromBinary() {
		
	}
	
	private void convertFromOctal() {
		
	}
	
	private void convertFromHexal() {
		
	}
}
