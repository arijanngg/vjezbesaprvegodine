package meow;

import java.util.Scanner;

public class sestizadatak {

	public static void main(String[] args) {
		/*Dimenzije pravougaonika su 543 i 130. napisati program koji racuna koliko kvadrata stranice 65 
		 * je moguce izrezati iz tog pravougaonika.*/
		
		Scanner sc = new Scanner (System.in);
		
		int a = 543;
		int b = 130;
		int c = 65;
		
		int povrsina = a*b;
		int povrsinakvadrata = c*c;
		
		int komadi = povrsina / povrsinakvadrata ;
		
		System.out.printf("moguce je stati %d", komadi);
		
		
		
		

	}

}
