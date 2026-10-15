package nizovi;

import java.util.Scanner;

public class karim4 {

	public static void main(String[] args) {
		/*ata je lista koja sadrži broj posjeta za poslednjih deset fudbalskih utakmica.
		Napisati program koji štampa koliko je bilo najviše posjeta u jednom danu. */
		
		
		Scanner sc = new Scanner ( System.in);
		
		System.out.println("Unesi broj utakmica");
		int n = sc.nextInt();
		int niz [] = new int [n];
		
		System.out.println("Unesi ljude na utakmicama");
		for ( int i = 0 ; i < n ; i ++) {
			
			niz [i] = sc.nextInt();
			
		}
		
		int najvecavrijednost = niz [0];
		for ( int i = 0 ; i < n ; i ++) {
			
			if(niz[i] > najvecavrijednost) {
				
				najvecavrijednost = niz[i];
				
			}
		}
		
		System.out.println("najveca vrijednost je " + najvecavrijednost);

	}

}
