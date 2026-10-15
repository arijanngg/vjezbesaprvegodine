package meow;

import java.util.Scanner;

public class trecizadatak {

	public static void main(String[] args) {
		/*Program treba da uvjeri da li je broj palindrom(da li se cita sa lijeva na desno ili sa desna na lijevo */
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("unesite broj");
		int broj = sc.nextInt();
		int original = broj;
		int obrnuti = 0;
		
		while(broj != 0 );
			int cifra = broj % 10;
		obrnuti = obrnuti * 10 + cifra ;
		broj /= 10;
		
		if (original == obrnuti); {
		System.out.println("Broj je palindrom");
		
		
			System.out.println("broj nije palindrom");
		}
		

	}

}
