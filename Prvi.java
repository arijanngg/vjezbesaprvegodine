package VjezbaZaIspit;

import java.util.Scanner;

public class Prvi {

	public static void main(String[] args) {
/*Za Milicu i Anu se čuva koliko puta su obišle teren u 40 minuta. Međutim, prilikom unosa podataka desila se zabuna, pa je u varijabli x sačuvana vrijednost 
 * koja je trebala biti sačuvana u varijabliy i obrnuto. Skicirati algoritam (napisati program) koji mijenja mjesta
 vrijednostima u promjenljivim x i y. Npr. ako je x = 7 i y = 10, poslije izvršavanja koda varijable su x=10 i y=7.*/
		
		Scanner unos = new Scanner (System.in);
		System.out.println("Unesite x");
			int x = unos.nextInt();
		System.out.println("Unesite y");
			int y = unos.nextInt();
				
		int pomocnaVarijabla = x;
		
		x=y;
		y = pomocnaVarijabla;
		
		System.out.printf( "X je sada : %d, a Y je sada : %d%n", x,y);
		
		
		
	}

}
