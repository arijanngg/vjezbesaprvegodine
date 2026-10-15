package vjezbazaispit;

import java.util.Scanner;

public class JEDANAESTI {

	public static void main(String[] args) {

		// Pronaći indeksnu poziciju poslednjeg razmaka u stringu,
		// pretražujući od kraja stringa. 
		

		Scanner sc = new Scanner ( System.in);
		
		System.out.println("unesi recenicu");
		
		
		String recenica = sc.nextLine();
		
		boolean indikator = false ;
		
		int indekskraja = recenica.length();
		
		
		while (indekskraja >= 0 && !indikator) {
			
			if (recenica.charAt(indekskraja) == ' ') {
				
				indikator = true;
			}
			indekskraja--;
			
		}
		if (indikator == true) {
			
			System.out.println("Nema razmaka");
		}else {
			
			System.out.println("Razmak je na poziciji " + indekskraja);
		}
	}

}
