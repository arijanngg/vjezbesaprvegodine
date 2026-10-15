package ponovnevjezbe;

import java.util.Scanner;

public class dvadesettri {

	public static void main(String[] args) {

		/*Napisati program koji uneseni string ispisuje unazad.*/
		
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Unesi string");
		String stari = sc.nextLine();
		String novi= " ";
		
		
		for (int i = stari.length() - 1; i >= 0; i--) {
			
			char c = stari.charAt(i);
			novi += c;
			
			
		}
		
		
		System.out.println("Novi string je :" + novi );
	}

}
