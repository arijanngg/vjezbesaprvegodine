package teski;

import java.util.Scanner;

public class teski28 {

	public static void main(String[] args) {
		
		
		
Scanner sc = new Scanner (System.in);
		
		
		System.out.println("Unesite broj elemenata");
		int n = sc.nextInt();
		int niz [] = new int [n] ; 
		
		
		System.out.println("Unesite elemente");
		for ( int i = 0 ; i < n ; i ++) {
			niz [i] = sc.nextInt();
		}
		
		
		System.out.println("Unesite broj elemenata");
		int b = sc.nextInt();
		int nizz [] = new int [b] ; 
		
		
		System.out.println("Unesite elemente");
		for ( int i = 0 ; i < b ; i ++) {
			nizz [i] = sc.nextInt();
		}
		
		
		System.out.println("zajednicki elementi su " );
		for ( int i = 0 ; i < n ; i ++) {
			for (int j = 0 ; j < b ; j ++) {
				
				if (niz[i] == nizz [j]) {
					
					System.out.println(niz [i] + " ");
				
					
				}
				
			}
			
			
		}
		
		

	}

}
