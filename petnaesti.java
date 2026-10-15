import java.util.Scanner;

public class petnaesti {

	public static void main(String[] args) {

		// Napisati program koji od korisnika traži da unese rečenicu.
		// Program treba da broji Koliko ima samoglasnika, a Koliko suglasnika.
		// Ignorisati brojeve, razmake i simbole.
		
		Scanner unos = new Scanner (System.in);
		
		
		System.out.println("unesite recenicu");
		String recenica = unos.nextLine();
		
		int indeksrec= 0 ;
		int ukupnosamoglasnika = 0;
		int ukupnosuglasnika = 0;
		
		while (indeksrec < recenica.length()) {
			
			char karakter = Character.toUpperCase(recenica.charAt(indeksrec));
			if (karakter >= 'A' && karakter <= 'Z' ) {
				
				String samoglasnici = "AEIOU";
				if (samoglasnici.contains(Character.toString(karakter))) {
					
					ukupnosamoglasnika ++;
					
				}else {
					ukupnosuglasnika ++;
					
					
				}
				
			}
			indeksrec ++;
			
			
		}
				
		System.out.println("Recenica sadrzi  " + ukupnosamoglasnika + " samoglasnika, i " + ukupnosuglasnika + " suglasnika.");
		
		
		
		
		
	}

}
