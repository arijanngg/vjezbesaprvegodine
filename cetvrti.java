package predavanje;

import java.util.Scanner;

public class cetvrti {

	public static void main(String[] args) {

		int N, cifNM, cifNV;
		Scanner u = new Scanner (System.in);
		
		System.out.print("Unesite N: ");
		N = u.nextInt();
		
		if (N<0)
			N = -N;
		
		cifNM = cifNV= N%10;
		N = N /10;
		
		while (N>0) {
			cifNV = N%10;
			N= N/10;
		}
		if ( cifNM == cifNV)
		System.out.print("Iste");
		else 
			System.out.print("Razlicite");
	}

}
