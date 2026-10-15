package Vjeybe;

import java.util.Scanner;

public class cetvrti {

	public static void main(String[] args) {

	/*Skicirati algoritam (napisati program) kojim se na osnovu temperature vode određuje
	njeno agregatno stanje. Ako je temperatura:
	• viša od 0 C i niža od 100C - agregatno stanje je tečno
	• ne viša od 0 C - agregatno stanje je čvrsto,
	• ne niža od 100 C - agregatno stanje je gasovito.
	Za temperaturu od tačno 0 smatra se da je agregatno stanje čvrsto, a za tačno 100 da je
	gasovito.*/	
		
	
		Scanner sc = new Scanner (System.in);
		
		System.out.println("unijeti temperaturu");
		int temperatura = sc.nextInt();
		
		if (temperatura>0 && temperatura <100) {
			
			System.out.println("agregatno stanje tecno");
		} else if ( temperatura < 0) {
			
			System.out.println("agregatno stanje cvrsto");
			
		} else {
			System.out.println("agregatno stanje gasovito");
		}
		
		
		
	}

}
