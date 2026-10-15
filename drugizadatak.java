package meow;

import java.util.Scanner;

public class drugizadatak {

	public static void main(String[] args) {
		
		
		/*Korisnik unosi brojeve. Program sabira sve unesene brojeve dok korisnik ne unese 0.
		 * Na kraju ispisati zbir tih brojeva*/
		
		
		
		try (Scanner sc = new Scanner (System.in)) {
			int broj;
			int suma = 0;
			
				
			System.out.println("Unesi broj (0 za kraj):");
			broj = sc.nextInt();
			
			
			while ( broj != 0);
			suma  += broj;
				 broj= sc.nextInt();
				 
			
				 
				 System.out.println("suma je: " + suma);
		}
	}

}
