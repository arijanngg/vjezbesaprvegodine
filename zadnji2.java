package novi;

import java.util.Scanner;

public class zadnji2 {
	
	public static boolean binaran(String s) {
		
		
		
		
		for ( int i = 0 ; i < s.length(); i ++) {
			
			char c = s.charAt(i);
			if ( c != '1' && c != '0') {
				return false;
				}	
			}	
		return true;
	
	 
	
	}
	
	
	
	public static void main(String[] args) {
		
		
		Scanner  sc = new Scanner (System.in);
		System.out.println("Unesi string sa brojevima ");
		String s = sc.next();
		
		if(binaran (s)) {
			System.out.println("broj je binaran");
		}else {
			System.out.println("broj nije binaran");
		}
		
	}

}
