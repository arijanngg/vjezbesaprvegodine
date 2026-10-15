package ponovnevjezbe;

import java.util.Scanner;

public class Druginovi {

	public static void main(String[] args) {
		/*Dat je petocifreni prirodan broj koji predstavlja broj stambene jedinice u zgradi. Na
		osnovu zadatog broja potrebno je odrediti sprat na kome se nalazi stambena jedinica.
		Poznato je da se to može otkriti kada se na vrijednost pretposlednje cifre zadatog broja
		doda vrijednost poslednje cifre. Štampati taj zbir.*/

		Scanner sc = new Scanner (System.in);
		
		System.out.println("Unesi petocifren broj ");
		int broj = sc.nextInt();
		
		int poslednjacifra = broj %10;
		int pretposlednjacifra = (broj /10) %10;
		
		int brojsprata = poslednjacifra + pretposlednjacifra;
		
		System.out.println("Broj sprata je " + brojsprata);
		
		
		
		
	}

}
