package ponovnevjezbe;

import java.util.Scanner;

public class dvadesetpet {

	public static void main(String[] args) {

		//Napisati program koji provjerava da li string počinje zadatim podstringom. Primjer:program, pro → počinje
		
		
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Unesi string");
		String string = sc.nextLine();
		System.out.println("Unesi podstring");
		String podstring = sc.nextLine();
		
		if ( podstring.charAt(0) == string.charAt(0) && podstring.charAt(1) == string.charAt(1) && podstring.charAt(2) == string.charAt(2) ) {
			
			
			System.out.println("String pocinje podstringom");
			
			
		}else {
			
			
			System.out.println("string ne pocinje podstringom");
		}
		
		
		
		
		
	}

}
