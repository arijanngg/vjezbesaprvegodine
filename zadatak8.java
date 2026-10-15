package vjezbeinfo2;

import java.util.Scanner;

public class zadatak8 {

	
	public static int zbircifri (int n ) {
		
		int zbir = 0 ; 
		
		while (n > 0 ) {
			
		zbir += n %10;
		n = n/10;
			
		}
		return zbir;
		
	}
	
	public static void digitalnikorjen (int n) {
		System.out.println("Koraci");
		while (n >= 10 ) {
			int zbir = zbircifri(n);
			System.out.println(n+" >>>>>" + zbir);
			n = zbir;
		}
		System.out.println("Konacni rezultat " + n);
	}
	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesi broj ");
		int n = sc.nextInt();
		
		digitalnikorjen (n);
		
		
		
		
	}

}
