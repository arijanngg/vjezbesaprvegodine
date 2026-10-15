package novi;

import java.util.Scanner;

public class zadnji3 {

	public static boolean provjera ( String s, String target) {
		
		if(target.length()>s.length()) {
			return false ; 
		}
		int start = s.length() - target.length();
		for (int i = 0 ; i < target.length() ; i ++) {
			
			if(s.charAt(start+i) != target.charAt(i)) {
				return false ;
			}
			
		}
		return true;
		
		
		
		
	}
	
	
	
	
	
	
	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		System.out.println("Unesi pocetni string");
		String s = sc.next();
		System.out.println("unesi target");
		String target = sc.next();
		
		
		if ( provjera(s,target)) {
			System.out.println("DA");
		}else {
			System.out.println("NE");
		}
		
	}

}
