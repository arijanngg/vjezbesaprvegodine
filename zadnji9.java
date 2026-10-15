package novi;

import java.util.Scanner;

public class zadnji9 {


	public static void sprat(int n) {
		int zbir = 0;
		int proizvod = 1;
		while (n>0) {
			
			int cifra = n%10; 
			zbir += cifra;
			proizvod *= cifra;
			n=n/10;
			
		}
		System.out.println("broj sprata je " + (proizvod - zbir));
		
	}
	
	
	
	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		System.out.println("Unesi broj stana");
		int x= sc.nextInt();
		
		sprat(x);
		
	}

}
