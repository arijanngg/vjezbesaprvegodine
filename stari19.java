package teski;

import java.util.Scanner;

public class stari19 {

	public static void main(String[] args) {
	
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Unesi string");
		String stari = sc.next();
		
		System.out.println("Izaberite  koje slovo mijenjamo");
		char x = sc.next().charAt(0);
		
		System.out.println("Izaberite u koje slovo mijenjamo");
		char f = sc.next().charAt(0);
		
		String novi = " ";
		
		for ( int i = 0 ; i < stari.length(); i ++) {
			
		char c = stari.charAt(i);
		
		if ( c == x) {
			
			
			novi += f;
		}else {
			
			novi += c;
		}	
		
		
		}
		
		System.out.println("String je sada " + novi);

	}

}
