package vjezbeinfo2;

import java.util.Scanner;

public class zadatak15 {

	public static String zamjeni (String tekst , char staro, char novo) {
		
		String rezultat = " ";
		
		for (int i = 0; i < tekst.length(); i ++) {
			
			char c = tekst.charAt(i);
			
			if (c == staro) {
				
				rezultat += novo;
				
			}else {
				
				rezultat += c;
			}
			
		}
		
		return rezultat;
	}
	public static void main(String[] args) {

	Scanner sc = new Scanner (System.in);
	
	System.out.println("unesi string");
		String novi = sc.nextLine();
		
		System.out.println("Unesi staro slovo");
		char staro = sc.next().charAt(0);
		
		System.out.println("Unesi novo slovo");
		char novo = sc.next().charAt(0);
		
		String rezultat = zamjeni (novi,staro,novo);
		
		System.out.println("Novi string je " + rezultat);
	}

}
