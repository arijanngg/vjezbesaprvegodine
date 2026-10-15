package VjezbaZaIspit;

import java.util.Scanner;

public class jedanaesti {

	public static void main(String[] args) {
		// Pronaći indeksnu poziciju poslednjeg razmaka u stringu,
		// pretražujući od kraja stringa. Npr. za
		// unijeto 'Pera ima devojku', rezultat je 8.
	
	Scanner unos = new Scanner (System.in);
	String tekst = unos.next();
	boolean indikatorrazmaka = false ;
	
	
	int indekskraja = tekst.length() - 1;
	
	while (indekskraja >= 0 && !indikatorrazmaka) {
		
		if (tekst.charAt(indekskraja) == ' ') {
			
			indikatorrazmaka = true;
			
		}
		indekskraja++;
		
	}
	if (indikatorrazmaka = false ) {
		
		System.out.println("poslednji razmak je na poziciji : " + indekskraja);
	}else {
		System.out.println(" u stringu nema razmakaa");
		
	}
	
	
	
	
	
	
	
	}

}
