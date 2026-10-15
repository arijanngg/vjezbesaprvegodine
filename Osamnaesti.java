package ponovnevjezbe;

import java.util.Scanner;

public class Osamnaesti {

	public static void main(String[] args) {
		/*. Napisati program koji za broj N računa aritmetičku sredinu cifara tog broja*/
	
	Scanner sc = new Scanner (System.in);
	
	System.out.println("Unesi broj");
	int broj = sc.nextInt();
	
	
	int sumacifara = 0;
	int brojcifara = 0;
	
	while ( broj > 0) {
		
		  sumacifara += broj%10 ;
			
		  brojcifara ++;	
		broj /=10;
	}
	
	if (broj == 0) {
		
		System.out.println(" aritmeticka sredina je 0");
	}else {
	
	
	double aritmetickasredina = (double) sumacifara / brojcifara;
	
	System.out.println(" aritmeticka sredina je : " + aritmetickasredina);
	}
	
		
	
	
	
	
	
	
	
	
	
	}

}
