package teski;

import java.util.Scanner;

public class teski24 {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner (System.in);
		
		
		System.out.println("Unesite broj elemenata");
		int n = sc.nextInt();
		int niz [] = new int [n] ; 
		
		
		System.out.println("Unesite elemente");
		for ( int i = 0 ; i < n ; i ++) {
			niz [i] = sc.nextInt();
			
		}
		int brojpozitivnihelemenata= 0;
		System.out.println("unesite x ");
		int x = sc.nextInt();
		
		
		for (int i = 0 ; i < n ; i ++ ) {
			
			if ( niz [i] % 2 == 0) {
				
				niz [i] = niz [i] + x;
				
			}
			
		}
		
		System.out.println("novi niz je ");
		for (int i = 0 ; i < n ; i ++ ) {
			System.out.println(niz[i] + " ");
			
		}
	}

}
