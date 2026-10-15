package novi;

import java.util.Scanner;

public class novi3 {

	public static void skolarina (int[] skolarine , double[] ocjene, int [] nagrade, int n ) {
		
		
		for (int i = 0 ; i < n ; i ++) {
			
			double popust = 0;
			if (ocjene[i] >= 4.5) {
				popust = 0.4;
			}else if (ocjene[i] >= 3.5 ) {
				popust = 0.2;
			}else if (ocjene [i] >= 2.5) {
				popust = 0.1;
			}
			if ( nagrade [i] == 1 && 0.3 > popust ) {
				popust = 0.3;
			}
			
			double zaplatiti = skolarine[i] -skolarine[i]*popust;
			
			System.out.println("ucenik " + (i+1) + " placa " + zaplatiti);
		}
		
	}
	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Unesi broj ucenika:");
        int n = sc.nextInt();

        int[] skolarine = new int[n];
        double[] ocjene = new double[n];
        int[] nagrade = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Unesi punu skolarinu za ucenika " + (i+1)  + ":");
            skolarine[i] = sc.nextInt();

            System.out.println("Unesi prosjecnu ocjenu za ucenika " + (i + 1) + ":");
            ocjene[i] = sc.nextDouble();

            System.out.println("Unesi nagradu za ucenika " + (i + 1) + " (0 ili 1):");
            nagrade[i] = sc.nextInt();
        }

        skolarina(skolarine, ocjene, nagrade, n);
		

	}

}
