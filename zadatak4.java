package vjezbeinfo2;

import java.util.Scanner;

public class zadatak4 {

	public static void  obrada (int n ) {
		
		int zbirparnih = 0; 
		int zbirneparnih = 0; 
		
		
		int brparnih= 0;
		int brneparnih= 0;
		
		for (int i = 1 ; i <= n ; i ++) {
			
			if ( i % 2 == 0) {
				
				zbirparnih += i;
				brparnih ++;
				
			}else {
				
				zbirneparnih += i ;
				brneparnih ++;	
			}
		}
		
		System.out.println("Broj parnih brojeva je " + brparnih);
		System.out.println("Broj neparnih brojeva je " + brneparnih);
		
		if (brparnih>brneparnih ) {
			System.out.println("Ima vise parnih brojeva");
		}else if (brparnih <brneparnih) {
			
			System.out.println("Ima vise neparnih brojeva ");
		}else {
			System.out.println("broj parnih i neparnih brojeva je jednak");
			
		}
		

	}
	
	
	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Unesi broj n ");
		int n = sc.nextInt();
		
		 obrada (n);
		
		
		
		

	}

}
