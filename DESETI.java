package vjezbazaispit;

import java.util.Scanner;

public class DESETI {

	public static void main(String[] args) {
		
		//Skicirati algoritam (napisati program) kojim se
		// provjerava da li je broj N prost broj.
		
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Unesite broj");
		int x = sc.nextInt();
		
		
		int djelilac = 2 ;
		boolean indikator  = true;
		
		
		while ( djelilac < x) {
			
			if (x%djelilac ==0) {
				
				indikator = false ;
				
			}
			djelilac ++;
			
		}
		
		if( indikator == true) {
			
			System.out.println("Broj je prost");
		} else {
			
			System.out.println("broj nije prost");
		}
		
		
		
	}

}
