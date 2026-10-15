package ponovnevjezbe;

import java.util.Scanner;

public class dvadesetdeveti {

	public static void main(String[] args) {
	
		//Napisati program koji iz stringa izdvaja samo velika slova. Primjer: HeLLo WoRld →

		
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Unesi string sa velikim i malim slovima");
		String stari = sc.nextLine();
		
		String novi = " ";
		
		
		for (int i = 0; i < stari.length(); i ++) {
			
			
			char c = stari.charAt(i);
			
			if (c >= 'A' && c <= 'Z') {
				
				novi += c;
				
			}
		}
		
		System.out.println("Novi string je " + novi);
		

	}

}
