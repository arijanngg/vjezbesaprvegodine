package novi;

import java.util.Scanner;

public class zadnji5 {

	public static double srednjavrijednost ( String s) {
		
		int suma = 0 ; 
		for (int i = 0;i < s.length(); i ++) {
			
			char c = s.charAt(i);
			
			int cifra = c - '0';
			suma += cifra;
			
			
		}
		return (double ) suma /s.length();

		
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Unesi brojeve");
		String brojevi = sc.next();
		
		double rezultat = srednjavrijednost(brojevi);
		System.out.println("Srednja vrijednost je "+ rezultat);
		
		
	}

}
