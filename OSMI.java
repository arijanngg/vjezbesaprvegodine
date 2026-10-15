package vjezbazaispit;

import java.util.Scanner;

public class OSMI {

	public static void main(String[] args) {
		// Skicirati algoritam (napisati program) koji računa X**n
		// koristeći petlju (bez operatora za stepenovanje)
		
		Scanner sc = new Scanner ( System.in);
		
		System.out.println("unesite broj");
		int x = sc.nextInt();
		
		System.out.println("Unesite stepen");
		int n = sc.nextInt();
		
		
		int novibroj = 1;
		
		while (n > 0) {
			novibroj *= x;
		n--;
		
			
		}
		
		System.out.println("stepenovan broj je " + novibroj);	
		
		
		
	}

}
