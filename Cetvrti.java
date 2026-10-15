package VjezbaZaIspit;

import java.util.Scanner;

public class Cetvrti {

	public static void main(String[] args) {
		/*Parking servis glavnog grada posluje 24h. Parking se naplacuje u dvije tarife i to:dnevna tarifa od 8:00 do 20:00h
		nocna tarifa od 20:00h, do 8:00h//dnevna tarifa se naplacuje 1.5 e po satu, dok se nocna naplacuje 0.5e po satu.
		Na standardnom ulazu programa, unose se dvije vrijednosti:Prva vrijednost predstavlja sat ulaska vozila na parking.
		Druga vrijednost predstavlja sat izlaska vozila sa parkinga.Pretpostaviti da su vrijednosti sati cijeli brojevi.
		Obracunati cijenu parkinga za date unose. Ukoliko je cijena parkinga veca od 10e,korisnik parkinga placa tacno 10e.*/

		
		Scanner unos = new Scanner (System.in);
		
		System.out.println("Unesite sat ulaska");
		int ulaznisati= unos.nextInt();
		System.out.println("Unesite sate izlaska");
		int izlaznisati= unos.nextInt();
		
		
		double cijenaparkinga = 0;
		int brSatinaparkingu = 0;
		
		
		if(izlaznisati<ulaznisati ) {
			
			brSatinaparkingu = izlaznisati + (24-ulaznisati);
			
			
		}else if (ulaznisati>izlaznisati) {
			
			brSatinaparkingu = ulaznisati - izlaznisati;
			}else {
				
				System.out.println(" Parking je besplatan");
			}
		
		int pomocnisati = unos.nextInt();
		while (pomocnisati>0) {
			
			if(ulaznisati>= 8 && ulaznisati <20 ) {
				
				cijenaparkinga += 1.5;
				
			}else { 				//svudje pise da je besplatan parking
				
				cijenaparkinga += 0.5;
				}
			
			pomocnisati --;
			ulaznisati ++;
			}
		
		if(cijenaparkinga >10) {
			
			cijenaparkinga=10;
		}
		
		System.out.println("auto je na parkingu bilo :" + brSatinaparkingu + " a cijena parkinga iznosi :" + cijenaparkinga);
		
	}

}
