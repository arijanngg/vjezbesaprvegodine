package meow;

import java.util.Scanner;

public class petizadatak {

	public static void main(String[] args) {
		/* pronaci poziciju poslednjeg razmaka u stringu pretrazujuci od kraja stringa npr za unijeto :
		 * Pera ima djevojku rezultat je 8. */

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesi string");
		String tekst = sc.nextLine();
		
		int pozicija = tekst.lastIndexOf(" ");
		
				
		System.out.println("Pozicija poslednjeg razmaka je :" + pozicija);
		
	}

}
