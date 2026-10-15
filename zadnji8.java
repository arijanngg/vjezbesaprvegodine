package novi;

import java.util.Scanner;

public class zadnji8 {

	public static void zbir(int[] niz,int n) {
		
		int najmanja= niz[0];
		int druganajmanja = niz[1];
		int zbir = 0;
		
		
		
		if ( najmanja > druganajmanja) {
			int temp = najmanja;
			najmanja = druganajmanja;
			druganajmanja = temp ;
		}
		
		
		for (int i = 2 ; i < n; i ++) {
			
			
			
			if (niz[i] < najmanja) {
				druganajmanja = najmanja;
				najmanja= niz[i];
			}
		if(niz [i] > najmanja && niz[i] < druganajmanja) {
			druganajmanja = niz[i];
		}
		}	
		zbir = druganajmanja + najmanja;
		System.out.println("Zbir najjeftinijih proizvoda je " + zbir);
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in) ;
			
			System.out.println("Unesi broj elemenata");
			int x= sc.nextInt();
			System.out.println("Unesite elemente");
		int[] niz = new int [x];
		for(int i = 0 ; i < x; i ++) {
			niz[i] = sc.nextInt();
			
			
		}
		zbir(niz,x);
	}

}
