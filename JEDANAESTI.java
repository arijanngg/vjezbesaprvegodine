package ponovnevjezbe;

import java.util.Scanner;

public class JEDANAESTI {

	public static void main(String[] args) {
		
		//Skicirati algoritam (napisati program) kojim se
		// provjerava da li je broj N prost broj.
		//prost broj je broj koji je djeljiv samo sa 1 i sa samim sobom
		
		Scanner sc = new Scanner ( System.in);
		
		System.out.println("unesite broj n ");
		 int broj = sc.nextInt();
		 
		 int djelilac = 2;
		 boolean indikator = true;
		 
		 
		 
		 while (djelilac < broj && indikator) {
			 
			 if (broj % djelilac == 0) {
				 
				 indikator = false ;
				 
				 
			 }
			  djelilac ++;
			  
		 }
		 
		 if (indikator) {
			 
			 System.out.println("Broj je broj");
			 
			 
		 }else {
		 System.out.println("Broj nije prost");
		 }

	}

}
