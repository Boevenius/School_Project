package zahlen;

public class Main {

	public static void main(String[] args) {
		Zahlenumwandler zahlenwandler = new Zahlenumwandler();
		zahlenwandler.setDecimal(63);
		System.out.println("Binär: " + zahlenwandler.getBinary());
		System.out.println("Hexal: " + zahlenwandler.getHexal());
		System.out.println("Octal: " + zahlenwandler.getOctal());
	}

}
