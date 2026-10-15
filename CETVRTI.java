package vjezbazaispit;

import java.util.Scanner;

public class CETVRTI {

	public static void main(String[] args) {

		// Dat je trocifren broj.
		// Odrediti broj koji se dobija zamjenom prve i posljednje cifre.
		
		Scanner sc = new Scanner ( System.in);
		
		
		System.out.println("unesite trocifren broj");
		String trocifrenbroj = sc.nextLine();
		
		String novibroj = " ";
		
		novibroj = novibroj + trocifrenbroj.charAt(2) + trocifrenbroj.charAt(1) + trocifrenbroj.charAt(0);
		
		System.out.println("Novi broj je " + novibroj);
		
	}

}
