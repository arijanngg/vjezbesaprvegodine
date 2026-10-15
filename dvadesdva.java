package ponovnevjezbe;

import java.util.Scanner;

public class dvadesdva {

	public static void main(String[] args) {

		
		/* Nacrtati algoritam (napisati program) koji za unijeti string s (karakteri stringa cifre od 0 do
			 9) enkriptuje na sledeći način: ako je karakter paran broj pretvara se u 0, a ako je
			 karakter neparan broj pretvara se u 1. Npr. za s = ‘15023’ rezultat je 11001.*/
		
		Scanner sc = new Scanner ( System.in);
		System.out.println("Unesi brojeve ");
		
		String brojevi = sc.next();
		String novi = " ";
		
		for (int i = 0; i < brojevi.length(); i ++) {
			
			char c = brojevi.charAt(i);
			
			if (c %2 ==0) {
				
				novi += 0;
				
			}else {
				
				novi += 1;
			}
			
			
		}
		
		System.out.println("Novi string je :" + novi);
		
		
		
		
		
		
	}

}
