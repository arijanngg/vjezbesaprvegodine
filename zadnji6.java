package novi;

import java.util.Scanner;

public class zadnji6 {

	public static void pretvaranje (String s ) {
		
		String novi = "";
		s.toLowerCase();
		
		
		for(int i = 0 ; i < s.length(); i ++) {
			
			char c = s.charAt(i);
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				novi += '1';
			}else {
				novi += '0';
			}
		}
		System.out.println("novi string je " + novi);
	}
	
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Unesi string");	
		String s = sc.next();
			
		pretvaranje(s);
		
	}

}
