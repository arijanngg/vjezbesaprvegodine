package teski;

import java.util.Scanner;

public class teski22 {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner (System.in);
		
		System.out.println("Unesi string");
		String stari = sc.nextLine();
	int brojsamoglasnika = 0;
	int brojsuglasnika = 0;
		
		
		for ( int i = 0 ; i < stari.length(); i ++) {
			
			char c = stari.charAt(i);
			
			if ( "aeiouAEIOU".indexOf(c) != -1) {
				
			brojsamoglasnika ++;	
				
				
			}else {
				
				brojsuglasnika ++;
			}
			
			
		}
		
		System.out.println("broj samoglasnika je" + brojsamoglasnika + " a broj suglasnika je " + brojsuglasnika );
		

	}

}
