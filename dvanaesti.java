package VjezbaZaIspit;

import java.util.Scanner;

public class dvanaesti {

	public static void main(String[] args) {
		// Korisnik unosi brojeve.
		// Program sabira sve unesene brojeve dok korisnik ne unese 0.
		// Na kraju ispisati zbir.
	
		Scanner unos = new Scanner (System.in);
		
		System.out.println("unijeti brojeve ako hoces da prekines unesi 0");
		
	 int zbirunesenih = 0;
	 int unesibroj = unos.nextInt();
	 
	 while ( unesibroj >0) {
		 zbirunesenih  +=unesibroj;
		 unesibroj = unos.nextInt();
	 }
	
	System.out.println(" zbir brojeva je : " + zbirunesenih);
	
	}

}
