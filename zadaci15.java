package zadaciinfo2ponovo;

import java.util.Scanner;

public class zadaci15 {
	
	
	public static void novistring ( char staro, String recenica, char novi) {
		
		String rezultat = " ";
		
		for ( int i = 0 ; i < recenica.length(); i ++) {
			
			char c = recenica.charAt(i);
			
			if (c == staro) {
				
			rezultat += novi;
				
			}else {
				rezultat += c;
				
			}
			
		}
		System.out.println("novi string je " + rezultat);
		
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Unesite recenicu ");
		String recenica = sc.next();
		
		System.out.println("Unesite slovo koje mijenjate ");
		char staro = sc.next().charAt(0);
		System.out.println("Unesite slovo u koje se mijenja staro");
		char novo = sc.next().charAt(0);
		
		novistring (staro,recenica,novo);
		
		

	}

}
