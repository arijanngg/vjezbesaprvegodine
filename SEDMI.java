package vjezbazaispit;

import java.util.Scanner;

public class SEDMI {

	public static void main(String[] args) {

		//   Skicirati algoritam (napisati program) koji obrađuje dvocifreni broj na sledećinačin:
		// Ako je prva cifra veća od druge štampati razliku prve i druge cifre
		// Ako je prva cifra manja od druge štampati zbir te dvije cifre
		// Ako su cifre iste štampati njihov proizvod
		
		
		Scanner sc = new Scanner ( System.in);
		System.out.println("unesi dvocifren broj");	
		String dvocifrenbroj = sc.nextLine();
		
		
		int prvacifra = dvocifrenbroj.charAt(0) - '0';
		int drugacifra = dvocifrenbroj.charAt(1) - '0';
		
		
		if (prvacifra > drugacifra ) {
		
			System.out.println("Razlika cifri je " + (prvacifra - drugacifra));
		} else if (prvacifra ==drugacifra )		 {
			
			System.out.println("Proizvod cifri je " + (prvacifra*drugacifra));
			
		}else {
			
			System.out.println("Zbir cifri je " + (prvacifra + drugacifra));
			
		}
		
		
		
		
		
		
		
	}

}
