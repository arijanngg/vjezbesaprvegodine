package novi;

import java.util.Scanner;

public class novi5 {

	public static boolean prost(int broj ) {
		
		if ( broj < 2) {
			return false;
		}
		for (int i = 2; i < broj ; i ++) {
			if(broj % i  == 0) {
				return false;
			}
			
			
		}
		
		return true;
	}
	
	public static void podniz(int[] niz, int n) {
		
		int suma = 0;
		System.out.println("prosti brojevi su :");
		for(int i = 0 ; i < n ; i ++) {
			
			if(prost(niz[i])) {
				System.out.println(niz[i] + " ");
			suma += niz[i];
			}
			
		}
		System.out.println("Zbir prostih brojeva je " + suma);
	}
	
	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Unesi broj elemenata");
		int n = sc.nextInt();
		System.out.println("Unesi elemente");
		int[] niz = new int[n];
		for(int i = 0 ; i < n ; i ++) {
			niz[i] = sc.nextInt();
			}
		
		podniz(niz,n);
	}

}
