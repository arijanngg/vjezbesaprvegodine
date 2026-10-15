package ponovnevjezbe;

import java.util.Scanner;

public class DRUGII {

	public static void main(String[] args) {

		// Dato je rastojanje u centimetrima između ulaza u dvije različite kancelarije.
		// Skicirati algoritam (napisati program) koji određuje koliko cijelih metara
		// ima u tom rastojanju. Npr. 324cm imaju 3 metra.
		
		Scanner sc = new Scanner ( System.in);
		
		System.out.println("Unesite rastojanje u centimetrima");
		int rastojanjeucm = sc.nextInt();
		
		int rastojanjeum = rastojanjeucm / 100;
		
	System.out.println("rastojanjeu  metrima je " + rastojanjeum);
	
		
		
		
		
		
		
		
	}

}
