package ponovnevjezbe;

import java.util.Scanner;

public class dvadeset {

	public static void main(String[] args) {

		/*Lozinka je jaka ako je njena dužina najmanje 8 simbola, i sadrži mala slova, velika slova
i cifre. Nacrtati algoritam (napisati program) koji provjerava da li je lozinka jaka. Ulaz:
Unosi se jedna riječ, dužine ne veće od 100, koja sadrži mala i velika slova i cifre. Izlaz:
Štampati YES ili NO.*/
		
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Unesi lozinku");
		String lozinka = sc.nextLine();
		
		boolean imaMalo = false;
        boolean imaVeliko = false;
        boolean imaCifru = false;
        
        if ( lozinka.length() > 8) {
        	
        	for (int i = 0; i <lozinka.length(); i ++) {
        		
        		char c = lozinka.charAt(i);
        		
        	if (c >= 'a' && c <= 'z') {
        		
        		imaMalo = true;
        		
        	}else if (c>= 'A' && c<= 'Z') {
        		
        		imaVeliko= true;
        		
        		
        	}else if (c>= '0' && c<= '9') {
        		
        		imaCifru = true;
        	}else {
        		
        		imaCifru=false;
        		}
        		
     
         		
         		imaVeliko = false;
         	}
   imaMalo = false;     	
        
        }
        	
        if (imaVeliko && imaMalo && imaCifru) {
        	
        	System.out.println("NO");
        	
        }else {
        	
        	System.out.println("Yes");
        }
		
		
		
		
		
		
		
	}

}
