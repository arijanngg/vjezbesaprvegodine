package ZadnjePredavanje;

import java.util.Scanner;

public class ZadnjiZadatak {

	public static void main(String[] args) {
		
		
		Scanner ulaz = new Scanner (System.in);
		
		//1. korisnik unosi broj elemenata
		
		System.out.println("Koliko elemenata zelite da unesete?");
		int n = ulaz.nextInt();
		
		
		//2. kreiranje niza duzine n
		int[] niz = new int[n];
		
		//3. unos elemenata
		for (int i = 0; i < n; i++ ) {
			System.out.println( "Unesite elemente sa indeksom" + i + ": ");
			niz[i] = ulaz.nextInt();
		}
		
		//4. ispisati elemente niza
			
			System.out.println("Unijeli ste sledeci niz: ");
			for(int i = 0; i < n; i++) {
			System.out.println(niz[i] + " ");
			
			
			
			
			}	
		}
				
		
		
		
		

	}

