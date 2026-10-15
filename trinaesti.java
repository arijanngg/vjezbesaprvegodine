package VjezbaZaIspit;

import java.util.Scanner;

public class trinaesti {

	public static void main(String[] args) {

		// Program treba da provjeri da li je broj palindrom
		// (da li se isto čita s lijeva na desno i s desna na lijevo).
		// Npr. 121 → palindrom.
		
		Scanner unos = new Scanner (System.in);
		
		System.out.println("Molimo unesite broj");
		String broj = unos.nextLine();
		
		int lijeviindeks = 0;
		int desniindeks= broj.length() - 1;
		
		while (lijeviindeks < desniindeks) {
			
			if (broj.charAt(lijeviindeks) !=broj.charAt(desniindeks)) {
				
				break;
			}
			lijeviindeks ++;
			desniindeks --;
			
			
		}
		
		
		System.out.println("broj nije palindrom");
		
		
		
		
	}

}
