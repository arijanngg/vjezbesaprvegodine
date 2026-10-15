package novi;

import java.util.Scanner;

public class zadni10 {
	
	
	
	public static void kvadriranje(int n, int x ) {
		int temp = 1;
		int bla = x;
		while (x>0) {
			
			temp *= n;
			x -= 1;
			
		}
		
		System.out.println(n + " stepenovan brojem " + bla + " je " + temp);
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
			System.out.println("Unesi broj");
			int n = sc.nextInt();
			System.out.println("Unesi kvadrat");
		int x= sc.nextInt();
		
		kvadriranje(n,x);

	}

}
