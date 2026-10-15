package VjezbaZaIspit;

import java.util.Scanner;

public class deveti {

	public static void main(String[] args) {
		// Date su cijene tri proizvoda.
		// Skicirati algoritam (napisati program) koji treba da
		// nađe par proizvoda čija cijena u zbiru daje najmanju vrijednost.
		// Pretpostaviti da su cijene svih proizvoda razlicite.
		
		
		Scanner unos = new Scanner (System.in);
		System.out.println("Unesite cijenu prvog proizvoda");
		int prviproizvod = unos.nextInt();
		System.out.println("Unesite cijenu drugog proizvoda");
		int drugiproizvod= unos.nextInt();
		System.out.println("Unesite cijenu treceg proizvoda");
		int treciproizvod = unos.nextInt();
		
		int zbir12 = prviproizvod + drugiproizvod;
		int zbir13 = prviproizvod + treciproizvod;
		int zbir23 = drugiproizvod + treciproizvod;
		
		if (zbir12 < zbir13) {
			if (zbir12 < zbir23) {
				
				System.out.println(" Zbir prvog i drugog proizvoda je najmanji ");
				
			}else {
				
				System.out.println("Zbir 2 i 3 proizvoda je najmanji");
			} 
			
		} else if (zbir13 < zbir23) {
			
			System.out.println(" Zbir proizvoda 13 je najmanji");
			
		} else {
			
			System.out.println("Zbir proizvoda 2 i 3 je najmanji");
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
}