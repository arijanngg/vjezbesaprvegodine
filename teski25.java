package teski;

import java.util.Scanner;

public class teski25 {

	public static void main(String[] args) {
		
		
	Scanner sc = new Scanner (System.in);
		
		
		System.out.println("Unesite broj elemenata");
		int n = sc.nextInt();
		int niz [] = new int [n] ; 
		
		
		System.out.println("Unesite elemente");
		for ( int i = 0 ; i < n ; i ++) {
			niz [i] = sc.nextInt();
		}
		
		int suma = 0;
		int broj = 0;
		
		
		for ( int i = 0 ; i < n ; i ++ ) {
			
			if ( niz [i] % 2 ==0 && niz [i] < 0 ) {
				
				suma += niz [i];
				
				
				
			}
			
		}
		
		suma = - suma ; 
		
		System.out.println("apsolutna suma je " + suma);

		
		
	}

}
