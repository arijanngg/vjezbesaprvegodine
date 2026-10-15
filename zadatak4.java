package sortiranje;

import java.util.Scanner;

public class zadatak4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Unesi broj elemenata niza");
		int n = sc.nextInt();
		
		System.out.println("Unesi elemente niza");
		int[]niz = new int [n];
		
		for ( int i = 0 ; i < niz.length; i ++) {
			niz[i] = sc.nextInt();
		}
		
		System.out.println("Niz je ");
	for ( int i = 0 ; i < niz.length; i++) {
		System.out.print(niz[i] + " ");
	}
		
	}

}
