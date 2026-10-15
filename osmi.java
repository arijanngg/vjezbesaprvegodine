package VjezbaZaIspit;

import java.util.Scanner;

public class osmi {

	public static void main(String[] args) {

		// Skicirati algoritam (napisati program) koji računa X**n
		// koristeći petlju (bez operatora za stepenovanje)
		
		Scanner unos = new Scanner (System.in);
		System.out.println("Unesite broj koji se stepenuje");
		int x = unos.nextInt();
		
		System.out.println("Unesite stepen : ");
		int stepen = unos.nextInt();
		int stepencopy = stepen;
		int novibrojstepenovan = 1;
		
		while (stepen > 0 ) {
			
			
			novibrojstepenovan *= x;
			stepen --;
			System.out.println("broj je :" + x + ", stepen je : " + stepen + ", a novi broj je :" + novibrojstepenovan);
		}
		
	}


}
