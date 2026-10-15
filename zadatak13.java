package vjezbeinfo2;

import java.util.Scanner;

public class zadatak13 {

	public static void brojislova (String tekst ) { 
	
	int samoglasnici = 0;
	int suglasnici = 0;
	
	
	tekst = tekst.toLowerCase();
	
	for (int i = 0 ; i < tekst.length(); i ++) {
		
		char c = tekst.charAt(i);
		
		if (c >= 'a' && c <= 'z') {
			
			if ( c =='a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				
				samoglasnici ++;
				
			}else {
				
				suglasnici ++;
			}
			
		}
		
		
	}
	
	System.out.println("Broj samoglasnika je " + samoglasnici );
	System.out.println("Broj suglasnika je " + suglasnici);
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		System.out.println("Unesite string");
		String novi = sc.nextLine();
		
		brojislova(novi);
		
		
	}

}
