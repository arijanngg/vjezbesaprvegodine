package zz;

import java.util.Scanner;

public class skripta5 {

	public static void izdvoji(String [][] matrica, int n) {
		
		System.out.println("Stringovi duzine : " + n + " su : ");
		for( int i = 0 ; i < matrica.length; i ++) {
			for(int j = 0 ; j < matrica[0].length; j ++) {
				if (matrica[i][j].length() >= n) {
					System.out.println(matrica[i][j] + " ");
				}
			}
		}
		
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in) ;
		String[][] matrica = {
	            {"java", "hi", "program"},
	            {"code", "a", "matrix"},
	            {"hello", "ai", "chatgpt"}
	        };
		System.out.println("Unesi broj koji se testira");
		int bla = sc.nextInt();
		
		izdvoji (matrica, bla);
		
	}

}
