package ponovnevjezbe;

import java.util.Scanner;

public class dvadesetsedam {

	public static void main(String[] args) {
		
		//Napisati program koji zamjenjuje sva pojavljivanja jednog slova drugim. Primjer: banana,

		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Unesi string");
		String string = sc.nextLine();
		
		System.out.println("Unesi slovo koje se mijenja");
		
		char slovo = sc.next().charAt(0);
		
		System.out.println("Unesi slovo u koje mijenjas");
		char novoslovo = sc.next().charAt(0);
		
		
		String novistring= "";
		
		
		
		for (int i = 0; i <string.length(); i++) {
			
			char c = string.charAt(i);
			
			if (c == slovo) {
				
				novistring += novoslovo;
				
				
			}else {
				
				novistring += c;
			}
			
		}
		
		System.out.println("Novi string je : " + novistring);
		

	}

}
