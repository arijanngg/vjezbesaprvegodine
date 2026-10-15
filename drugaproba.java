package ProbniIspit;

import java.util.Scanner;

public class drugaproba {

	public static void main(String[] args) {

		/* U nizu se nalaze cijene svih proizova jednog marketa. Potrebno
		je napraviti program koji će izračunati koliko novca bi kupac mogao da uštedi
		ako kupi sve proizvoda ali nakon sniženja od x% (x unosite ručno).*/
		
		
		Scanner unos = new Scanner(System.in);
		
		System.out.println("Koliko proizvoda ima?");
		int n = unos.nextInt();
		
		double [] cijene = new double [n];
		
		
		for(int i = 0; i < n; i++) {
			
			System.out.println("Unesi cijenu proizvoda " + (i+1) + ": ");
			
			cijene [i] =unos.nextDouble();
		}
		System.out.println("Unesi procenat snizenja(x): ");
		double x = unos.nextDouble();
		
		double starasuma= 0.0;
		for (int i = 0; i <n; i++) {
			
			starasuma+=cijene [i];
		}
		double faktor = (100 - x) / 100;
		double novasuma = starasuma * faktor;
		double usteda = starasuma - novasuma;
		
		
		System.out.println(" Ukupna stara cijena je :" + starasuma);
		System.out.println("Ukupna nova cijena je :" + novasuma);
		System.out.println("Kupac bi ustedio :" + usteda);
		
	}

}
