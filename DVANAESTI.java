package vjezbazaispit;

import java.util.Scanner;

import jdk.internal.org.jline.terminal.TerminalBuilder.SystemOutput;

public class DVANAESTI {

	public static void main(String[] args) {

		
		// Korisnik unosi brojeve.
		// Program sabira sve unesene brojeve dok korisnik ne unese 0.
		// Na kraju ispisati zbir.
		
		
		

		Scanner sc = new Scanner ( System.in);
		
		System.out.println(" Unesite brojeve ako zelite da zaustavite ukucajte 0");
		int broj = sc.nextInt();
		int zbirunesenih = 0;
		
		while (broj > 0 ) {
			
			zbirunesenih += broj;
		}
				System.out.println("");
		
		
	}

}
