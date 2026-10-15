package vjezbazaispit;

import java.util.Scanner;

public class SESTI {

	public static void main(String[] args) {

		//Korisnik unosi n-tocifreni broj. Vas zadatak je da pronadjete sumu parnih
		//cifara u tom broju i da pronadjete proizvod neparnih cifara u tom broju.
		
		Scanner sc = new Scanner ( System.in);
		
		System.out.println("Unesite neki broj");
		
		int x = sc.nextInt();
		int xcopy = x;
		
		int sumaparnih = 0;
		int proizvodneparnih= 1;
		
		while (x>0) {
			
		int cifra = x%10;
		if (cifra %2 ==0) {
			sumaparnih += cifra;
		}else {
			proizvodneparnih *= cifra;
		}
		x = x/10;
		}
		System.out.println("Broj parnih je " + sumaparnih +" a proizvod neparnih je " + proizvodneparnih);
		
		
		
		
		
	}

}
