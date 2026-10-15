package vjezbeinfo2;

import java.util.Scanner;

public class zadatak9 {

	public static int izracunajpoene (char[] niz) {
		
		int poeni = 0;
		
		for (int i = 0 ; i < niz.length; i ++) {
			
			if (niz[i] == '1') {
				poeni += 1 ;
				
			}else if (niz [i] == '0') {
				
				poeni = poeni;
				
			}else if (niz[i] == '*') {
				
				poeni -=1;
			}
		}
		return poeni;
	}
	
	public static void main(String[] args) {
		
	Scanner sc = new Scanner (System.in);
	System.out.println("Unesi broj elemenata");
		int n = sc.nextInt();
		
		char[] niz = new char [n];
		
		
		System.out.println("unesi elemente 1,0 ili *");
		for (int i = 0; i < n ; i ++) {
			niz [i] = sc.next().charAt(0);
			
			
		}
		
		int poeni = izracunajpoene(niz);
		
		System.out.println("Ukupni poeni su " + poeni);
		
		if (poeni > 0) {
			
			System.out.println("IMa pozitivan broj poena");
		}else {
			
			System.out.println("nema pozitivan broj poena");
		}
		
		
		
		
	}

}
