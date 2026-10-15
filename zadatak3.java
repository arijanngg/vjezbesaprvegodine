package vjezbeinfo2;

import java.util.Scanner;

public class zadatak3 {

	
	public static  int zbirkvadrata (int n ) {
		int zbir = 0;
		
		while (n>0) {
			
			int cifra = n % 10; 
			zbir += cifra * cifra; 
			n= n/10;
			
		}
		return zbir;
	}
	
	
	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		
		System.out.println("unesite broj n :" );
		int n = sc.nextInt();
		
		int rezultat = zbirkvadrata (n);
		
		System.out.println("Zbir kvadrata je " + rezultat);
		 
		
		
		
	}

}
