package datum;

public class TestDatum {

	public static void main(String[] args) {
		Datum datum = new Datum(1,1,1);
		System.out.println(datum.alsTage());
		datum = new Datum(1,1,1970);
		System.out.println(datum.alsTage());
		datum = new Datum(29,11,1967);
		System.out.println(datum.alsTage());
		datum = new Datum(15,2,2000);
		System.out.println(datum.alsTage());
		datum = new Datum(1,1,1900);
		System.out.println(datum.alsTage());
		datum = new Datum(15,2,2012);
		System.out.println(datum.alsTage());
		TestDatum datumClass = new TestDatum();
		datumClass.datumFuntzt();
	}
	
	public void datumFuntzt() {
		DatumThread thread1 = new DatumThread(1,2500);
		DatumThread thread2 = new DatumThread(2500,5000);
		DatumThread thread3 = new DatumThread(5000,7500);
		DatumThread thread4 = new DatumThread(7500,10000);
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		while(thread1.isAlive() || thread2.isAlive() || thread3.isAlive() || thread4.isAlive()) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
			}
		}
		if(!thread1.getFunktioniert() || !thread2.getFunktioniert() || !thread3.getFunktioniert() ||!thread4.getFunktioniert()) {
			System.out.println("Funktioniert nicht...");
		}else {
			System.out.println("Funktioniert!");
		}
	}
	
	public class DatumThread extends Thread{
		
		private int minJahr;
		private int maxJahr;
		private boolean funktioniert = true;
		
		public DatumThread(int minJahr, int maxJahr) {
			this.minJahr = minJahr;
			this.maxJahr = maxJahr;
		}
		
		public boolean getFunktioniert() {
			return funktioniert;
		}
		
		@Override
		public void run() {
			Datum datum = new Datum(1,1,minJahr);
			int zahl1;
			int zahl2 = datum.alsTage() -1;
			int monatsEnde;
			for(int c = minJahr;c <= maxJahr;c++) {
				datum.setJahr(c);
				for(int b = 1;b <= 12;b++) {
					datum.setMonat(b);
					monatsEnde = datum.monatsTage();
					for(int a = 1;a <= monatsEnde;a++) {
						datum.setTag(a);
						zahl1 = zahl2;
						zahl2 = datum.alsTage();
						//System.out.println(a + "." + b + "." + c + " = " + zahl2);
						if(zahl2 - 1 != zahl1) {
							funktioniert = false;
							Thread.currentThread().stop();
						}
					}
				}
			}
		}
	}
}
