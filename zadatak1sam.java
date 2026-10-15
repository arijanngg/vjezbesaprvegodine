package vjezbeinfo2;

import java.util.Scanner;

public class zadatak1sam {

	public static int faktorijel ( int n) {
		
		int f = 1 ;  
		
		for ( int i = 1 ; i <= n ; i ++) {
			f *= i ;
			
			}
		
		return f ;
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Unesite broj nagrada n :" );
		
		int n = sc.nextInt();
		
		if (n<0) {
			
			System.out.println("Broj mora biti pozitivan" );
		}else {
			
			int rezultat = faktorijel(n);
			
			System.out.println("Broj mogucih kombinacija je " + rezultat);
			
		}
		
		
		
		
		
		
		
	}

}
