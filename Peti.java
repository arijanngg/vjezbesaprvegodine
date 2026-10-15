package VjezbaZaIspit;

import java.util.Scanner;

public class Peti {

	public static void main(String[] args) {

		//Dat je trocifren broj.
		// Odrediti broj koji se dobija zamjenom prve i posljednje cifre.
		
		Scanner unos = new Scanner (System.in);
		System.out.println("Unesite trocifren broj: ");
		String trocifrenbroj = unos.next();
		
		String novibroj = " ";
		novibroj = novibroj + trocifrenbroj.charAt(2) + trocifrenbroj.charAt(0) + trocifrenbroj.charAt(1); 
		
		System.out.println("Unijeli ste : " + trocifrenbroj + ", a novi broj je : " + novibroj);
		
		
		
	}

}
