package VjezbaZaIspit;

import java.util.Scanner;

public class cetrnaesti {

	public static void main(String[] args) {

		//Korisnik unosi jedan pozitivan broj.
		// Program treba da provjeri da li je broj savršen broj.
		// Savršeni broj je broj koji je jednak zbiru svojih
		// pozitivnih djelilaca (bez samog sebe).
		// Npr. 6 je savršen broj, 1 + 2 + 3 = 6
		
		Scanner unos = new Scanner (System.in);
		
		System.out.println("Unesite broj");
		
		int pozitivanbroj = unos.nextInt();
		int dijelilacsavrseni= 1;
		int sumasavrsenih = 0;
		
		while (dijelilacsavrseni < pozitivanbroj) {
			
			if (pozitivanbroj % dijelilacsavrseni == 0) {
				
				sumasavrsenih += dijelilacsavrseni;
		
			}dijelilacsavrseni ++;
		}	
			
			if (sumasavrsenih == pozitivanbroj) {
				
				System.out.println("uneseni broj je savrsen");
			
			
		}
		

	}

}
