package VjezbaZaIspit;

import java.util.Scanner;

public class sesnaesti {

	public static void main(String[] args) {

		//Potrebno je da vodite mali dnevnik za pređene korake.
		// Za svaki dan treba upisati koliko koraka je napravljeno,
		// ali ne želimo da imamo samo sirove podatke.
		// Potrebno je naglasiti kada je dostignuta minimalna dnevna preporuka,
		// a kada se to nije desilo Dani kada je dostignut minimalni limit
		// je više od 10000 koraka (COUNTIF).
		// Dani za blagu kritiku su oni ispod 5000 koraka,
		// ali za te dane želimo da izračunamo koliki je prosjek ( SUMIF).
		
		
		Scanner unos = new Scanner (System.in);
		
		System.out.println("koliko dana zelite analizirati");
		int n = unos.nextInt();
		
		int danisaviska = 0;
		int danisamanjka = 0;
		int prosjekdanasamanje = 0;
		
		System.out.println("unesite broj koraka za svaki dan");
		for (int i = 1 ; i <= n; i++) {
			
			System.out.println("Dan " + i + ":");
			int koraci = unos.nextInt();
			if ( koraci >10000) {
				danisaviska ++;
				
				
			}if (koraci <5000) {
				
				danisamanjka +=koraci;
				prosjekdanasamanje ++;
				
				
			}
			
			
			
		}
		
		double prosjekdanasamanje1 = 0;
		if (prosjekdanasamanje1 > 0) {
			
			prosjekdanasamanje1 = (double) danisamanjka / prosjekdanasamanje;
			
		}
		
		System.out.println("Rezultati");
		System.out.println("dani kada je bilo vise od 10k : " + danisaviska );
		System.out.println("dani kad je bilo manjka : " + prosjekdanasamanje);
	}

}
