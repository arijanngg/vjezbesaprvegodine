package zz;

import java.util.Scanner;

public class prvimatrica {

	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		 
		System.out.println("Unesi broj redova");
		int redovi= sc.nextInt();
		
		System.out.println("unesi broj kolona");
		int kolone = sc.nextInt();
		
		
		int [][] matrica = new int[redovi][kolone];
		System.out.println("Unesi elemente matrice");
		for(int i = 0 ; i < matrica.length; i ++) {
			for (int j = 0 ; j < matrica[0].length; j ++) {
				matrica [i][j] = sc.nextInt();
				
			}
		}
		System.out.println("nova matrica je ");
		for( int i = 0 ; i < matrica.length; i ++) {
			for ( int j = 0 ; j < matrica[0].length; j ++) {
				System.out.print(matrica[i][j] + " ");
			}
			System.out.println();
		}
	}

}
