package nizovi;

import java.util.Scanner;

public class karimov {

	public static void main(String[] args) {
		/*Kreirati program koji nalazi platu zaposlenog koji ima drugo najveće primanje.
Npr. ako je niz plata = [540,690, 900] rezultat je 690. Napomena: lista ima bar 2
elementa.*/

		
		Scanner sc = new Scanner ( System.in);
		
		System.out.println("Unesi broj plata");
		int n = sc.nextInt();
		
		int niz [] = new int [n];
		
		System.out.println("Unesi plate");
		for (int i = 0 ; i < n; i ++) {
			niz [i] = sc.nextInt();
			}
		
		int najvecaplata = niz [0];
		for (int i = 0 ; i < n ; i ++) {
			if ( niz [i] > najvecaplata) {
				
				najvecaplata = niz [i];
			}
			
		}
		
		int druganajveca = niz [1];
		
		for ( int i = 0 ; i < n ; i ++) {
			
			if ( niz [i] < najvecaplata & niz [i] > druganajveca) {
				
				druganajveca = niz[i];
			}
			
		}
		
		System.out.println("srednja plata niza je " + druganajveca);
		
			
			
		
		
	
	
	
	}
	

}
