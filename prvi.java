package vjezbazaispit;

import java.util.Scanner;

public class prvi {

	public static void main(String[] args) {

		
		//Za Milicu i Anu se čuva koliko puta su obišle teren u 40 minuta.
		// Međutim, prilikom unosa podataka desila se zabuna, pa je u varijabli
		// x sačuvana vrijednost koja je trebala biti sačuvana u varijabli
		// y i obrnuto. Skicirati algoritam (napisati program) koji mijenja mjesta
		// vrijednostima u promjenljivim x i y.
		// Npr. ako je x = 7 i y = 10, poslije izvršavanja koda varijable su x=10 i y=7.
	
	
		Scanner sc = new Scanner (System.in);
		
		
		System.out.println("unesite vrijednost x");
		int x = sc.nextInt();
		System.out.println("unesite vrijednost y");
		int y = sc.nextInt();
		
	
		int pomocnavarijabla = x;
		
		x = y;
		
		y= pomocnavarijabla ;
	
		System.out.println(" x je sad " + x + " a y je sada " + y);
		
	
	}

}
