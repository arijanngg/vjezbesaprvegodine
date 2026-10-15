package vjezbeinfo2;

import java.util.Scanner;

public class zadatak7 {

	public static boolean prost (int n) {
		
		if (n <= 1 ) return false ;
		for (int i =2 ; i < n ; i ++) {
			
			if (n % i == 0) {
				
				return false ; 
			}
			
		}
		return true;
	}
	
	public static int brojprostih (int[] niz) {
		int brojac = 0;
		
		for (int i = 0; i < niz.length; i ++) {
			if (prost (niz[i])) {
				brojac++;
			}	
		}
		return brojac;
		
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Unesi broj elemenata");
		int n = sc.nextInt();
		
		int[] niz = new int[n];
		
		System.out.println("Unesite elemente niza");
		for (int i = 0 ; i < n ; i ++) {
			niz[i] = sc.nextInt();	
		}
		
		int rezultat = brojprostih(niz);
		
		System.out.println("Broj prostih brojeva je " + rezultat);
		
		
		
	}

}
