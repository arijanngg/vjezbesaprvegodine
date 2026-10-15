package ponovnevjezbe;

import java.util.Scanner;

public class dvadesetcetiri {

	public static void main(String[] args) {

		
		//Napisati program koji prebrojava koliko puta se dato slovo pojavljuje u stringu. 
		
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Unesi string");
		String string = sc.nextLine();
		
		System.out.println("Unesite slovo koje provjeravate");
		char slovo = sc.next().charAt(0);
		
		int brojslova = 0;
		
		for (int i= 0; i< string.length(); i++) {
			
			char c = string.charAt(i);
			
			if (c ==  slovo) {
				
				brojslova ++;
				
			}
			
		}
		


System.out.println("Broj slova " + slovo + " je : " + brojslova);


	}

}
