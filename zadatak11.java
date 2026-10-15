package vjezbeinfo2;

import java.util.Scanner;

public class zadatak11 {

	public static int druginajveci (int[] niz ) {
		
		int max, drugimax;
		
		if (niz[0] > niz [1]) {
			
			max = niz[0];
			drugimax = niz[1];
			
		}else {
			
			max = niz[1];
			drugimax = niz[0];
		}
		
		for (int i = 2 ; i < niz.length; i ++) {
			
			if (niz[i] > max) {
				
				drugimax = max;
				max = niz[i];
				
			}else if (max > niz [i] &&  niz [i]> drugimax ) {
				
				max = max;
				drugimax = niz[i];
				
				
			}
			
		}
		return drugimax;
		
		
	}
 	
	
	public static void main(String[] args) {
		

		Scanner sc = new Scanner (System.in);
		
		System.out.println("Unesite broj elemenata");
		int n = sc.nextInt();
		
		int[] niz = new int[n];
		
		
		System.out.println("unesite elemente");
		for (int i = 0 ; i < n; i ++) {
			niz [i] = sc.nextInt();
			
			
		}

		int rezultat = druginajveci (niz);
		
		System.out.println("drugi najveci je " + rezultat);
		
	}

}
