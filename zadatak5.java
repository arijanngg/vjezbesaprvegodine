package vjezbeinfo2;

import java.util.Scanner;

public class zadatak5 {

	public static void uvecajparne (int[] niz , int x) {
	
	for ( int i = 0; i < niz.length; i++) {
	
	if (niz[i] % 2 == 0) {
		niz [i] += x;
		
	}	
	}
	}
	public static void main(String[] args) {

	
		Scanner sc = new Scanner (System.in);
		System.out.println("Unesite broj elemenata ");
		int n = sc.nextInt();
		
		int[] niz = new int[n];
			
		System.out.println("Unesite elemente niza ");
		
		for (int i = 0 ; i < n ; i ++) {
			niz [i] = sc.nextInt();
			
		}
		
		System.out.println("unesite vrijednost x ");
		int x = sc.nextInt();
		
		uvecajparne (niz, x );
		System.out.println("Novi niz je :");
		
		for (int i = 0; i < n ; i ++) {
			
			System.out.println(niz[i] + " ");
		}
		
	}

}
