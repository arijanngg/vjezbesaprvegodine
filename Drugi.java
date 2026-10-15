package VjezbaZaIspit;

import java.util.Scanner;

public class Drugi {

	public static void main(String[] args) {
		
		/*Dato je rastojanje u centimetrima između ulaza u dvije različite kancelarije.
		// Skicirati algoritam (napisati program) koji određuje koliko cijelih metara ima u tom rastojanju. Npr. 324cm imaju 3 metra.*/
		
		Scanner unos = new Scanner (System.in);
		
		System.out.println("Unesite rastojanje u centrimetrima :");
		int rastojanje = unos.nextInt();
		
		int rastojanjeuMetrima = rastojanje/100;
		
		System.out.printf("Rastojanje u metrima je : %d", rastojanjeuMetrima);
		
		
		
		
		
		
		
	}

}
