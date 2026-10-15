package teski;

import java.util.Scanner;

public class teski1 {

	public static void main(String[] args) {

		//stampati parne iz niza 
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Unesi broj eleemenata");		
		int n = sc .nextInt();
		int niz [] = new int [n];
		
		
		System.out.println("Unesi elemente niza");
		for ( int i = 0 ; i < n ; i ++) {
			niz [i] = sc.nextInt();
		}
		
		
		
		System.out.println("parni Elementi niza su");
		for ( int i = 0 ; i < n ; i ++) {
			if (niz [i] % 2 == 0) {
			System.out.print( niz [i] + " ");
			}
		}
		
		
	}

}
