package nizovi;

import java.util.Scanner;

public class karim2 {

	public static void main(String[] args) {
		
		/*Nacrtati algoritam (napisati program) koji za unijete nizove a i b vraća niz zajedničkih
elementa niza a i niza b. Elementi niza a i niza b su karakteri.
Input 1: a = [‘b’, ’a’], b = [‘a’, ‘c’] Output 1: [‘a’]*/
		
Scanner sc = new Scanner (System.in);
		
		System.out.println("Unesi broj elemenata");
		int a = sc.nextInt();
		
		int niz [] = new int [a];
		
		System.out.println("Unesi elemente");
		for (int i = 0 ; i < a ; i ++ ) {
			
			niz [i] = sc.nextInt();	
		}


		
		System.out.println("Unesi broj elemenata");
		int b = sc.nextInt();
		
		int nizz [] = new int [b];
		
		System.out.println("Unesi elemente");
		for (int i = 0 ; i < b ; i ++ ) {
			
			nizz [i] = sc.nextInt();	
		}
	 
		int [] novi = new int [a];
		
		for (int i = 0 ; i < a ; i ++) {
			for (int j = 0 ; j < b ; j ++) {
				
				if ( niz [i] == nizz [j]) {
			 
					System.out.print(niz [i] + " ");
					
	
			
				
	
		
				}
			}
		}
			
		

	}

}
