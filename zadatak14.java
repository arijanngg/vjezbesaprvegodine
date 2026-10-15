package vjezbeinfo2;

import java.util.Scanner;

public class zadatak14 {

	
	public static String enkripcija (String s) {
		
		String rezultat = " ";
		
		for (int i = 0; i < s.length(); i ++) {
			
			char c = s.charAt(i);
			
			int broj = c - '0' ;
			
			if (broj % 2 == 0) {
				
				rezultat +=  '0';
				
			}else {
				
				rezultat += '1';
				
				
			}
			
		}
		return rezultat ; 
	}
	
	
	
	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		System.out.println("Unesi brojeve ");
		String brojevi = sc.nextLine();
		
		String rezultat = enkripcija(brojevi);
		
		System.out.println("Novi brojevi su" + rezultat );
		
		
	}

}
