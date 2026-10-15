package vjezbazaispit;

import java.util.Scanner;

public class DEVETI {

	public static void main(String[] args) {

		// Date su cijene tri proizvoda.
		// Skicirati algoritam (napisati program) koji treba da
		// nađe par proizvoda čija cijena u zbiru daje najmanju vrijednost.
		// Pretpostaviti da su cijene svih proizvoda razlicite.
		
		Scanner sc= new Scanner (System.in);
		
		System.out.println("Unesite cijenu proizvoda 1");
		int cijena1=sc.nextInt();
		System.out.println("Unesite cijenu proizvoda 2");
		int cijena2 = sc.nextInt();
		System.out.println("Unesite cijenu proizvoda 3");
		int cijena3= sc.nextInt();
		
		int cijena12 = cijena1 + cijena2;
		int cijena13= cijena1 + cijena3;
		int cijena23 = cijena2 + cijena3;
		
		
		if (cijena12 >cijena13 ) {
			
			if (cijena13<cijena23 ) {
				
				System.out.println("najmanja cijena je zbir  " + cijena13 );
			} else {
				
				System.out.println("najmanja cijena je zbir "+ cijena23);
				
			}
		}else if (cijena12<cijena23 ) {
			
			System.out.println("najmanja cijena je zbir " + cijena12);
		}else {
			System.out.println("Najmanja cijena je zbir " + cijena23);
		}
	
		
		
		
	}

}
