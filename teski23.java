package teski;

import java.util.Scanner;

public class teski23 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		
		System.out.println("Unesite broj elemenata");
		int n = sc.nextInt();
		int niz [] = new int [n] ; 
		
		int brojpozitivnihelemenata= 0;
		System.out.println("Unesite elemente");
		for ( int i = 0 ; i < n ; i ++) {
			niz [i] = sc.nextInt();
			
		}
		
		for (int i = 0 ; i < n ; i ++) {
			
			if ( niz [i] > 0 ) {
				
				brojpozitivnihelemenata ++;
			}
			
		}
		
		System.out.println("broj pozitivnih elemenata je " + brojpozitivnihelemenata);

			
			
		}

	

}
