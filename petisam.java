package VjezbaZaIspit;

import java.util.Scanner;

public class petisam {

	public static void main(String[] args) {
		
		Scanner unos = new Scanner (System.in);
		
		System.out.println("Unesite trocifren broj");
		String trocifrenbroj = unos.next();
		
		String novibroj= " ";
		
		novibroj = novibroj + trocifrenbroj.charAt(2) + trocifrenbroj.charAt(1) + trocifrenbroj.charAt(0);
		
		System.out.println("Trocifren broj koji ste unijeli je : " + trocifrenbroj + ", a novi broj je :" + novibroj);
	

	}

}
