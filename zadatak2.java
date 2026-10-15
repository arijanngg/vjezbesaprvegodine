package vjezbeinfo2;

import java.util.Scanner;

public class zadatak2 {

	 public static int nzd(int a, int b) {
	        while (b != 0) {
	            int temp = b;
	            b = a % b;
	            a = temp;
	        }
	        return a;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Unesite broj A: ");
	        int a = sc.nextInt();

	        System.out.print("Unesite broj B: ");
	        int b = sc.nextInt();

	        int rezultat = nzd(a, b);

	        System.out.println("NZD je: " + rezultat);
	
	
	
	
	
	
	}

}
