package novi;

import java.util.Scanner;

public class novi1 {

	public static int zbirkazni (int n) {
		
		int zbir= 0;
		if (n > 50) {
			zbir = (n-50) * 10;
			
			
		}
		
		return zbir; 
		
	}
	
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Unesi broj vozaca");
		int x = sc.nextInt();
		int ukupno = 0;
		for (int i = 0 ; i < x ; i ++) {
		System.out.println("brzina vozaca " + i + " je :" );	
		int brzinavozaca = sc.nextInt();
		int kazna = zbirkazni(brzinavozaca);
		ukupno+=kazna;
		}
		
		System.out.println("Ukupna kazna je " + ukupno);
	}

}
