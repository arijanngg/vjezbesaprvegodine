package Vjeybe;

import java.util.Scanner;

public class sesti {

	public static void main(String[] args) {
/*Napisati program koji za broj N računa aritmetičku sredinu cifara tog broja.*/
		
		Scanner sc = new Scanner ( System.in);
		
		System.out.println("Unesite n ");
		int n = sc.nextInt();
		
		int broj = n;
		int suma = 0;
		int brojcifara = 0;
		
		
		while (broj >0) {
			
			suma += broj %10; // suma = suma + broj % 10
			brojcifara ++; // brojcifara = brojcifara + 1
			broj/=10;
			}
		
		if (brojcifara == 0) {
			
			System.out.println(" aritmeticki niz je 0");
			
		} else {
			
			double aritmetickasredina = (double) suma / brojcifara;
			System.out.println("aritmeticki niz je " + aritmetickasredina );
		} 
		
			
			
		
		
		
		
		
		
		
		
		
	}

}
