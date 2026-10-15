package novi;

import java.util.Scanner;

public class zadnji1 {
	
	public static int proizvod (String s ) {
		
		int proizvod = 1 ; 
		boolean imacifara = false;
		for(int i = 0; i < s.length(); i ++) {
			char c = s.charAt(i);
			
			if(c >='0' && c <= '9') {
				
				proizvod *= c - '0';
				imacifara = true;
			}
			
		}
		if (!imacifara )return 0;
		System.out.println("Proizvod cifri u stringu je " + proizvod);
		return proizvod; 
		
	}
	
	
	public static void main(String[] args) {
	
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Unesi string");
		String s= sc.next();
		
		proizvod (s);
		
		
	}

}
