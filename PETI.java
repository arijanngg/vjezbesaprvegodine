package vjezbazaispit;

import java.util.Scanner;

public class PETI {

	public static void main(String[] args) {

		// Dimenzije pravougaonika su 543 i 130.
		// Skicirati algoritam (napisati program)
		// koji računa koliko kvadrata stranice 65
		// je moguće izrezati iz tog pravougaonika.
		
		
		
	
		
		System.out.println("Dimenzije pravougaonika su 543 i 130. a Kvadrata 65");
		
		int a = 543;
		int b = 130;
		int c = 65;
		
		int povrsina1 = a * b;
		int povrsina2 = c^2;
		
		int brojkvadrata = povrsina1 / povrsina2;
		
		System.out.println("broj kvadrata u pravougaoniku je " + brojkvadrata);
		
		
	}

}
