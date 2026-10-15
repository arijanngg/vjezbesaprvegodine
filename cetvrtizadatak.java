package meow;

import java.util.Scanner;

public class cetvrtizadatak {

	public static void main(String[] args) {
		/*Za milicu i anu se cuva koliko su puta obisle teren u 40 min.
		 * medjutim prilikom cuvanja podataka umjesto varijable x sacuvana je varijabla y, i obrnuto.
		 * skicirati algoritam koji im mijenja mjesta*/
		
		Scanner unos = new Scanner (System.in);
		System.out.println("Unesi X");
		int x = unos.nextInt();
		System.out.println("unesi Y");
		int y = unos.nextInt();
		
		int pomocnavarijabla = x;
		x = y; 
		y = pomocnavarijabla;
		
		System.out.printf("X je sada : %d, a Y je sada:2 %d%n", x, y);
		
		

	}

}
