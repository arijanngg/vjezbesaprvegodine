package meow;

import java.util.Scanner;

public class petirealzadatak {

	public static void main(String[] args) {
		/*Za 4 grada poznat je broj stanovnika. naci proosjek*/
		
		Scanner sc = new Scanner (System.in);
		System.out.println("unesite broj stanovnika za grad 1");
		int grad1 = sc.nextInt();
		System.out.println("unesite broj stanovnika za grad 2");
		int grad2 = sc.nextInt();
		System.out.println("Unesite broj stanovnika za grad 3");
		int grad3 = sc.nextInt();
		System.out.println("Unesite broj stanovnika za grad 4");
		int grad4= sc.nextInt();
		
		
		int prosjek = (grad1 + grad2 + grad3 + grad4)/ 4;
		
		System.out.printf("Prosjek stanovnika je %d", prosjek);

	}

}
