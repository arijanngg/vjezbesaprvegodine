package VjezbaZaIspit;

import java.util.Scanner;

public class sedmi {

	public static void main(String[] args) {
		//Korisnik unosi n-tocifreni broj. Vas zadatak je da pronadjete sumu parnih
		//cifara u tom broju i da pronadjete proizvod neparnih cifara u tom broju.
		
		Scanner unos = new Scanner (System.in);
		
		System.out.println("Unesite n-tocifreni broj");
		int n = unos.nextInt();
		int n_copy= n;
		int sumaparnih = 0;
		int proizvodneparnih = 1;
		
		while (n>0 ) {
			
			int cifra = n%10;
			if ( cifra % 2 == 0) {
				sumaparnih += cifra; 
				
			}else {
				
				proizvodneparnih *= cifra;
				
					
			}
			
			n = n/10;
		}
		
		
		System.out.println("Suma parnih brojeva u n broju je : " + sumaparnih + " a proizvod neparnih je :" + proizvodneparnih);
		
		
		
	}

}
