package ponovnevjezbe;

import java.util.Scanner;

public class DVANAESTI {

	public static void main(String[] args) {
		
		//Pronaći indeksnu poziciju poslednjeg razmaka u stringu,
		// pretražujući od kraja stringa. Npr. za
		// unijeto 'Pera ima devojku', rezultat je 8.
		
		Scanner sc = new Scanner ( System.in);
		
		System.out.println("Unesite recenicu");
		String recenica = sc.nextLine();
		
		
		boolean indikator = false ;
		
		int indekskraja = recenica.length() - 1;
		while (indekskraja >=0 && !indikator) {
			
			if (recenica.charAt(indekskraja) == ' ' ) {
				
				indikator= true;
				
			}
			indekskraja --;
			
		}
		
		if (indikator ) {
			System.out.println(" razmak je na poziciji " + indekskraja);
		} else {	
			System.out.println("Nema razmaka u stringu");
	
			
			
			
		}
		
	}

}
