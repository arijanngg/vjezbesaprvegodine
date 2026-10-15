package vjezbeinfo2;

import java.util.Scanner;

public class zadatak12 {

	public static void najduzipodniz(int[] niz) {
		
		int trenutnaduzina = 1 ; 
		int maxduzina = 1;
		
		int pocetaktrenutnog = 0;
		int pocetakmax = 0;
		
		
		for (int i = 1; i < niz.length; i ++) {
			
			if (niz [i] > niz [i-1]) {
				
				trenutnaduzina ++;
			}else {
				
				trenutnaduzina = 1;
				pocetaktrenutnog = i;
				
			}
			
			if (trenutnaduzina > maxduzina ) {
				
				maxduzina= trenutnaduzina;
				pocetakmax = pocetaktrenutnog;
			}
			
		}
		
		System.out.println("Najduzi rastuci podniz je " + maxduzina);
		for (int i = pocetakmax; i < pocetakmax + maxduzina; i++) {
		    System.out.print(niz[i] + " ");
		}
	
	}
	
	
	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		System.out.println("Unesi broj elemenata");
		int n = sc.nextInt();
		
		int[] niz = new int[n];
		
		System.out.println("Unesi elemente");
		
		for (int i = 0 ; i < n ; i ++) {
			
			niz[i] = sc.nextInt();
			
		}
			
		najduzipodniz(niz);
			
		
		
		
		
	}

}
