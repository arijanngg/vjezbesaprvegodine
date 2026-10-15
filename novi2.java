package novi;

import java.util.Scanner;

public class novi2 {

	public static void obrada(int pocetak, int kraj) {
		
		int suma = 0; 
		System.out.println("novi niz je :" );
		for (int i = pocetak ; i <= kraj ; i ++) {
			
			if (i % 3 == 0 && i % 6 != 0 ) {
				
				int kvadrat = i *i;
				System.out.println(kvadrat + " ");
				suma += kvadrat;
			}
			
		}
		System.out.println("Suma je " + suma);
	}
	
	
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("unesi start");
		int s=sc.nextInt();
		
		System.out.println("Unesi kraj");
		int k = sc.nextInt();
		
		obrada (s,k);
		

	}

}
