package Vjeybe;

import java.util.Scanner;

public class drugi {

	public static void main(String[] args) {

		//Korisnik unosi n-tocifreni broj. Vas zadatak je da pronadjete sumu parnih cifara u tom
		//broju i da pronadjete proizvod neparnih cifara u tom broju.
		
		Scanner sc = new Scanner ( System.in);
		
		System.out.println("unesi neki broj");
		
		int n = sc.nextInt();
		
		
		int sumaparnih= 0;
		int proizvodneparnih = 1;
		
		while (n>0) {
			
			int cifra = n%10;
			if (n%2 == 0) {
				
				sumaparnih += cifra;
				
			}else {
			
				proizvodneparnih *= cifra;
				
			}
			n = n/10;
		}
		
		
		System.out.println("Suma parnih je " + sumaparnih + " a proizvod neparnih je " + proizvodneparnih );
		
	}

}
