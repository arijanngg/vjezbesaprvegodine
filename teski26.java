package teski;

import java.util.Scanner;

public class teski26 {

	public static void main(String[] args) {
	
Scanner sc = new Scanner (System.in);
		
		
		System.out.println("Unesite broj elemenata");
		int n = sc.nextInt();
		int niz [] = new int [n] ; 
		
		
		System.out.println("Unesite elemente");
		for ( int i = 0 ; i < n ; i ++) {
			niz [i] = sc.nextInt();
		}
		int najveci = niz [0];
		
		for ( int i = 0  ; i < n ; i ++) {
			
			if (niz [i] > najveci ) {
				
				najveci = niz [i] ;
					}
			}
		
		int druginajveci = niz [0];
		for ( int j = 0  ; j < n ; j ++) {
			
			if ( niz [j] < najveci && niz [j] > niz [0] ) {
				
				
				druginajveci = niz[j];
			}
			}
		
		System.out.println("drugi najveci je " + druginajveci);
		
	}

}
