package vjezbeinfo2;

import java.util.Scanner;

public class zadatak6 {

	public static boolean palindrom (int n ) {
		
		int original = n;
		int obrnuti = 0;
		
		while (n > 0 ) {
			
			int cifra = n % 10;
			obrnuti = obrnuti * 10 + cifra;
			n = n/10;
			
		}
		return original==obrnuti;
		
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Unesi broj n");
		int n = sc.nextInt();
		
		if (palindrom(n)) {
			
			System.out.println("broj je palindrom");
		}else {
			
			System.out.println("broj nije palindrom");
		}
		
		
	}

}
