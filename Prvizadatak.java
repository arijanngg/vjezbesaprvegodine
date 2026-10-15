package TrecePredavanjeJava;

import java.util.Scanner;

public class Prvizadatak {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner( System.in);
		
		System.out.println( " Unesi recenicu");
		String tekst = sc.nextLine();
		
		int i = 0;
		int samoglasnici = 0;
		int suglasnici = 0;
		
		
		while(i < tekst.length() ) {
				char c = Character.toLowerCase(tekst.charAt(i));
				
				if (c>= 'a' && c <='z') {
					if (c == 'a'  || c == 'e' || c =='i'  || c == 'o' || c == 'u') {
						samoglasnici ++;
					} else {
						suglasnici ++;
					}
				}
				
				i++;
			}
		
		System.out.println("Broj samoglasnika =" + samoglasnici );
		System.out.println("Broj suglasnika =" + suglasnici );
		

	}

}
