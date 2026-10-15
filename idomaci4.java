package novi;

import java.util.Scanner;

public class idomaci4 {

	public static boolean check(String s, int minlen, boolean flagupper, boolean flaglower, boolean flagdigit) {
		
	if(s.length()<minlen) {
		return false;
	}	
	 boolean imaVeliko = false;
     boolean imaMalo = false;
     boolean imaCifru = false;	
	
     for(int i = 0 ; i < s.length(); i ++) {
    	 
    	 char c = s.charAt(i);
    	 if( Character.isUpperCase(c)) {
    		 imaVeliko = true;
    	 }
    	 if(Character.isLowerCase(c)) {
    		 imaMalo = true;
    		 
    	 }
    	 if(Character.isDigit(c)) {
    		 imaCifru = true;
    	 }
    	 
     }
     
     if (flagupper && !imaVeliko ) return false;
     if (flaglower && !imaMalo) return false;
     if (flagdigit && !imaCifru) return false;
     return true;
     
     
	}
	
	
	
	
	
	
	public static void main(String[] args) {

		 Scanner sc = new Scanner(System.in);

	        System.out.println("Unesi password:");
	        String s = sc.nextLine();
		
		boolean rezultat = check (s,6,true,true,true );
		if (rezultat ) {
			System.out.println("OK");
			
		}else {
			System.out.println("NO");
		}
		
		
		
	}

}
