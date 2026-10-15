package nizovi;

import java.util.Scanner;

public class meow {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Unesi broj eleemenata");
		int n= sc.nextInt();
		int niz [] = new int [n];
		
		System.out.println("Unesi elemenete ");
		for (int i = 0 ; i < n ; i ++) {
			niz [i] = sc.nextInt();
		}
		
		System.out.println("elementi niza su ");
		for (int i = 0; i < n ; i ++) {
			System.out.print(niz [i] + " ");
		}
		
	}

}
