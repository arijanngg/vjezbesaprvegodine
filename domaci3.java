package novi;

import java.util.Scanner;

public class domaci3 {

	public static int duzina ( String s) {
		return s.length();
		
	}
	public static String ocisti(String s) {
		String novi = "";
		for (int i = 0 ; i < s.length(); i ++) {
			char c = s.charAt(i);
			if(c != ' ' && c != '.' && c != ',' ) {
				novi += c;
			} 
		}
		return novi;
	}
	public static boolean palindrom ( String s) {
		int i = 0;
		int j = s.length() -1;
		while (i < j ) {
			if( s.charAt(i) != s.charAt(j)) {
				return false;
			}
			i++;
			j--;
			
		}
		return true;
	}
	
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Unesi string");
		String s = sc.next();
		
		System.out.println("Duzina stringa je " + duzina(s));
		 String cist =  ocisti (s);
		 
		 System.out.println("Ociscen string je " + cist);
		 
		 if (palindrom(s)) {
			 
			 System.out.println("String je palindrom");
		 }else {
			 System.out.println("broj nije palindrom");
		 }
		 
	}

}
