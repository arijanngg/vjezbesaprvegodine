package vjezbeinfo2;

import java.util.Scanner;

public class zadatak10 {

	public static void stednja (double P, double r , double T) {
		
		int godina = 0;
		
		while (P<T) {
			
			godina ++;
			
			P = P + P * (r/100);
			
			System.out.println("Godina " + godina + ":" + P + "KM");
		}
		System.out.println("Cilj je dostignut za " + godina + " godina");
		
	}
	
	public static void main(String[] args) {

	Scanner sc = new Scanner (System.in);
	
	System.out.println("Unesite pocetni iznos");
		int P = sc.nextInt();
		
		System.out.println("Unesite iznos kamate r ");
		int r = sc.nextInt();
		
		System.out.println("Unesite iznos koji zelite da postignete");
			double T = sc.nextDouble();
			
			stednja (P,r,T);
			
		
	}

}
