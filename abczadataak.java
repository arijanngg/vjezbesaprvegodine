package ProbniIspit;

import java.util.Scanner;

public class abczadataak {

	public static void main(String[] args) {

		Scanner unos = new Scanner (System.in);
		
		System.out.println("Unesi string: ");
		String s = unos.nextLine();
		String rezultat = " ";
		
		
		for ( int i = 0; i < s.length(); i++) {
			
			char c = s.charAt(i);
			
			if (rezultat.indexOf(c)== -1) {
				
				
				rezultat += c;
			}
		}
		
		System.out.println("Rezultat :" + rezultat);
	}

}
