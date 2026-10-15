package nizovi;

import java.util.Scanner;

public class karim3 {

	public static void main(String[] args) {
		/* Nacrtati algoritam (napisati program) koji za unijetu listu elemenata (cijeli brojevi,
bez nule) a vraća broj elemenata koji imaju suprotnu vrijednost. Broju x, suprotan
broj je -x. Smatrati da se broj pojavljuje jednom i da nekad ima svoju suprotnu
vrijednost, a nekad nema. Primjer:
Input 1: [1, 2, -1, 3, -3] Output: 2*/
		
		Scanner sc = new Scanner ( System.in);
		System.out.println("Unesi broj elemenata");
		int n = sc.nextInt();
		int niz [] = new int [n];
		
		
		System.out.println("Unesi elemente ");
		for ( int i = 0 ; i < n ; i ++ ) {
			niz [i] = sc.nextInt();
		}
		int brojsuprotnih = 0 ; 
		
		
		for ( int i = 0 ; i < n ; i ++) {
			for ( int j = i + 1 ; j  < n ; j ++) {
			if ( niz[i] == - niz[j]  ) {
				
				brojsuprotnih ++;
				
			}
			
			}
		}
		
		System.out.println("Ukupan broj suprotnih brojeva je " + brojsuprotnih);
		
	}

}
