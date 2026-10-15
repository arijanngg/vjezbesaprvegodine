import java.util.Scanner;

public class drugizadatak {

	public static void main(String[] args) {
 
		/*dat je niy brojeva. Koliko u zadatom nizu ima prostih brojeva */
		
		Scanner sc = new Scanner (System.in);


		System.out.println("Unesite broj elemenata u nizu");
		int n = sc.nextInt();
		int niz [] = new int [n];
		
		
		
		System.out.println("Unesite vrijednost elemenata");
		for (int i = 0 ; i < n ; i ++) {
			
			niz [i] = sc.nextInt();
			
		}
		
		int prosti = 0;
		int i = 0 ; 
		int broj = 0 ; 
		while (i < n) {
			
			broj = niz [i];
			boolean prost = (broj >= 2);
			int j = 2 ; 
			while ( j <= broj /2 ) {
				if (broj % j == 0 ) {
					prost = false ;
					
				}
				j++;
				
			}
			if (prost ) {
				
				prosti++;
			}
		}
		
		System.out.println("Broj prostih brojeva je :" + prosti);
		
		
	}

}
