package vjezbazaispit;

import java.util.Scanner;

public class TRECI {

	public static void main(String[] args) {

		// Za četiri grada poznat je ukupan broj stanovnika (po gradu).
		// Naći prosjek broja stanovnika za te gradove.
		
		Scanner sc = new Scanner (System.in);
		
		
		System.out.println(" Unesite broj stanovnika za grad 1");
		int grad1 = sc.nextInt();
		System.out.println("Unesite broj stanovnika za grad 2"); 
		int grad2 = sc.nextInt();
		System.out.println("Unesite broj stanovnika za grad 3");
		int grad3 = sc.nextInt();
		System.out.println("Unesite broj stanovnika za grad 4");
		int grad4 = sc.nextInt();
		
		
		int sumagradjana = grad1 + grad2 + grad3 + grad4;
		
		float prosjek = sumagradjana / 4.0f;
		
		System.out.println(" ukupan broj stanovnika je " + sumagradjana + " dok je prosjek stanovnika : " + prosjek);
		
		
	}

}
