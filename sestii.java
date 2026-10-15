package drugagod;

import java.util.Scanner;

public class sestii {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Unesi brojeve");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int c = sc.nextInt();
		
	 int min = 0;
	 int max  = 0;
	 if (x>min) {
		 min= x;
	 }else if(y>min) {
		 min = y;
	 }else {
		 min = c;
	 }
		if( x<max) {
			max = x;
			
		}else if(y<max) {
			max = y;
		}else {
			max = c;

		}
		
		System.out.println("Minimum je " + min + " a maksimum " + max
				);
	}

}
