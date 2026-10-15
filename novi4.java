package novi;

import java.util.Scanner;

public class novi4 {

	public static double plata( double plata) {
		
		double porez = 0.1;
		double porez2 = 0.2;
		double ukupnaplata = 0;
		if (plata <= 1000) {
			ukupnaplata += plata*porez;
			
		}else {
			ukupnaplata += plata*porez2;
		}
		return ukupnaplata;
	}

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Unesi broj radnika");
		int n= sc.nextInt();
		
		double ukupnaplata= 0 ;
		for(int i = 0; i < n ; i ++) {
			
			
			System.out.println("Plata radnika " + (i+1) + " je :" );
			double x= sc.nextDouble();
			ukupnaplata+= plata(x);
			 
		}
		System.out.println("Ukupna suma poreza  je " + ukupnaplata);
	}

}
