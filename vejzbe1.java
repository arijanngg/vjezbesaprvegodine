import java.util.Scanner;

public class vejzbe1 {

	public static void main(String[] args) {
		
		/*napisati program koji provjerava da li je unijeti broj palindrom*/
		
		Scanner sc =new Scanner (System.in); 
		
		System.out.println("Unesi broj ");
		int n = sc.nextInt();
		int original  = n ; 
		int okrenut = 0;
		int cifra = 0;
		
		
		while ( n > 0) {
			
		cifra = n%10;
		okrenut =  cifra + okrenut * 10;
		
		n = n / 10 ; 

		}
		
		if (original == okrenut) {
			
			System.out.println("Jeste palindrom");
		}else {
			
			System.out.println("Nije palindrom");
		}
		
		
		
		
		
	}

}
