package VjezbaZaIspit;

import java.util.Scanner;

public class Treci {

	public static void main(String[] args) {
		
		//Za četiri grada poznat je ukupan broj stanovnika (po gradu). Naći prosjek broja stanovnika za te gradove.
		
		Scanner unos = new Scanner (System.in);
		
		System.out.println("Unesite stanovnike za grad 1");
		int grad1= unos.nextInt();
		System.out.println("Unesite stanovnike za grad 2");
		int grad2= unos.nextInt();
		System.out.println("Unesite stanovnike za grad 3");
		int grad3 = unos.nextInt();
		System.out.println("Unesite stanovnike za grad 4");
		int grad4= unos.nextInt();
		
		
		int ukupno = grad1 + grad2 + grad3 + grad4;
		double prosjek = ukupno / 4;
		
		
		System.out.println("Prosjek gradova je :" + prosjek);
		
		
		

	}

}
