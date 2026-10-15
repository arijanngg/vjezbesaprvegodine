package ponovnevjezbe;

import java.util.Scanner;

public class OSMI {

	public static void main(String[] args) {
	
		// Skicirati algoritam (napisati program) koji obrađuje dvocifreni broj na sledećinačin:
		// Ako je prva cifra veća od druge štampati razliku prve i druge cifre
		// Ako je prva cifra manja od druge štampati zbir te dvije cifre
		// Ako su cifre iste štampati njihov proizvod
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Unesite dvocifren broj");
		int dvocifrenbroj = sc.nextInt();
		
		
		int a = dvocifrenbroj %10;
		int b = dvocifrenbroj /10;
		
		
		if (a>b) {
			
			System.out.println("razlika prvog i drugog broja je : " + (a - b));
			
		}else if (a < b) {
			
			System.out.println("Zbir prve i druge cifre je : " + (a + b));
			
		} else {
			
			System.out.println("Proizvod cifri je " + (a*b) );
			
		}
		
		
		
		
		
		
		

	}

}
