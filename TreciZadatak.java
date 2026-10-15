package proba;

import java.util.Scanner;

public class TreciZadatak {

	public static void main(String[] args) {
		
		/*Dat je sestocireni broj n(n = abcdef)
		 * Provjeriti da li vazi a * c + 2 + f = b+d*e*/
		
		
		Scanner ulaz = new Scanner ( System.in);
		
		int sestocifreni_broj = ulaz.nextInt();
		
		int f = sestocifreni_broj % 10;
		int e = (sestocifreni_broj  / 10 ) % 10;
		int d = (sestocifreni_broj  / 100 ) % 10; 
		int c = (sestocifreni_broj  / 1000 ) % 10;
		int b = (sestocifreni_broj  / 10000 ) % 10;
		int a = (sestocifreni_broj  / 100000 ) % 10;
		
		
		if(a * c + 2 + f == b+d*e) {
			System.out.println("Tacno");
		} else {
			System.out.println("Nije tacno");
		}
		
		
		
		
		
		
		
		
	}

}
