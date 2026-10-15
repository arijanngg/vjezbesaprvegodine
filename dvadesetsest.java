package ponovnevjezbe;

import java.util.Scanner;

public class dvadesetsest {

	public static void main(String[] args) {
		
		//Napisati program koji provjerava da li string završava zadatim podstringom.
		
		
		Scanner sc = new Scanner (System.in);
		System.out.println("napisi string");
		String string = sc.nextLine();
		System.out.println("Unesi podstring");
		String podstring = sc.nextLine();
		
		
		if( string.charAt(string.length()-1) == podstring.charAt(podstring.length()-1) && string.charAt(string.length()-2) == podstring.charAt(podstring.length()-2) && string.charAt(string.length()-3) == podstring.charAt(podstring.length()-3) ) {
			
			
			System.out.println("string se zavrsava podstringom");
			
		}else {
		System.out.println("String se ne zavrsava podstringom");
		
		}
		
		
	}

}
