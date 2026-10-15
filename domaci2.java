package novi;

import java.util.Scanner;

public class domaci2 {
	
	public static int korjen(int n) {
		while (n >= 10) {
			int zbir = 0;
			
			while (n>0) {
				zbir +=n%10;
				n=n/10;
			}
			n = zbir;
			
		}
		return n;
	}
	
	public static void razlika ( int[] niz , int n ) {
		
		
		int minkorjen = korjen(niz[0]);
		int maxkorjen = korjen(niz[0]);
		int minbroj = niz[0];
		int maxbroj = niz[0];
		
		for(int i = 1 ; i < n ; i ++) {
			int korjen = korjen (niz[i]);
			if (korjen < minkorjen ) {
				minkorjen=korjen;
				minbroj = niz[i];
			}
			
			if (korjen > maxkorjen) {
				maxkorjen = korjen;
				maxbroj = niz[i];
				
			}
			
			
		}
		
		System.out.println("Element sa najmanjim korjenom je " + minbroj);
		System.out.println("Element sa najvecim korjenom je " + maxbroj);
		System.out.println("Njihova razlika je " + (maxbroj - minbroj));
		
		
	}
	
	
	public static void main(String[] args) {
Scanner sc = new Scanner (System.in);
System.out.println("Unesi broj elemenata");
		int x= sc.nextInt();
		System.out.println("Unesi elemente");
		int[] niz = new int [x];
		for (int i = 0 ; i < x; i ++) {
			niz[i] = sc.nextInt();
			
		}
		
		razlika (niz,x);
		
	}

}
