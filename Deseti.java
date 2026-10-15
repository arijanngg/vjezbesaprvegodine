package VjezbaZaIspit;

import java.util.Scanner;

public class Deseti {

	public static void main(String[] args) {
		//Skicirati algoritam (napisati program) kojim se
		// provjerava da li je broj N prost broj.
		//prost broj je broj koji je djeljiv samo sa 1 i sa samim sobom
		
		Scanner unos = new Scanner (System.in);
		
		System.out.println("Molimo vas unesite cijeli broj");
		int n = unos.nextInt();
		
		int dijelilac = 2;
		boolean indikator = true;
		
		while (dijelilac < n && indikator ) {
			
			if (n%dijelilac==0) {
			indikator = false;
			}
			dijelilac ++;
		}
		
		if (indikator == true ) {
			System.out.println("Broj je prost");
		} else {
			System.out.println(" broj nije prost");
		}
		
	}

}
