package novi;

import java.util.Scanner;

public class zadnji7 {

	
	public static boolean provjera(int n) {
		
		while (n > 0) {
			
			int cifra = n%10;
			int temp = n/10;
			while (temp > 0 ) {
				if (cifra == temp%10) {
					return false ;
				}
				temp /= 10;
				
			}
		}
		return true;
		
		
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
System.out.println("unesi broj");
	        int broj = sc.nextInt();

	        if (provjera(broj)) {
	            System.out.println("Sve cifre su razlicite");
	        } else {
	            System.out.println("Nisu sve cifre razlicite");
	        }
		
	}

}
