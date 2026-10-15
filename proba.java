package ProbniIspit;

import java.util.Scanner;

public class proba {

	public static void main(String[] args) {

		Scanner unos = new Scanner (System.in);
		
		System.out.println("Unesite recenicu, sa malim, velikim slovima i brojevima .");
		String recenica = unos.next();
		int brojvelikihslova = 0;
		
		for (int i=0; i<recenica.length(); i++) {
			
			char c = recenica.charAt(i);
			
			if (!((c>= 'a' && c<= 'z' ) || (c>= '0' && c<= '9' ))) {
				
				brojvelikihslova ++;
				
				
			}
			
			
		}
		
		System.out.println("Broj karaktera koji nisu mala slova i brojevi su :" + brojvelikihslova);
		
		
		
	}

}
