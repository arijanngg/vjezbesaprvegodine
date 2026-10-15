package teski;

import java.util.Scanner;

public class teski27 {

	public static void main(String[] args) {
		
		
Scanner sc = new Scanner (System.in);
		
		
		System.out.println("Unesite broj elemenata");
		int n = sc.nextInt();
		int niz [] = new int [n] ; 
		
		
		System.out.println("Unesite elemente");
		for ( int i = 0 ; i < n ; i ++) {
			niz [i] = sc.nextInt();
		}
		
		double suma = 0;
		
		for ( int i = 0 ; i < n ; i ++) {
			
			if ( niz [i] > 0) {
				
				suma += niz [i];
			}
			
		}
		
		System.out.println("unesite popust");
		double popust = sc.nextDouble();
		
		double faktor = (100 - popust) /100.00;
		
		double sumaposlepopusta = (double) suma * faktor ; 

		double usteda = suma - sumaposlepopusta;
		
		System.out.println("ustedjelo se " + usteda);
		
		
	}

}
