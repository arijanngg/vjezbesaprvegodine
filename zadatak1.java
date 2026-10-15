package zadaciinfo2trecidio;

import java.util.Scanner;

public class zadatak1 {

	public static int tombola (int n ) {
		
		int rezultat = 1 ; 
		
		for ( int i = 1 ; i <= n ; i ++) {
			
			rezultat *= i ; 
			
			
		
		}
		System.out.println("Broj nagrada je " + rezultat);
		return rezultat ;
		
	}
	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Unesite broj nagrada ");
		int x = sc.nextInt();
		
		tombola (x);
	}

}
