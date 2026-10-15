package teski;

import java.util.Scanner;

public class stari20 {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner (System.in);
		
		System.out.println("Unesi string");
		String stari = sc.nextLine();
		 
		String novi = " " ;
		
		for ( int i = 0 ; i < stari.length(); i ++) {
			
			char c = stari.charAt(i);
			
			if ( c != ' ' ) {
				
				novi += c;
			}
			
		}
		
		System.out.println("Novi string je " + novi);
		
	}

}
