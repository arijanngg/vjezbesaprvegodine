package predavanje;

import java.math.BigInteger;
import java.util.Scanner;

public class treci {

	public static void main(String[] args) {

		int N;
		BigInteger p=BigInteger.ONE;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Unesi N");
		N = sc.nextInt();
		
		if(N>=0) {
		
		for (int i = 2 ; i <= N; i ++) 
			p*=i;
		System.out.printf("%d! = %d", N, p);
		}
		else 
			System.out.printf("Nije prirodni broj");
	}

}
